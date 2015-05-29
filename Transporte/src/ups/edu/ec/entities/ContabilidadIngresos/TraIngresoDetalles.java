/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.ContabilidadIngresos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "TRA_INGRESO_DETALLE")
@SequenceGenerator(name = "TRA_INGRESO_DETALLE_SEQ",sequenceName = "TRA_INGRESO_DETALLE_SEQ", initialValue = 1,allocationSize = 1)

public class TraIngresoDetalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_INGRESO_DETALLE_SEQ")
    @Column(name = "IDE_ID", nullable = false)
    private Long id;
    @Column(name = "ICA_ANT")
    private String ant;
    @Column(name = "ICA_ABO")
    private String abo;
    @Column(name = "ICA_CAN")
    private String can;
    @Column(name = "ICA_FECHA")
    @Temporal (TemporalType.DATE)
    private Date fecha;
    @Column(name = "ICA_NUMERO")
    private int numero;
    @Column(name = "ICA_VALOR")
    private double valor;
    @Column(name = "ICA_RECAUDADO")
    private double recaudado;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnt() {
        return ant;
    }

    public void setAnt(String ant) {
        this.ant = ant;
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo;
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getRecaudado() {
        return recaudado;
    }

    public void setRecaudado(double recaudado) {
        this.recaudado = recaudado;
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
        if (!(object instanceof TraIngresoDetalles)) {
            return false;
        }
        TraIngresoDetalles other = (TraIngresoDetalles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.ContabilidadIngresos.TraIngresoDetalles[ id=" + id + " ]";
    }
    
}
