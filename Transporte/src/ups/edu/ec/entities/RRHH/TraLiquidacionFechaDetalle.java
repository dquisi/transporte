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
import ups.edu.ec.entities.Abstract.TraAuditoria;

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRA_LIQUIDACION_FECHA_DETALLE")
@SequenceGenerator(name = "TRA_LFD_SEQ",sequenceName = "TRA_LFD_SEQ",initialValue = 1,allocationSize = 1)

public class TraLiquidacionFechaDetalle extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "TRA_LFD_SEQ")
    @Column(name = "LFCD_ID_PK",insertable = false,unique = true)
    private Long lfdId;
    
    @Column(name = "LFD_FECHA")
    @Temporal(TemporalType.DATE)
    private Date lfdFecha;
    
    @Column(name = "LFD_NUM_GUIA",precision = 100)
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
    
    @Column(name = "LFD_DESCUENTO1",length = 5)
    private String lfdDescuento1;
    
    @Column(name = "LFD_DESCUENTO2",length = 5)
    private String lfdDescuento2;
    
    //Relacion
    @JoinColumn(name = "LFC_ID_PK", referencedColumnName = "LFC_ID_PK")
    @ManyToOne(fetch = FetchType.LAZY)

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lfdId != null ? lfdId.hashCode() : 0);
        return hash;
    }

    public void setLfdId(Long lfdId) {
        this.lfdId = lfdId;
    }

    public void setLfdFecha(Date lfdFecha) {
        this.lfdFecha = lfdFecha;
    }

    public void setLfdNumGuia(double lfdNumGuia) {
        this.lfdNumGuia = lfdNumGuia;
    }

    public void setLfdPago(double lfdPago) {
        this.lfdPago = lfdPago;
    }

    public void setLfdCobroRuta(double lfdCobroRuta) {
        this.lfdCobroRuta = lfdCobroRuta;
    }

    public void setLfdNumCuenca(double lfdNumCuenca) {
        this.lfdNumCuenca = lfdNumCuenca;
    }

    public void setLfdToatlFlete(double lfdToatlFlete) {
        this.lfdToatlFlete = lfdToatlFlete;
    }

    public void setLfdPorcentaje1512(double lfdPorcentaje1512) {
        this.lfdPorcentaje1512 = lfdPorcentaje1512;
    }

    public void setLfdTotalLiquidacion(double lfdTotalLiquidacion) {
        this.lfdTotalLiquidacion = lfdTotalLiquidacion;
    }

    public void setLfdRetencionPor(double lfdRetencionPor) {
        this.lfdRetencionPor = lfdRetencionPor;
    }

    public void setLfdLiquidacion1(double lfdLiquidacion1) {
        this.lfdLiquidacion1 = lfdLiquidacion1;
    }

    public void setLfdLiquidacion2(double lfdLiquidacion2) {
        this.lfdLiquidacion2 = lfdLiquidacion2;
    }

    public void setLfdDescuento1(String lfdDescuento1) {
        this.lfdDescuento1 = lfdDescuento1;
    }

    public void setLfdDescuento2(String lfdDescuento2) {
        this.lfdDescuento2 = lfdDescuento2;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLfdId() {
        return lfdId;
    }

    public Date getLfdFecha() {
        return lfdFecha;
    }

    public double getLfdNumGuia() {
        return lfdNumGuia;
    }

    public double getLfdPago() {
        return lfdPago;
    }

    public double getLfdCobroRuta() {
        return lfdCobroRuta;
    }

    public double getLfdNumCuenca() {
        return lfdNumCuenca;
    }

    public double getLfdToatlFlete() {
        return lfdToatlFlete;
    }

    public double getLfdPorcentaje1512() {
        return lfdPorcentaje1512;
    }

    public double getLfdTotalLiquidacion() {
        return lfdTotalLiquidacion;
    }

    public double getLfdRetencionPor() {
        return lfdRetencionPor;
    }

    public double getLfdLiquidacion1() {
        return lfdLiquidacion1;
    }

    public double getLfdLiquidacion2() {
        return lfdLiquidacion2;
    }

    public String getLfdDescuento1() {
        return lfdDescuento1;
    }

    public String getLfdDescuento2() {
        return lfdDescuento2;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraLiquidacionFechaDetalle)) {
            return false;
        }
        TraLiquidacionFechaDetalle other = (TraLiquidacionFechaDetalle) object;
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
