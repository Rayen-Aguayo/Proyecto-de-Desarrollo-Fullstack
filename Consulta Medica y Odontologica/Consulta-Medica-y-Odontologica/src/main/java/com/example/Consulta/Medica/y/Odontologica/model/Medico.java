package com.example.Consulta.Medica.y.Odontologica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medico")
public class Medico {
    @Id
    private Integer edad;
    private String run;
    private Integer telefono;
    private String especialidad;
}
