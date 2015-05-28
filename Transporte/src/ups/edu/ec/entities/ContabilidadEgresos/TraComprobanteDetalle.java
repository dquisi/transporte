/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.ContabilidadEgresos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "TRA_COMPROBANTE_EGRESO_DETALLE")
@SequenceGenerator(name = "TRA_COMPROBANTE_EGRESO_DETALLE",sequenceName = "TRA_COMPROBANTE_EGRESO_DETALLE_SEQ", initialValue = 1,allocationSize = 1)
public class TraComprobanteDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_COMPROBANTE_EGRESO_DETALLE_SEQ")
    @Column(name = "CED_ID", nullable = false)
    private Long id;
    @Column(name = "CED_REF", length = 50)
    private String ref;
    @Column(name = "CED_CODIGO_EGRESO", length = 50)
    private String codigoEgreso;
    @Column(name = "CED_CONCEPTO", length = 100)
    private String concepto;
    @Column(name = "CED_ANT")
    private double ant;
    @Column(name = "CED_DESCUENTO")
    private double descuento;
    @Column(name = "CED_PORCENTAJE")
    private double porcentje;
    @Column(name = "CED_DEBE")
    private double debe;
    @Column(name = "CED_HABER")
    private double haber;
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getCodigoEgreso() {
        return codigoEgreso;
    }

    public void setCodigoEgreso(String codigoEgreso) {
        this.codigoEgreso = codigoEgreso;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getAnt() {
        return ant;
    }

    public void setAnt(double ant) {
        this.ant = ant;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPorcentje() {
        return porcentje;
    }

    public void setPorcentje(double porcentje) {
        this.porcentje = porcentje;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

    public double getHaber() {
        return haber;
    }

    public void setHaber(double haber) {
        this.haber = haber;
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
        if (!(object instanceof TraComprobanteDetalle)) {
            return false;
        }
        TraComprobanteDetalle other = (TraComprobanteDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.ContabilidadEgresos.TraComprobanteDetalle[ id=" + id + " ]";
    }
    
}
