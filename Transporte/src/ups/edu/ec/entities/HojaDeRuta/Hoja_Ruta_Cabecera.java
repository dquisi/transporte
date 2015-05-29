/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.HojaDeRuta;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author Julio Martinez
 */
@Entity
@Table(name = "TRA_HOJA_RUTA_CABECERA")
@SequenceGenerator(name = "TRA_HOJA_RUTA_CABECERA_SEQ", sequenceName = "TRA_HOJA_RUTA_CABECERA_SEQ", initialValue = 1, allocationSize = 1)
public class Hoja_Ruta_Cabecera extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_HOJA_RUTA_CABECERA_SEQ")
    @Column(name="HRC_ID_PK")
    private Long hrc_id_pk;

    @Column(name="HRC_NUMERO")    
    private Long hrc_numero;

    @Temporal(TemporalType.DATE)
    @Column(name="HRC_FECHA")
    private Date hrc_fecha;

    @Column(name="HRC_PROPIETARIO")    
    private String hrc_propietario;

    @Column(name="HRC_RUTA")    
    private String hrc_ruta;

    @Column(name="HRC_COBRO_RUTA")        
    private double hrc_cobroRuta;

    @Column(name="HRC_COBRO_CUENCA")    
    private double hrc_cobroCuenca;
    
    @Column(name="HRC_FLETE_PAGADO")        
    private double hrc_fletePagado;
    
    @Column(name="HRC_TOTAL_PAGAR")        
    private double hrc_totalPagar;

    @Column(name="HRC_PORCENTAJE")    
    private double hrc_porcentaje;
    
    //FALTA FOREING KEY DE PERSONAS

    public Long getHrc_id_pk() {
        return hrc_id_pk;
    }

    public void setHrc_id_pk(Long hrc_id_pk) {
        this.hrc_id_pk = hrc_id_pk;
    }

    public Long getHrc_numero() {
        return hrc_numero;
    }

    public void setHrc_numero(Long hrc_numero) {
        this.hrc_numero = hrc_numero;
    }

    public Date getHrc_fecha() {
        return hrc_fecha;
    }

    public void setHrc_fecha(Date hrc_fecha) {
        this.hrc_fecha = hrc_fecha;
    }

    public String getHrc_propietario() {
        return hrc_propietario;
    }

    public void setHrc_propietario(String hrc_propietario) {
        this.hrc_propietario = hrc_propietario;
    }

    public String getHrc_ruta() {
        return hrc_ruta;
    }

    public void setHrc_ruta(String hrc_ruta) {
        this.hrc_ruta = hrc_ruta;
    }

    public double getHrc_cobroRuta() {
        return hrc_cobroRuta;
    }

    public void setHrc_cobroRuta(double hrc_cobroRuta) {
        this.hrc_cobroRuta = hrc_cobroRuta;
    }

    public double getHrc_cobroCuenca() {
        return hrc_cobroCuenca;
    }

    public void setHrc_cobroCuenca(double hrc_cobroCuenca) {
        this.hrc_cobroCuenca = hrc_cobroCuenca;
    }

    public double getHrc_fletePagado() {
        return hrc_fletePagado;
    }

    public void setHrc_fletePagado(double hrc_fletePagado) {
        this.hrc_fletePagado = hrc_fletePagado;
    }

    public double getHrc_totalPagar() {
        return hrc_totalPagar;
    }

    public void setHrc_totalPagar(double hrc_totalPagar) {
        this.hrc_totalPagar = hrc_totalPagar;
    }

    public double getHrc_porcentaje() {
        return hrc_porcentaje;
    }

    public void setHrc_porcentaje(double hrc_porcentaje) {
        this.hrc_porcentaje = hrc_porcentaje;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrc_id_pk != null ? hrc_id_pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the hrc_id fields are not set
        if (!(object instanceof Hoja_Ruta_Cabecera)) {
            return false;
        }
        Hoja_Ruta_Cabecera other = (Hoja_Ruta_Cabecera) object;
        if ((this.hrc_id_pk == null && other.hrc_id_pk != null) || (this.hrc_id_pk != null && !this.hrc_id_pk.equals(other.hrc_id_pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.HojaDeRuta.Hoja_Ruta_Cabecera[ hrc_id=" + hrc_id_pk + " ]";
    }
    
}
