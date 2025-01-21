package br.ufba.tomorrow.ApiTodo.api.dto;

import br.ufba.tomorrow.ApiTodo.domain.entities.Estado;

import java.time.LocalDate;
import java.util.Objects;

public class TodoUpdateDTO {
    private long id;
    private String item;
    private LocalDate prazo;
    private Estado estado;
    private LocalDate conclusao;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoUpdateDTO that)) return false;
        return getId() == that.getId() && Objects.equals(getItem(), that.getItem()) && Objects.equals(getPrazo(), that.getPrazo()) && getEstado() == that.getEstado() && Objects.equals(getConclusao(), that.getConclusao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getItem(), getPrazo(), getEstado(), getConclusao());
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
        this.estado = estado;
    }

    public LocalDate getConclusao() {
        return conclusao;
    }

    public void setConclusao(LocalDate conclusao) {
        this.conclusao = conclusao;
    }
}
