package com.corto2.jpa.Entities;



import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="coach")
public class Entrenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hired_date", nullable = false)
    private Date fecha_contrado;

    @Column(name = "training_type", nullable = false)
    private String tipo_entrenamiento; //define el tipo de entrenamiento que imparte como: fuerza, masa, etc.

    @Column(name = "description")
    private String descripcion; //describe el perfil del entrenador.

    @JoinColumn(name="id_person")
    @ManyToOne()
    private Personas personas;

    public Entrenador() {
        
    }

    public Entrenador(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_contrado() {
        return fecha_contrado;
    }

    public void setFecha_contrado(Date fecha_contrado) {
        this.fecha_contrado = fecha_contrado;
    }

    public String getTipo_entrenamiento() {
        return tipo_entrenamiento;
    }

    public void setTipo_entrenamiento(String tipo_entrenamiento) {
        this.tipo_entrenamiento = tipo_entrenamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    
}
