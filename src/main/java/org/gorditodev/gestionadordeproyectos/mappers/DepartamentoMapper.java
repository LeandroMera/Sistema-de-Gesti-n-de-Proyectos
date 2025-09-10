package org.gorditodev.gestionadordeproyectos.mappers;

import org.apache.ibatis.annotations.*;
import org.gorditodev.gestionadordeproyectos.model.Departamento;

import java.util.List;

@Mapper
public interface DepartamentoMapper {

    @Insert("INSERT INTO Departamento (nombre,ubicacion) VALUES (#{nombre}, #{ubicacion})")
    void insertDepartamento(Departamento departamento);

    @Select("SELECT * FROM Departamento WHERE id = #{id}")
    Departamento getDepartamentoById(int id);

    @Select("SELECT * FROM Departamento")
    List<Departamento>  getAllDepartamento();

    @Update("UPDATE Departamento SET nombre = #{nombre}, ubicacion = #{ubicacion} WHERE id = #{id}" )
    void updateDepartamento(Departamento departamento);

    @Delete("DELETE FROM Departamento WHERE id = #{id} ")
    void deleteDepartamento(int id);
}
