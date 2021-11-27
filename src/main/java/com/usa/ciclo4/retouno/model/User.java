package com.usa.ciclo4.retouno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data// Crea getters & Setters
@NoArgsConstructor //
@AllArgsConstructor //contructor con argumentos
@Entity//spring datajpa, es una identidad, un modelo implementado a nivel de base de datos(referencia a la tabla de la bd)
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String name;
}

