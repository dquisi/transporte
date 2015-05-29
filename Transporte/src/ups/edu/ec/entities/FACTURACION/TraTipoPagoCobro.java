/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.FACTURACION;

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
@Table(name = "TRA_TIPO_PAGO_COBRO")
@SequenceGenerator(name = "TRA_TIPO_PAGO_COBRO_SEQ", sequenceName = "TRA_TIPO_PAGO_COBRO_SEQ", initialValue = 1, allocationSize = 1)

public class TraTipoPagoCobro implements Serializable {
    // Atributos mapeados con su respectivo nombre
    // para la creacion de campos de la BD
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_TIPO_PAGO_COBRO_SEQ")
    @Column(name = "TPCO_ID_PK", nullable = false, unique = true)
    private Long traTipPagCoID;

    @Column(name = "TPCO_DESCRIPCION", nullable = false, length = 100)
    private String traTipPagCoDesc;
    
    // Relaciones PRIMARY KEY
    // Relacion TipoPagoCobro_FacturaCabecera
    @OneToMany(mappedBy = "TPCO_ID_PK", fetch = FetchType.LAZY)
    public List<TraFacturaCabecera> traFacturaCabeceraList;

    public String getTraTipPagCoDesc() {
        return traTipPagCoDesc;
    }

    public List<TraFacturaCabecera> getTraFacturaCabeceraList() {
        return traFacturaCabeceraList;
    }

    public void setTraFacturaCabeceraList(List<TraFacturaCabecera> traFacturaCabeceraList) {
        this.traFacturaCabeceraList = traFacturaCabeceraList;
    }

    public void setTraTipPagCoDesc(String traTipPagCoDesc) {
        this.traTipPagCoDesc = traTipPagCoDesc;
    }
    
    public Long getTraTipPagCoID() {
        return traTipPagCoID;
    }

    public void setTraTipPagCoID(Long traTipPagCoID) {
        this.traTipPagCoID = traTipPagCoID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traTipPagCoID != null ? traTipPagCoID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the traTipPagCoID fields are not set
        if (!(object instanceof TraTipoPagoCobro)) {
            return false;
        }
        TraTipoPagoCobro other = (TraTipoPagoCobro) object;
        if ((this.traTipPagCoID == null && other.traTipPagCoID != null) || (this.traTipPagCoID != null && !this.traTipPagCoID.equals(other.traTipPagCoID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.FACTURACION.TraFacturaTipoPagoCobro[ id=" + traTipPagCoID + " ]";
    }
    
}
