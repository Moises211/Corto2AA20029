package com.corto2.jpa.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_class")
    private String nombre_clase;

    @Column(name = "description")
    private String descripcion;

    @ManyToMany
    @JoinTable(name =  "members_class", joinColumns = @JoinColumn(name="id_class"), inverseJoinColumns = @JoinColumn(name="id_member"))
    private List<Miembro> miembros;
    
    public Clase(Integer id) {
        this.id = id;
    }

    public Clase() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(List<Miembro> miembros) {
        this.miembros = miembros;
    }

    
}
