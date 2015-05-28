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
@Table(name = "TRAN_LIQUIDACION_CABECERA")
@SequenceGenerator(name = "TRAN_LCA_SEQ",sequenceName = "TRAN_LCA_SEQ",initialValue = 1,allocationSize = 1)

public class TranLiquidacionCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRAN_LCA_SEQ")
    @Column(name = "LCA_ID")
    private Long lcaId;
    @Column(name = "LCA_SENORES")
    private String lcaSenores;
    @Column(name = "LCA_DIRECCION")
    private String lcaDireccion;
    @Column(name = "LCA_FECHA_EMISION")
    @Temporal(TemporalType.DATE)
    private Date lcaFechaE;
    @Column(name = "LCA_USUARIO")
    private String lcaUsuario;
    @Column(name = "LCA_FECHA")
    @Temporal(TemporalType.DATE)
    private Date lcaFecha;
    @Column(name = "LCA_ESTADDO")
    private String lcaEstado;
    //Relacion liqCabecera_liqDetalle
    @OneToMany(mappedBy = "LCA_ID", fetch = FetchType.LAZY)
    //Relacion liqCabecera_Persona
    @JoinColumn(name = "PER_ID", referencedColumnName = "PER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lcaId != null ? lcaId.hashCode() : 0);
        return hash;
    }

    public void setLcaId(Long lcaId) {
        this.lcaId = lcaId;
    }

    public void setLcaSenores(String lcaSenores) {
        this.lcaSenores = lcaSenores;
    }

    public void setLcaDireccion(String lcaDireccion) {
        this.lcaDireccion = lcaDireccion;
    }

    public void setLcaFechaE(Date lcaFechaE) {
        this.lcaFechaE = lcaFechaE;
    }

    public void setLcaUsuario(String lcaUsuario) {
        this.lcaUsuario = lcaUsuario;
    }

    public void setLcaFecha(Date lcaFecha) {
        this.lcaFecha = lcaFecha;
    }

    public void setLcaEstado(String lcaEstado) {
        this.lcaEstado = lcaEstado;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getLcaId() {
        return lcaId;
    }

    public String getLcaSenores() {
        return lcaSenores;
    }

    public String getLcaDireccion() {
        return lcaDireccion;
    }

    public Date getLcaFechaE() {
        return lcaFechaE;
    }

    public String getLcaUsuario() {
        return lcaUsuario;
    }

    public Date getLcaFecha() {
        return lcaFecha;
    }

    public String getLcaEstado() {
        return lcaEstado;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TranLiquidacionCabecera)) {
            return false;
        }
        TranLiquidacionCabecera other = (TranLiquidacionCabecera) object;
        if ((this.lcaId == null && other.lcaId != null) || (this.lcaId != null && !this.lcaId.equals(other.lcaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.RRHH.TRAN_LIQUIDACION_CABECERA[ id=" + lcaId + " ]";
    }
    
}
