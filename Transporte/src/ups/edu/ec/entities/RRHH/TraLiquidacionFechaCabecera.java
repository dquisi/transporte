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
import javax.persistence.OneToMany;
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
@Table(name = "TRA_LIQUIDACION_FECHA_CABECERA")
@SequenceGenerator(name = "TRA_LFC_SEQ",sequenceName = "TRA_LFC_SEQ",initialValue = 1,allocationSize = 1)       

public class TraLiquidacionFechaCabecera extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRA_LFC_SEQ")
    @Column(name = "LFC_ID_PK",insertable = false,unique = true)
    private Long lfcId;
    
    @Column(name = "LFC_FECHA")
    @Temporal(TemporalType.DATE)
    private Date lfcFecha;
    
    @Column(name = "LFC_FECHA_ACT")
    @Temporal(TemporalType.DATE)
    private Date lfcFechaAct;
    
    @Column(name = "LFC_PERSONA",length = 300)
    private String lfcPersona;
    @Column(name = "LFC_NUMERO",precision = 10)
    private int lfcNumero;
    
    @Column(name = "LFC_SALDO_COBRADO",precision = 10, scale = 2)
    private double lfcSaldoCob;
    
    @Column(name = "LFC_SALDO_PAGADO",precision = 10, scale = 2)
    private double lfcSaldoPag;
    
    @Column(name = "LFC_TOTAL_FLETE",precision = 10, scale = 2)
    private double lfcTotalFlete;        
    
    @Column(name = "LFC_RETENCION",precision = 10, scale = 2)
    private double lfcRetencion;
    
    @Column(name = "LFC_COBRO_RUTA",precision = 10, scale = 2)
    private double lfcCobroRut;
    
    @Column(name = "LFC_COBRO_CUENCA",precision = 10, scale = 2)
    private double lfcCobroCuenca;
    
    @Column(name = "LFC_TOTAL_PAGO",precision = 10, scale = 2)
    private double lfcTotalPag;
    
    @Column(name = "LFC_LIDUIDACION1",precision = 8, scale = 2)
    private double lfcLiquidacion1;
    
    @Column(name = "LFC_LIDUIDACION2",precision = 8, scale = 2)
    private double lfcLiquidacion2;
    
    @Column(name = "LFC_DESCUENTO1",precision = 8, scale = 2)
    private String lfcDescuento1;
    
    @Column(name = "LFC_DESCUENTO2",precision = 8, scale = 2)
    private String lfcDescuento2;
    
    @Column(name = "LFC_ESTADO",length = 10)
    private String lfcEstado;
    
    //Relacion
    @OneToMany(mappedBy = "LFC_ID_PK", fetch = FetchType.LAZY)

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lfcId != null ? lfcId.hashCode() : 0);
        return hash;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLfcId() {
        return lfcId;
    }

    public Date getLfcFecha() {
        return lfcFecha;
    }

    public Date getLfcFechaAct() {
        return lfcFechaAct;
    }

    public String getLfcPersona() {
        return lfcPersona;
    }

    public int getLfcNumero() {
        return lfcNumero;
    }

    public double getLfcSaldoCob() {
        return lfcSaldoCob;
    }

    public double getLfcSaldoPag() {
        return lfcSaldoPag;
    }

    public double getLfcTotalFlete() {
        return lfcTotalFlete;
    }

    public double getLfcRetencion() {
        return lfcRetencion;
    }

    public double getLfcCobroRut() {
        return lfcCobroRut;
    }

    public double getLfcCobroCuenca() {
        return lfcCobroCuenca;
    }

    public double getLfcTotalPag() {
        return lfcTotalPag;
    }

    public double getLfcLiquidacion1() {
        return lfcLiquidacion1;
    }

    public double getLfcLiquidacion2() {
        return lfcLiquidacion2;
    }

    public String getLfcDescuento1() {
        return lfcDescuento1;
    }

    public String getLfcDescuento2() {
        return lfcDescuento2;
    }

    public String getLfcEstado() {
        return lfcEstado;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraLiquidacionFechaCabecera)) {
            return false;
        }
        TraLiquidacionFechaCabecera other = (TraLiquidacionFechaCabecera) object;
        if ((this.lfcId == null && other.lfcId != null) || (this.lfcId != null && !this.lfcId.equals(other.lfcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.RRHH.TRAN_LIQUIDACION[ id=" + lfcId + " ]";
    }
    
}
