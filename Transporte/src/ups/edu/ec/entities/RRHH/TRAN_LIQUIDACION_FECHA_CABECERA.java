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

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRAN_LIQUIDACION_FECHA_CABECERA")
@SequenceGenerator(name = "TRAN_LFC_SEQ",sequenceName = "TRAN_LFC_SEQ",initialValue = 1,allocationSize = 1)       
public class TRAN_LIQUIDACION_FECHA_CABECERA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRAN_LFC_SEQ")
    @Column(name = "LFC_ID")
    private Long lfcId;
    @Column(name = "LFC_FECHA")
    @Temporal(TemporalType.DATE)
    private Date lfcFecha;
    @Column(name = "LFC_FECHA_ACT")
    @Temporal(TemporalType.DATE)
    private Date lfcFechaAct;
    @Column(name = "LFC_PERSONA")
    private String lfcPersona;
    @Column(name = "LFC_NUMERO")
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
    @Column(name = "LFC_ESTADO")
    private String lfcEstado;
    //Relacion
    @OneToMany(mappedBy = "LFC_ID", fetch = FetchType.LAZY)

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lfcId != null ? lfcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TRAN_LIQUIDACION_FECHA_CABECERA)) {
            return false;
        }
        TRAN_LIQUIDACION_FECHA_CABECERA other = (TRAN_LIQUIDACION_FECHA_CABECERA) object;
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
