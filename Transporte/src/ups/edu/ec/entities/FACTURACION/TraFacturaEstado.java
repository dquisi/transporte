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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author carlitosc
 */

// TABLA: TRA_FACTURA_ESTADO
@Entity
@Table(name = "TRA_FACTURA_ESTADO")
@SequenceGenerator(name = "TRA_FACTURA_ESTADO_SEQ", sequenceName = "TRA_FACTURA_ESTADO_SEQ", initialValue = 1, allocationSize = 1)

public class TraFacturaEstado extends TraAuditoria implements Serializable {
    // Atributos mapeados con su respectivo nombre
    // para la creacion de campos de la BD
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_FACTURA_ESTADO_SEQ")
    @Column(name = "FES_ID", nullable = false, unique = true)
    private Long traFacturaEstID;

    @Column(name = "FES_DESCRIPCION", nullable = false, length = 50)
    private String traFacturaEstDescripcion;

    public String getTraFacturaEstDescripcion() {
        return traFacturaEstDescripcion;
    }

    public void setTraFacturaEstDescripcion(String traFacturaEstDescripcion) {
        this.traFacturaEstDescripcion = traFacturaEstDescripcion;
    }
    
    public Long getTraFacturaEstID() {
        return traFacturaEstID;
    }

    public void setTraFacturaEstID(Long traFacturaEstID) {
        this.traFacturaEstID = traFacturaEstID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traFacturaEstID != null ? traFacturaEstID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the traFacturaEstID fields are not set
        if (!(object instanceof TraFacturaEstado)) {
            return false;
        }
        TraFacturaEstado other = (TraFacturaEstado) object;
        if ((this.traFacturaEstID == null && other.traFacturaEstID != null) || (this.traFacturaEstID != null && !this.traFacturaEstID.equals(other.traFacturaEstID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.FACTURACION.TraFacturaEstados[ id=" + traFacturaEstID + " ]";
    }
    
}
