/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.FACTURACION;

import ups.edu.ec.entities.Abstract.TraAuditoria;
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
 * @author carlitosc
 */

// TABLA: TRA_FACTURA_DETALLE
@Entity
@Table(name = "TRA_FACTURA_DETALLE")
@SequenceGenerator(name = "TRA_FACTURA_DETALLE_SEQ", sequenceName = "TRA_FACTURA_DETALLE_SEQ", initialValue = 1, allocationSize = 1)

public class TraFacturaDetalle  extends TraAuditoria implements Serializable {
    // Atributos mapeados con su respectivo nombre
    // para la creacion de campos de la BD
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_FACTURA_DETALLE_SEQ")
    @Column(name = "FDE_ID", nullable = false, unique = true)
    private Long traFacturaDetID;
    
    @Column(name = "FDE_DESCRIPCION", length = 200)
    private String traFacturaDetDescripcion;
    
    @Column(name = "FDE_CANTIDAD", nullable = false)
    private int traFacturaDetCantidad;
    
    @Column(name = "FDE_VAL_UNITARIO", nullable = false, precision = 10, scale = 2)
    private Long traFacturaDetValUni;
    
    @Column(name = "FDE_VAL_TOTAL", precision = 10 , scale = 2)
    private Long traFacturaDetValTot;

    // Relaciones FOREIGN KEY
    // Foreign_Key FacturaCabecera_FacturaDetalle
    @ManyToOne
    @JoinColumn(name = "FCA_ID_PK", referencedColumnName = "FCA_ID_PK")
    private TraFacturaCabecera FCA_FDE_FK;

    public TraFacturaCabecera getFCA_FDE_FK() {
        return FCA_FDE_FK;
    }

    public void setFCA_FDE_FK(TraFacturaCabecera FCA_FDE_FK) {
        this.FCA_FDE_FK = FCA_FDE_FK;
    }
    
    public String getTraFacturaDetDescripcion() {
        return traFacturaDetDescripcion;
    }

    public void setTraFacturaDetDescripcion(String traFacturaDetDescripcion) {
        this.traFacturaDetDescripcion = traFacturaDetDescripcion;
    }

    public int getTraFacturaDetCantidad() {
        return traFacturaDetCantidad;
    }

    public void setTraFacturaDetCantidad(int traFacturaDetCantidad) {
        this.traFacturaDetCantidad = traFacturaDetCantidad;
    }

    public Long getTraFacturaDetValUni() {
        return traFacturaDetValUni;
    }

    public void setTraFacturaDetValUni(Long traFacturaDetValUni) {
        this.traFacturaDetValUni = traFacturaDetValUni;
    }

    public Long getTraFacturaDetValTot() {
        return traFacturaDetValTot;
    }

    public void setTraFacturaDetValTot(Long traFacturaDetValTot) {
        this.traFacturaDetValTot = traFacturaDetValTot;
    }

    public Long getTraFacturaDetID() {
        return traFacturaDetID;
    }

    public void setTraFacturaDetID(Long traFacturaDetID) {
        this.traFacturaDetID = traFacturaDetID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traFacturaDetID != null ? traFacturaDetID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the traFacturaDetID fields are not set
        if (!(object instanceof TraFacturaDetalle)) {
            return false;
        }
        TraFacturaDetalle other = (TraFacturaDetalle) object;
        if ((this.traFacturaDetID == null && other.traFacturaDetID != null) || (this.traFacturaDetID != null && !this.traFacturaDetID.equals(other.traFacturaDetID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.FACTURACION.TraFacturaDetalle[ id=" + traFacturaDetID + " ]";
    }
    
}
