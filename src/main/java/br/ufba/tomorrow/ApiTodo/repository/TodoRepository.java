package br.ufba.tomorrow.ApiTodo.repository;

import br.ufba.tomorrow.ApiTodo.domain.entities.Estado;
import br.ufba.tomorrow.ApiTodo.domain.entities.Todo;
import br.ufba.tomorrow.ApiTodo.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    public Todo save(Todo t);
    public List<Todo> findByUsuario(Usuario usu);
    public List<Todo> findByUsuarioAndEstado(Usuario usu, Estado estado);

    public Todo findById(long id);

}
