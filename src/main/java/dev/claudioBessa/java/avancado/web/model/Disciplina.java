package dev.claudioBessa.java.avancado.web.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
public class Disciplina {

    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

    private String descricao;

    private Integer cargaHoraria;

}
