package com.corto2.jpa.Entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name =  "member")
public class Miembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "incription_date", nullable = false)
    private Date fecha_inscripcion;

    @Column(name = "height")
    private Double altura;

    @JoinColumn(name="id_person")
    @ManyToOne()
    private Personas personas;

    @ManyToMany(mappedBy = "miembros")
    private List<Clase> clase;

    

    public Miembro() {
    }

    public Miembro(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(Date fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public List<Clase> getClase() {
        return clase;
    }

    public void setClase(List<Clase> clase) {
        this.clase = clase;
    }

    
}
