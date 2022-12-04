package com.isfortech.Models;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String descripcion;
    private int monto;
    private Integer distribuidores_id;
    
    


}
