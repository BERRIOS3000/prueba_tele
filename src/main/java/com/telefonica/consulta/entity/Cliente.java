package com.telefonica.consulta.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    //codigo_oferta
    @Column(name="nombre_completo")
    private String nombreCompleto;
    @Column(name="tipo_documento")
    private String tipoDocumento;
    @Column(name="numero_documento")
    private String numeroDocumento;
    @Column(name="fecha_nacimiento")
    private Date fechaNacimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")

    private List<LineaMovil> lineaMoviles;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public List<LineaMovil> getLineaMoviles() {
        return lineaMoviles;
    }
    public void setLineaMoviles(List<LineaMovil> lineaMoviles) {
        this.lineaMoviles = lineaMoviles;
    }
 


  
}
