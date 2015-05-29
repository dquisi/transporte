/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.FACTURACION;

import ups.edu.ec.entities.Abstract.TraAuditoria;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author carlitosc
 */

// TABLA: TRA_FACTURA_TIPO_PAGO_COBRO
@Entity
@Table(name = "TRA_FACTURA_TIPO_PAGO_COBRO")
@SequenceGenerator(name = "TRA_FACTURA_TIPO_PAGO_COBRO_SEQ", sequenceName = "TRA_FACTURA_TIPO_PAGO_COBRO_SEQ", initialValue = 1, allocationSize = 1)

public class TraFacturaTipoPagoCobro extends TraAuditoria implements Serializable {
    // Atributos mapeados con su respectivo nombre
    // para la creacion de campos de la BD
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_FACTURA_TIPO_PAGO_COBRO_SEQ")
    @Column(name = "TPCO_ID_PK", nullable = false, unique = true)
    private Long traFacturaTipPagCoID;

    @Column(name = "TPCO_DESCRIPCION", nullable = false, length = 100)
    private String traFacturaTipPagCoDesc;
    
    // Relaciones PRIMARY KEY
    // Relacion FacturaTipoPagoCobro_FacturaCabecera
    @OneToMany(mappedBy = "TPCO_FCA_FK", fetch = FetchType.LAZY)
    public List<TraFacturaCabecera> traFacturaCabeceraList;
    
    public String getTraFacturaTipPagCoDesc() {
        return traFacturaTipPagCoDesc;
    }

    /*public List<TraFacturaCabecera> getTraFacturaCabeceraList() {
        return traFacturaCabeceraList;
    }

    public void setTraFacturaCabeceraList(List<TraFacturaCabecera> traFacturaCabeceraList) {
        this.traFacturaCabeceraList = traFacturaCabeceraList;
    }*/

    public void setTraFacturaTipPagCoDesc(String traFacturaTipPagCoDesc) {
        this.traFacturaTipPagCoDesc = traFacturaTipPagCoDesc;
    }
    
    public Long getTraFacturaTipPagCoID() {
        return traFacturaTipPagCoID;
    }

    public void setTraFacturaTipPagCoID(Long traFacturaTipPagCoID) {
        this.traFacturaTipPagCoID = traFacturaTipPagCoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traFacturaTipPagCoID != null ? traFacturaTipPagCoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the traFacturaTipPagCoID fields are not set
        if (!(object instanceof TraFacturaTipoPagoCobro)) {
            return false;
        }
        TraFacturaTipoPagoCobro other = (TraFacturaTipoPagoCobro) object;
        if ((this.traFacturaTipPagCoID == null && other.traFacturaTipPagCoID != null) || (this.traFacturaTipPagCoID != null && !this.traFacturaTipPagCoID.equals(other.traFacturaTipPagCoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.FACTURACION.TraFacturaTipoPagoCobro[ id=" + traFacturaTipPagCoID + " ]";
    }
    
}
