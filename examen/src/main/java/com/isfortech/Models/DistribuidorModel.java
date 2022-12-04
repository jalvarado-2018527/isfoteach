package com.isfortech.Models;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "distribuidores")
public class DistribuidorModel {   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String nombre;
    private String cNotificacion;
    private String cAlertas;
    private Integer usuario_id;
    

}
