package com.isfortech.Models;

import javax.persistence.*;

import lombok.*;


@Entity
@Table(name = "canales")
@Getter
@Setter
public class CanalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String Nombre;
    private Integer producto_id;
    private Integer horario_id;

   


}
