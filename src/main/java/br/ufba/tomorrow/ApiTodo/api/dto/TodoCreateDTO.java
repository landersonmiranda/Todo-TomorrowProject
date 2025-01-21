package br.ufba.tomorrow.ApiTodo.api.dto;

import br.ufba.tomorrow.ApiTodo.domain.entities.Estado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

public class TodoCreateDTO {
    private long idUsu;
    private String item;
    private LocalDate prazo;
    private Estado estado;

    public long getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(long idUsu) {
        this.idUsu = idUsu;
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
        this.estado = estado;
    }
}
