package com.lalferez.springcloud.msvcusuarios.models.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
//Lombok
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nombre;

    @Column(unique = true)
    private String email;

    private String password;


}
