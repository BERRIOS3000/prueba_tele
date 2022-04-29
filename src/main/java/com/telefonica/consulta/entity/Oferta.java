package com.telefonica.consulta.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name="oferta")
public class Oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //codigo_oferta
    @Column(name="codigo_oferta")
    private String codigoOferta;
    @Column(name="descripcion_oferta")
    private String descripcionOferta;
    @Column(name="fecha_inicio")
    private Date fechaInicio;
    @Column(name="fecha_fin")
    private Date fechaFin;

    @JoinColumn(name = "fk_oferta_linea_movil1", nullable = false)
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private LineaMovil lineaMovil;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigoOferta() {
        return codigoOferta;
    }
    public void setCodigoOferta(String codigoOferta) {
        this.codigoOferta = codigoOferta;
    }
    public String getDescripcionOferta() {
        return descripcionOferta;
    }
    public void setDescripcionOferta(String descripcionOferta) {
        this.descripcionOferta = descripcionOferta;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public LineaMovil getLineaMovil() {
        return lineaMovil;
    }
    public void setLineaMovil(LineaMovil lineaMovil) {
        this.lineaMovil = lineaMovil;
    }
    
    

}
