/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.RRHH;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRAN_LIQUIDACION_FECHA_DETALLE")
@SequenceGenerator(name = "TRAN_LFD_SEQ",sequenceName = "TRAN_LFD_SEQ",initialValue = 1,allocationSize = 1)
public class TRAN_LIQUIDACION_FECHA_DETALLE implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "TRAN_LFD_SEQ")
    @Column(name = "LFCD_ID")
    private Long lfdId;
    @Column(name = "LFD_FECHA")
    @Temporal(TemporalType.DATE)
    private Date lfdFecha;
    @Column(name = "LFD_NUM_GUIA")
    private double lfdNumGuia;
    @Column(name = "LFD_PAGO",precision = 10,scale = 2)
    private double lfdPago;
    @Column(name = "LFD_COBRO_RUTA",precision = 10,scale = 2)
    private double lfdCobroRuta;
    @Column(name = "LFD_COBRO_CUENCA",precision = 10,scale = 2)
    private double lfdNumCuenca;
    @Column(name = "LFD_TOTAL_FLETE",precision = 10,scale = 2)
    private double lfdToatlFlete;
    @Column(name = "LFD_PORCENTAJE_15O12",precision = 10,scale = 2)
    private double lfdPorcentaje1512;
    @Column(name = "LFD_TOTAL_LIQUIDACION",precision = 10,scale = 2)
    private double lfdTotalLiquidacion;
    @Column(name = "LFD_RETENCION_PORCENTAJE",precision = 10,scale = 2)
    private double lfdRetencionPor;
    @Column(name = "LFD_LIQUIDACION1",precision = 10,scale = 2)
    private double lfdLiquidacion1;
    @Column(name = "LFD_LIQUIDACION2",precision = 10,scale = 2)
    private double lfdLiquidacion2;
    @Column(name = "LFD_DESCUENTO1")
    private String lfdDescuento1;
    @Column(name = "LFD_DESCUENTO2")
    private String lfdDescuento2;
    //Relacion
    @JoinColumn(name = "LFC_ID", referencedColumnName = "LFC_ID")
    @ManyToOne(fetch = FetchType.LAZY)

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lfdId != null ? lfdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TRAN_LIQUIDACION_FECHA_DETALLE)) {
            return false;
        }
        TRAN_LIQUIDACION_FECHA_DETALLE other = (TRAN_LIQUIDACION_FECHA_DETALLE) object;
        if ((this.lfdId == null && other.lfdId != null) || (this.lfdId != null && !this.lfdId.equals(other.lfdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.RRHH.TRAN_LIQUIDACION_FECHA[ id=" + lfdId + " ]";
    }
    
}
