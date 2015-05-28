/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.ContabilidadEgresos;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "TRA_COMPROBANTE_EGRESO_CABECERA")
@SequenceGenerator(name = "TRA_COMPROBANTE_EGRESO_CABECERA",sequenceName = "TRA_COMPROBANTE_EGRESO_CABECERA_SEQ", initialValue = 1,allocationSize = 1)
public class TraComprobanteCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_COMPROBANTE_EGRESO_CABECERA_SEQ")
    @Column(name = "CEC_ID", nullable = false)
    private Long id;
    @Column(name = "CEC_FECHA")
    @Temporal (TemporalType.DATE)
    private Date fecha;
    @Column(name = "CEC_NUMERO_CHEQUE",length = 100)
    private String numCheque;
    @Column(name = "CEC_NUMERO")
    private int numeroEgreso;
    @Column(name = "CEC_SON",length = 100)
    private String son;
    @Column(name = "CEC_VALOR")
    private double valor;
    @Column(name = "CEC_OBSERVACIONES",length = 100)
    private String observaciones;
    @Column(name = "CEC_USUARIO", length = 100)
    private String usuario;
    @Column(name = "CEC_FECHAS")
    @Temporal (TemporalType.DATE)
    private Date fechas;
    @Column(name = "CEC_ESTADO", length = 100)
    private String estado;
               

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroEgreso() {
        return numeroEgreso;
    }

    public void setNumeroEgreso(int numeroEgreso) {
        this.numeroEgreso = numeroEgreso;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechas() {
        return fechas;
    }

    public void setFechas(Date fechas) {
        this.fechas = fechas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

        
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraComprobanteCabecera)) {
            return false;
        }
        TraComprobanteCabecera other = (TraComprobanteCabecera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.ContabilidadEgresos.TraComprobanteCabecera[ id=" + id + " ]";
    }
    
}
