package com.corto2.jpa.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Personas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    @Column(name = "names", length = 150, nullable = false)
    private String nombres;

    @Column(name = "last_names", length = 150, nullable = false)
    private String apellidos;

    @Column(name = "birthdate", nullable = false)
    private String fecha_nacimiento;

    @Column(name = "sex")
    private Character sexo ;

    @Column(name = "cellphone")
    private String celular;

    @Column(name = "address")
    private String direccion;    

    @OneToMany(mappedBy = "personas",  cascade = { CascadeType.REMOVE, CascadeType.MERGE })
    private List<Miembro> miembro;

    @OneToMany(mappedBy = "personas",  cascade = { CascadeType.REMOVE, CascadeType.MERGE })
    private List<Entrenador> entrenador;

    public Personas() {
    }

    public Personas(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Miembro> getMiembro() {
        return miembro;
    }

    public void setMiembro(List<Miembro> miembro) {
        this.miembro = miembro;
    }

    public List<Entrenador> getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(List<Entrenador> entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Personas [id=" + id + "]";
    }

    
}
