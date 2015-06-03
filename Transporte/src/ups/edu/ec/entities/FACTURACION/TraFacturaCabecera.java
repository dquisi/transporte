/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.FACTURACION;

import ups.edu.ec.entities.Abstract.TraAuditoria;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
 * @author carlitosc
 */

// TABLA: TRA_FACTURA_CABECERA
@Entity
@Table(name = "TRA_FACTURA_CABECERA")
@SequenceGenerator(name = "TRA_FACTURA_CABECERA_SEQ", sequenceName = "TRA_FACTURA_CABECERA_SEQ", initialValue = 1, allocationSize = 1)

public class TraFacturaCabecera extends TraAuditoria implements Serializable {
    // Atributos mapeados con su respectivo nombre
    // para la creacion de campos de la BD
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_FACTURA_CABECERA_SEQ")
    @Column(name = "FCA_ID_PK", nullable = false, unique = true)
    private Long traFacturaCabID;

    @Temporal(TemporalType.DATE)
    @Column(name = "FCA_FECHA")
    private Date traFacturaCabFecha;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "FCA_FECHA_FAC")
    private Date traFacturaCabFecha2;
    
    @Column(name = "FCA_DESTINATARIO" , length = 100)
    private String traFacturaCabDestinatario;
    
    @Column(name = "FCA_DIRECCION", length = 200)
    private String traFacturaCabDireccion;
    
    @Column(name = "FCA_REMITENTE", length = 100)
    private String traFacturaCabRemitente;
    
    @Column(name = "FCA_RUC", nullable = false, unique = true, length = 15)
    private String traFacturaCabRuc;
    
    @Column(name = "FCA_TELEFONO", length = 100)
    private String traFacturaCabTelefono;
    
    @Column(name = "FCA_CONDICION", length = 100)
    private String traFacturaCabCondicion;
    
    @Column(name = "FCA_NGUIA_REMITENTE")
    private int traFacturaCabNGuiaRemitente;
    
    @Column(name = "FCA_NUMERO", nullable = false)
    private Long traFacturaCabNumero;
    
    @Column(name = "FCA_SUBTOTAL", precision = 10, scale = 2)
    private Long traFacturaCabSubtotal;
    
    @Column(name = "FCA_TOTAL_CON_IVA", precision = 10, scale = 2)
    private Long traFacTotalConIVA;
    
    @Column(name = "FCA_USUARIO", length = 100)
    private String traFacturaCabUsuario;
    
    @Column(name = "FCA_ESTADO", nullable = false, length = 100)
    private String traFacturaCabEstado;
    
    @Column(name = "FCA_CONCEPTO", length = 200)
    private String traFacturaCabConcepto;

    // Relaciones PRIMARY KEY
    // Relacion FacturaCabecera_FacturaDetalle
    @OneToMany(mappedBy = "FCA_FDE_FK", fetch = FetchType.LAZY)
    public List<TraFacturaDetalle> traFacturaDetalleList;
    
    // Relacion FacturaCabecera_FacturaEstado
    @OneToMany(mappedBy = "FCA_FES_FK", fetch = FetchType.LAZY)
    public List<TraFacturaEstado> traFacturaEstadoList;
    ///
    // Relaciones FOREIGN KEY
    // Foreign_Key TipoPagoCobro_FacturaCabecera
    @ManyToOne
    @JoinColumn(name = "TPCO_ID_PK", referencedColumnName = "TPCO_ID_PK")
    private TraFacturaTipoPagoCobro TPCO_FCA_FK;
    
    // Foreign_key FacturaIvas_FacturaCabecera
    @ManyToOne
    @JoinColumn(name = "FIV_ID_PK", referencedColumnName = "FIV_ID_PK")
    private TraFacturaIvas FIV_FCA_FK;

    public List<TraFacturaDetalle> getTraFacturaDetalleList() {
        return traFacturaDetalleList;
    }

    public void setTraFacturaDetalleList(List<TraFacturaDetalle> traFacturaDetalleList) {
        this.traFacturaDetalleList = traFacturaDetalleList;
    }

    public List<TraFacturaEstado> getTraFacturaEstadoList() {
        return traFacturaEstadoList;
    }

    public void setTraFacturaEstadoList(List<TraFacturaEstado> traFacturaEstadoList) {
        this.traFacturaEstadoList = traFacturaEstadoList;
    }

    public TraFacturaTipoPagoCobro getTPCO_FCA_FK() {
        return TPCO_FCA_FK;
    }

    public void setTPCO_FCA_FK(TraFacturaTipoPagoCobro TPCO_FCA_FK) {
        this.TPCO_FCA_FK = TPCO_FCA_FK;
    }

    public TraFacturaIvas getFIV_FCA_FK() {
        return FIV_FCA_FK;
    }

    public void setFIV_FCA_FK(TraFacturaIvas FIV_FCA_FK) {
        this.FIV_FCA_FK = FIV_FCA_FK;
    }
    
    public Date getTraFacturaCabFecha() {
        return traFacturaCabFecha;
    }

    public void setTraFacturaCabFecha(Date traFacturaCabFecha) {
        this.traFacturaCabFecha = traFacturaCabFecha;
    }

    public Date getTraFacturaCabFecha2() {
        return traFacturaCabFecha2;
    }

    public void setTraFacturaCabFecha2(Date traFacturaCabFecha2) {
        this.traFacturaCabFecha2 = traFacturaCabFecha2;
    }

    public String getTraFacturaCabDestinatario() {
        return traFacturaCabDestinatario;
    }

    public void setTraFacturaCabDestinatario(String traFacturaCabDestinatario) {
        this.traFacturaCabDestinatario = traFacturaCabDestinatario;
    }

    public String getTraFacturaCabDireccion() {
        return traFacturaCabDireccion;
    }

    public void setTraFacturaCabDireccion(String traFacturaCabDireccion) {
        this.traFacturaCabDireccion = traFacturaCabDireccion;
    }

    public String getTraFacturaCabRemitente() {
        return traFacturaCabRemitente;
    }

    public void setTraFacturaCabRemitente(String traFacturaCabRemitente) {
        this.traFacturaCabRemitente = traFacturaCabRemitente;
    }

    public String getTraFacturaCabRuc() {
        return traFacturaCabRuc;
    }

    public void setTraFacturaCabRuc(String traFacturaCabRuc) {
        this.traFacturaCabRuc = traFacturaCabRuc;
    }

    public String getTraFacturaCabTelefono() {
        return traFacturaCabTelefono;
    }

    public void setTraFacturaCabTelefono(String traFacturaCabTelefono) {
        this.traFacturaCabTelefono = traFacturaCabTelefono;
    }

    public String getTraFacturaCabCondicion() {
        return traFacturaCabCondicion;
    }

    public void setTraFacturaCabCondicion(String traFacturaCabCondicion) {
        this.traFacturaCabCondicion = traFacturaCabCondicion;
    }

    public int getTraFacturaCabNGuiaRemitente() {
        return traFacturaCabNGuiaRemitente;
    }

    public void setTraFacturaCabNGuiaRemitente(int traFacturaCabNGuiaRemitente) {
        this.traFacturaCabNGuiaRemitente = traFacturaCabNGuiaRemitente;
    }

    public Long getTraFacturaCabNumero() {
        return traFacturaCabNumero;
    }

    public void setTraFacturaCabNumero(Long traFacturaCabNumero) {
        this.traFacturaCabNumero = traFacturaCabNumero;
    }

    public Long getTraFacturaCabSubtotal() {
        return traFacturaCabSubtotal;
    }

    public void setTraFacturaCabSubtotal(Long traFacturaCabSubtotal) {
        this.traFacturaCabSubtotal = traFacturaCabSubtotal;
    }

    public Long getTraFacTotalConIVA() {
        return traFacTotalConIVA;
    }

    public void setTraFacTotalConIVA(Long traFacTotalConIVA) {
        this.traFacTotalConIVA = traFacTotalConIVA;
    }

    public String getTraFacturaCabUsuario() {
        return traFacturaCabUsuario;
    }

    public void setTraFacturaCabUsuario(String traFacturaCabUsuario) {
        this.traFacturaCabUsuario = traFacturaCabUsuario;
    }

    public String getTraFacturaCabEstado() {
        return traFacturaCabEstado;
    }

    public void setTraFacturaCabEstado(String traFacturaCabEstado) {
        this.traFacturaCabEstado = traFacturaCabEstado;
    }

    public String getTraFacturaCabConcepto() {
        return traFacturaCabConcepto;
    }

    public void setTraFacturaCabConcepto(String traFacturaCabConcepto) {
        this.traFacturaCabConcepto = traFacturaCabConcepto;
    }
    
    public Long getTraFacturaCabID() {
        return traFacturaCabID;
    }

    public void setTraFacturaCabID(Long traFacturaCabID) {
        this.traFacturaCabID = traFacturaCabID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (traFacturaCabID != null ? traFacturaCabID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the traFacturaCabID fields are not set
        if (!(object instanceof TraFacturaCabecera)) {
            return false;
        }
        TraFacturaCabecera other = (TraFacturaCabecera) object;
        if ((this.traFacturaCabID == null && other.traFacturaCabID != null) || (this.traFacturaCabID != null && !this.traFacturaCabID.equals(other.traFacturaCabID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.FACTURACION.TraFacturaCabecera[ id=" + traFacturaCabID + " ]";
    }
    
}
