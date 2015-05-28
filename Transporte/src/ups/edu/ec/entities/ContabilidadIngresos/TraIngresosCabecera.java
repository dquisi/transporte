/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.ContabilidadIngresos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "TRA_INGRESO_CABECERA")
@SequenceGenerator(name = "TRA_INGRESO_CABECERA_SEQ",sequenceName = "TRA_INGRESO_CABECERA_SEQ", initialValue = 1,allocationSize = 1)
public class TraIngresosCabecera implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_INGRESO_CABECERA_SEQ")
    @Column(name = "ICA_ID", nullable = false)
    private Long id;
    @Column(name = "ICA_NUMERO")
    private int numeroIngreso;
    @Column(name = "ICA_FECHA")
    @Temporal (TemporalType.DATE)
    private Date fecha;
    @Column(name = "ICA_CODIGO", length = 50)
    private String codigoIngreso;
    @Column(name = "ICA_CODAGE", length = 50)
    private String codage;
    @Column(name = "ICA_RETENCION_IVA")
    private double retencionIva;
    @Column(name = "ICA_RETENCION_FUENTE")
    private double retencionFuente;
    @Column(name = "ICA_TOTAL")
    private double total;
    @Column(name = "ICA_TOTAL_RECAUDADO")
    private double totalRecaudado; 
    @Column(name = "ICA_AGENTE", length = 100)
    private String agente; 
    @Column(name = "ICA_CAJA", length = 100)
    private String caja;
    @Column(name = "ICA_NUMERO_DEPOSITO", length = 100)
    private String numeroDeposito;
    @Column(name = "ICA_USUARIO", length = 100)
    private String usuario;
    @Column(name = "ICA_FECHA_INGRESO")
    @Temporal (TemporalType.DATE)
    private Date fechaIngreso;
    @Column(name = "ICA_ESTADO", length = 100)
    private String estado;
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumeroIngreso() {
        return numeroIngreso;
    }

    public void setNumeroIngreso(int numeroIngreso) {
        this.numeroIngreso = numeroIngreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodigoIngreso() {
        return codigoIngreso;
    }

    public void setCodigoIngreso(String codigoIngreso) {
        this.codigoIngreso = codigoIngreso;
    }

    public String getCodage() {
        return codage;
    }

    public void setCodage(String codage) {
        this.codage = codage;
    }

    public double getRetencionIva() {
        return retencionIva;
    }

    public void setRetencionIva(double retencionIva) {
        this.retencionIva = retencionIva;
    }

    public double getRetencionFuente() {
        return retencionFuente;
    }

    public void setRetencionFuente(double retencionFuente) {
        this.retencionFuente = retencionFuente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public String getAgente() {
        return agente;
    }

    public void setAgente(String agente) {
        this.agente = agente;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getNumeroDeposito() {
        return numeroDeposito;
    }

    public void setNumeroDeposito(String numeroDeposito) {
        this.numeroDeposito = numeroDeposito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraIngresosCabecera)) {
            return false;
        }
        TraIngresosCabecera other = (TraIngresosCabecera) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.ContabilidadIngresos.Ingreso[ id=" + id + " ]";
    }
    
}
