/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.RRHH;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRAN_LIQUIDACION_DETALLE")
@SequenceGenerator(name = "TRAN_LDE_SEQ",sequenceName = "TRAN_LDE_SEQ",initialValue = 1,allocationSize = 1)
public class TRAN_LIQUIDACION_DETALLE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRAN_LDE_SEQ")
    @Column(name = "LDE_ID")
    private Long ldeId;
    @Column(name = "LDE_SUBTOTAL",precision = 10,scale = 2)
    private double ldeSubtotal;
    @Column(name = "LDE_TOTAL",precision = 10,scale = 2)
    private double ldeTotal;
    @Column(name = "LDE_ID_LIQ")
    private String ldeIdLiq;
    //Realacion
    @JoinColumn(name = "LCA_ID", referencedColumnName = "LCA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ldeId != null ? ldeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the ldeId fields are not set
        if (!(object instanceof TRAN_LIQUIDACION_DETALLE)) {
            return false;
        }
        TRAN_LIQUIDACION_DETALLE other = (TRAN_LIQUIDACION_DETALLE) object;
        if ((this.ldeId == null && other.ldeId != null) || (this.ldeId != null && !this.ldeId.equals(other.ldeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.RRHH.TRAN_LIQUIDACION_DETALLE[ id=" + ldeId + " ]";
    }
    
}
