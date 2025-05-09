package com.corto2.jpa.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity

public class Membresia {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha_creacion")
    private Date fecha_creacion;

    @Column(name = "activa")
    private Boolean activa;

    @JoinColumn(name="id_member")
    @ManyToOne()
    private Miembro miembro;

    public Membresia(Integer id) {
        this.id = id;
    }

    public Membresia() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Personas getMiembro() {
        return miembro;
    }

    public void setMiembro(Personas miembro) {
        this.miembro = miembro;
    }

    


}
