package br.ufba.tomorrow.ApiTodo.api.dto;

import br.ufba.tomorrow.ApiTodo.domain.entities.Estado;
import br.ufba.tomorrow.ApiTodo.domain.entities.Todo;
import br.ufba.tomorrow.ApiTodo.domain.entities.Usuario;

import java.time.LocalDate;

public class TodoDTO {
    long id;
    private long idUsu;
    String item;
    LocalDate prazo;
    Estado estado;

    public TodoDTO() {
    }

    //pq esse construtor é assim?
    public TodoDTO(Todo todo) {
        this.id = todo.getId();
        this.idUsu = todo.getUsuario().getId();
        this.prazo =  todo.getPrazo();
        this.estado = todo.getEstado();
        this.item = todo.getItem();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        estado = estado;
    }
}
