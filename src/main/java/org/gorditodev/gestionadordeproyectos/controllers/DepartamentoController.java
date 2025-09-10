package org.gorditodev.gestionadordeproyectos.controllers;


import org.gorditodev.gestionadordeproyectos.mappers.DepartamentoMapper;
import org.gorditodev.gestionadordeproyectos.model.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoMapper departamentoMapper;

    @GetMapping("/departamentos")
    public String listarDepartamentos(){
        List<Departamento> departamentos = departamentoMapper.getAllDepartamento();
        return "departamentos/listarDepartamentos";
    }

    @GetMapping("/{id}")
    public String mostrarDetallesDepartamento(@PathVariable int id,  Model model){
        Departamento departamento = departamentoMapper.getDepartamentoById(id);
        model.addAttribute("departamento",departamento);
        return "departamentos/detallesDepartamento";
    }

    @GetMapping("/crear")
    public String mostrarFormularioCreacionDepartamento(Model model){
        model.addAttribute("departamento", new Departamento());
        return "departamento/crearDepartamento";
    }

    @PostMapping("/crear")
    public String crearDepartamento(@ModelAttribute Departamento departamento){
        departamentoMapper.insertDepartamento(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping(("/{id}/editar"))
    public  String mostrarFormularioEdicionDepartamento(@PathVariable int id,  Model model){
     Departamento departamento = departamentoMapper.getDepartamentoById(id);
     model.addAttribute("departamento",departamento);
     return "departamento/editarDepartamento";
    }

    @PostMapping("/{id}/editar")
    public String editarDepartamento(@PathVariable int id,  @ModelAttribute Departamento departamento){
        departamento.setId(id);
        departamentoMapper.updateDepartamento(departamento);
        return "redirect:/departamentos";
    }



}
