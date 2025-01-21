package br.ufba.tomorrow.ApiTodo.api.controllers;


import br.ufba.tomorrow.ApiTodo.api.dto.TodoCreateDTO;
import br.ufba.tomorrow.ApiTodo.api.dto.TodoDTO;
import br.ufba.tomorrow.ApiTodo.api.dto.TodoUpdateDTO;
import br.ufba.tomorrow.ApiTodo.domain.entities.Estado;
import br.ufba.tomorrow.ApiTodo.domain.entities.Todo;
import br.ufba.tomorrow.ApiTodo.domain.services.TodoService;
import br.ufba.tomorrow.ApiTodo.repository.TodoRepository;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    private final TodoService service;
    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<TodoDTO>> listarPorUsuario(@PathVariable long userId){

        return new ResponseEntity<List<TodoDTO>>(service.listarTodosDeUmUsuario(userId), HttpStatus.OK);
    }

    @GetMapping("/{userId}/{estado}")
        public ResponseEntity<List<TodoDTO>> listarPorUsuarioEEstado(@PathVariable long userId, @PathVariable Estado estado){
        return new ResponseEntity<List<TodoDTO>>(service.listarTodosDeUmUsuarioComEstado(userId,estado), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<TodoDTO>criar( @RequestBody TodoCreateDTO todo){
        System.out.println("Recebido: " + todo.getItem());
        return new ResponseEntity<TodoDTO>(service.criar(todo), HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<TodoDTO> alterar(@RequestBody TodoUpdateDTO todo) throws Exception{
        return new ResponseEntity<TodoDTO>(service.alterar(todo), HttpStatus.OK);
    }

    @DeleteMapping("/{todoId}")
    public ResponseEntity<TodoDTO> RemoverTodo(@PathVariable Long todoId){
        try{
            TodoDTO todo = service.remover(todoId);
            return new ResponseEntity<TodoDTO>(todo, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<TodoDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/{todoId}/concluir")
    public ResponseEntity<TodoDTO> concluir(@PathVariable long todoId) {
        try {
            TodoDTO todoConcluido = service.concluir(todoId);
            return new ResponseEntity<>(todoConcluido, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
