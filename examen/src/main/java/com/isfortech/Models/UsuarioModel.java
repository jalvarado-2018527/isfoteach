package com.isfortech.Models;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String nombre;
    private String correo;
    private String telefono;
    
    
    
}
