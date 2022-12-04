package com.isfortech.Models;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "login")
public class LoginModel {
    @Id
    private int id;
    private String nombre;
    private String clave;

}
