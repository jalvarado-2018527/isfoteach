package com.isfortech.Models;

import java.sql.Time;
import java.util.Date;

import javax.persistence.*;
import java.time.LocalTime;
import lombok.*;

@Entity
@Table(name = "horarios")
@Getter
@Setter
public class HorarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalTime hora;
    
    
}
