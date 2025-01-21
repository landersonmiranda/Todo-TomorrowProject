package br.ufba.tomorrow.ApiTodo.repository;

import br.ufba.tomorrow.ApiTodo.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Usuario save(Usuario usuario);
    Usuario findByEmail(String email);

}
