package com.joaomanoel.hotel.model;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author joao.aureliano
 */
    
@Entity
@Table(name = "HOSPEDE")
@SequenceGenerator(name = "HOSPEDE_SEQ", sequenceName = "HOSPEDE_SEQ", allocationSize = 1)
public class Hospede implements Entidade{
    
    @Id
    @Column(name = "ID_HOSPEDE")
    @GeneratedValue(generator = "HOSPEDE_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @OneToMany(targetEntity = Reserva.class, mappedBy = "hospede")
    private List<Reserva> reserva;

    @Column(name = "NOME", length = 100)
    @NotNull(message = "{Hospede.nome.NotNull}")
    @Size(min = 3, max = 100, message = "{Hospede.nome.Size}")
    private String nome;

    @Column(name = "TELEFONE", length = 20)
    @Size(min = 7, max = 20, message = "{Hospede.telefone.Size}")
    private String telefone;
    
    @Column(name = "EMAIL", length = 100)
    @Email(message = "{Hospede.email.Email}")
    @Size(max = 100, message = "{Hospede.email.Size}")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.telefone);
        hash = 37 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospede other = (Hospede) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hospede{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + '}';
    }
}
