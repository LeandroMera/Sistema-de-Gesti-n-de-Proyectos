package org.gorditodev.gestionadordeproyectos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proyecto {

    private int id;
    private String nombre;
    private List<Empleado> empleadosAsignados;

}
