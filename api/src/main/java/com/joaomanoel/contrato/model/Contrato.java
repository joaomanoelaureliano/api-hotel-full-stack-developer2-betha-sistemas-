package com.joaomanoel.contrato.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "CONTRATOS")
@SequenceGenerator(name = "CONTRATOS_SEQ", sequenceName = "CONTRATOS_SEQ", allocationSize = 1)
public class Contrato implements Entidade{

    @Id
    @Column(name = "ID_CONTRATO")
    @GeneratedValue(generator = "CONTRATOS_SEQ", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "DOCUMENTO", length = 30)
    @NotNull(message = "{Contrato.documento.NotNull}")
    @Size(min = 1, max = 29, message = "{Contrato.documento.Size}")
    private String documento;


    @Column(name = "FORNECEDOR", length = 90)
    @NotNull(message = "{Contrato.fornecedor.NotNull}")
    @Size(min = 1, max = 89, message = "{Contrato.fornecedor.Size}")
    private String fornecedor;

    @Column(name = "SERVICO", length = 30)
    @NotNull(message = "{Contrato.servico.NotNull}")
    @Size(min = 1, max = 29, message = "{Contrato.servico.Size}")
    private String servico;

    @Column(name = "UNIDADE", length = 30)
    @NotNull(message = "{Contrato.unidade.NotNull}")
    @Size(min = 1, max = 29, message = "{Contrato.unidade.Size}")
    private String unidade;

    @Column(name = "DIRETORIA", length = 30)
    @NotNull(message = "{Contrato.diretoria.NotNull}")
    @Size(min = 1, max = 29, message = "{Contrato.diretoria.Size}")
    private String diretoria;

    @Column(name = "EMAIL", length = 100)
    @Email(message = "{Contrato.email.Email}")
    @NotNull(message = "{Contrato.email.NotNull}")
    @Size(max = 100, message = "{Contrato.email.Size}")
    private String email;

    @Column(name = "INDICE", length = 50)
    @NotNull(message = "{Contrato.indice.NotNull}")
    @Size(min = 1, max = 49, message = "{Contrato.indice.Size}")
    private String indice;

    @Column(name = "REAJUSTE", length = 80)
    @NotNull(message = "{Contrato.reajuste.NotNull}")
    @Size(min = 1, max = 29, message = "{Contrato.reajuste.Size}")
    private String reajuste;

    @Column(name = "DT_INICIO", length = 20)
    @NotNull(message = "{Contrato.dt_inicio.NotNull}")
    @Size(min = 1, max = 19, message = "{Contrato.dt_inicio.Size}")
    private String dt_inicio;

    @Column(name = "DT_FINAL", length = 20)
    @Size(min = 0, max = 19, message = "{Contrato.dt_final.Size}")
    private String dt_final;

    @Column(name = "LINK", length = 250)
    private String link;

    @Column(name = "OBSERVACOES", length = 250)
    private String observacoes;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(String diretoria) {
        this.diretoria = diretoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public String getReajuste() {
        return reajuste;
    }

    public void setReajuste(String reajuste) {
        this.reajuste = reajuste;
    }

    public String getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(String dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public String getDt_final() {
        return dt_final;
    }

    public void setDt_final(String dt_final) {
        this.dt_final = dt_final;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.documento);
        hash = 97 * hash + Objects.hashCode(this.fornecedor);
        hash = 97 * hash + Objects.hashCode(this.servico);
        hash = 97 * hash + Objects.hashCode(this.unidade);
        hash = 97 * hash + Objects.hashCode(this.diretoria);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.indice);
        hash = 97 * hash + Objects.hashCode(this.reajuste);
        hash = 97 * hash + Objects.hashCode(this.dt_inicio);
        hash = 97 * hash + Objects.hashCode(this.dt_final);
        hash = 97 * hash + Objects.hashCode(this.link);
        hash = 97 * hash + Objects.hashCode(this.observacoes);
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
        final Contrato other = (Contrato) obj;
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        if (!Objects.equals(this.unidade, other.unidade)) {
            return false;
        }
        if (!Objects.equals(this.diretoria, other.diretoria)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.indice, other.indice)) {
            return false;
        }
        if (!Objects.equals(this.reajuste, other.reajuste)) {
            return false;
        }
        if (!Objects.equals(this.dt_inicio, other.dt_inicio)) {
            return false;
        }
        if (!Objects.equals(this.dt_final, other.dt_final)) {
            return false;
        }
        if (!Objects.equals(this.link, other.link)) {
            return false;
        }
        if (!Objects.equals(this.observacoes, other.observacoes)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", documento=" + documento + ", fornecedor=" + fornecedor + ", servico=" + servico + ", unidade=" + unidade + ", diretoria=" + diretoria + ", email=" + email + ", indice=" + indice + ", reajuste=" + reajuste + ", dt_inicio=" + dt_inicio + ", dt_final=" + dt_final + ",link=" + link + ", observacoes=" + observacoes + '}';
    }
}