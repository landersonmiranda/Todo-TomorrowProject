package br.ufba.tomorrow.ApiTodo.api.dto;

import br.ufba.tomorrow.ApiTodo.domain.entities.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class UsuarioCreateDTO {

    @NotEmpty
    @Email(message="O email não é válido!")
    String email;

    @Size(min=5,max=20, message="A senha deve ter entre 5 e 20 caracteres")
    String senha;

    public UsuarioCreateDTO() {
    }

    public UsuarioCreateDTO(Usuario usu) {
        this.email = usu.getEmail();
        this.senha = usu.getSenha();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsuarioCreateDTO that)) return false;
        return Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getSenha(), that.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getSenha());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
