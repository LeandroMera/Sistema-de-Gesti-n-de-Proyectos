package org.gorditodev.gestionadordeproyectos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado {

    private int id;
    private String nombre;
    private String apellido;
    private double salario;
    private Departamento departamento;
    private List<Empleado> proyectos;
}
