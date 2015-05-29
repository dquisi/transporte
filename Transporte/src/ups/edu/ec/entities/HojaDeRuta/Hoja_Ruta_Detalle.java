/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.HojaDeRuta;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import ups.edu.ec.entities.Abstract.TraAuditoria;

/**
 *
 * @author Julio Martinez
 */
@Entity
@Table(name = "TRA_HOJA_RUTA_DETALLE")
@SequenceGenerator(name = "TRA_HOJA_RUTA_DETALLE_SEQ", sequenceName = "TRA_HOJA_RUTA_DETALLE_SEQ", initialValue = 1, allocationSize = 1)
public class Hoja_Ruta_Detalle extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_HOJA_RUTA_DETALLE_SEQ")
    @Column(name="HRD_ID_PK",nullable = false,unique = true)
    private Long hrd_id_pk;
    
    @Column(name="HRD_NUMERO_FACTURA")
    private Long hrd_numeroFactura;

    @Column(name="HRD_CONTENIDO")    
    private String hrd_contenido;

    @Column(name="HRD_REMITENTE")
    private String hrd_remitente;

    @Column(name="HRD_DESTINATARIO")
    private String hrd_destinatario;

    @Column(name="HRD_DESTINO")    
    private String hrd_destino;

    @Column(name="HRD_FLETE_CANCELADO")    
    private String hrd_fletePagado;

    @Column(name="HRD_COBRO_RUTA")    
    private String hrd_cobroRuta;

    @Column(name="HRD_COBRO_CUENCA")    
    private String hrd_cobroCuenca;

    @ManyToOne
    @JoinColumn(name="HRC_HRD_FK")
    private Hoja_Ruta_Cabecera hrc_hrd_fk;
    
    
    public Long getHrd_id_pk() {
        return hrd_id_pk;
    }

    public void setHrd_id_pk(Long hrd_id_pk) {
        this.hrd_id_pk = hrd_id_pk;
    }

    public Long getHrd_numeroFactura() {
        return hrd_numeroFactura;
    }

    public void setHrd_numeroFactura(Long hrd_numeroFactura) {
        this.hrd_numeroFactura = hrd_numeroFactura;
    }

    public String getHrd_contenido() {
        return hrd_contenido;
    }

    public void setHrd_contenido(String hrd_contenido) {
        this.hrd_contenido = hrd_contenido;
    }

    public String getHrd_remitente() {
        return hrd_remitente;
    }

    public void setHrd_remitente(String hrd_remitente) {
        this.hrd_remitente = hrd_remitente;
    }

    public String getHrd_destinatario() {
        return hrd_destinatario;
    }

    public void setHrd_destinatario(String hrd_destinatario) {
        this.hrd_destinatario = hrd_destinatario;
    }

    public String getHrd_destino() {
        return hrd_destino;
    }

    public void setHrd_destino(String hrd_destino) {
        this.hrd_destino = hrd_destino;
    }

    public String getHrd_fletePagado() {
        return hrd_fletePagado;
    }

    public void setHrd_fletePagado(String hrd_fletePagado) {
        this.hrd_fletePagado = hrd_fletePagado;
    }

    public String getHrd_cobroRuta() {
        return hrd_cobroRuta;
    }

    public void setHrd_cobroRuta(String hrd_cobroRuta) {
        this.hrd_cobroRuta = hrd_cobroRuta;
    }

    public String getHrd_cobroCuenca() {
        return hrd_cobroCuenca;
    }

    public void setHrd_cobroCuenca(String hrd_cobroCuenca) {
        this.hrd_cobroCuenca = hrd_cobroCuenca;
    }

    public Hoja_Ruta_Cabecera getHrc_hrd_fk() {
        return hrc_hrd_fk;
    }

    public void setHrc_hrd_fk(Hoja_Ruta_Cabecera hrc_hrd_fk) {
        this.hrc_hrd_fk = hrc_hrd_fk;
    } 
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hrd_id_pk != null ? hrd_id_pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hoja_Ruta_Detalle)) {
            return false;
        }
        Hoja_Ruta_Detalle other = (Hoja_Ruta_Detalle) object;
        if ((this.hrd_id_pk == null && other.hrd_id_pk != null) || (this.hrd_id_pk != null && !this.hrd_id_pk.equals(other.hrd_id_pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.HojaDeRuta.Hoja_Ruta_Detalle[ id=" + hrd_id_pk + " ]";
    }
    
}
