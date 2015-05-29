/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.security;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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

/**
 *
 * @author asissistemas
 */
@Entity
@SequenceGenerator(name = "tra_seccion_seq", sequenceName = "tra_seccion_seq", initialValue = 1, allocationSize = 1)
@Table(name="TRA_SECCION")
public class TraSeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_seccion_seq")
    @Column(name="SEC_ID")
    private Long secId;
    @Column(name="SEC_DESCRIPCION")
    private String secDescripcion;
    @Column(name="SEC_NOMBRE_CLAVE")
    private String secNombreClave;
    @Column(name="SEC_ETIQUETA")
    private String secEtiqueta;
    @Column(name="SEC_ORDEN")
    private Integer secOrden;
    @Column(name="SEC_RUTA")
    private String secRuta;
    @Column(name="SEC_PAGINA")
    private String secPagina;
    
//REALACION DE MUCHOS A UNO <SECCION A TIPOSECCION>
    @ManyToOne
    @JoinColumn(name="TIS_ID")
    private TraTipoSeccion tranTipoSeccion;
    
//RELACION DE UNO A MUCHOS <SECCION A PERMISO>
    @OneToMany(mappedBy="tranSeccion",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<TraPermiso> permisoList;

//RELACION DE UNO A UNO
    

  
    public Long getSecId() {
        return secId;
    }

    public void setSecId(Long secId) {
        this.secId = secId;
    }

    public String getSecDescripcion() {
        return secDescripcion;
    }

    public void setSecDescripcion(String secDescripcion) {
        this.secDescripcion = secDescripcion;
    }

    public String getSecNombreClave() {
        return secNombreClave;
    }

    public void setSecNombreClave(String secNombreClave) {
        this.secNombreClave = secNombreClave;
    }

    public String getSecEtiqueta() {
        return secEtiqueta;
    }

    public void setSecEtiqueta(String secEtiqueta) {
        this.secEtiqueta = secEtiqueta;
    }

    public Integer getSecOrden() {
        return secOrden;
    }

    public void setSecOrden(Integer secOrden) {
        this.secOrden = secOrden;
    }

    public String getSecRuta() {
        return secRuta;
    }

    public void setSecRuta(String secRuta) {
        this.secRuta = secRuta;
    }

    public String getSecPagina() {
        return secPagina;
    }

    public void setSecPagina(String secPagina) {
        this.secPagina = secPagina;
    }

    public TraTipoSeccion getTranTipoSeccion() {
        return tranTipoSeccion;
    }

    public void setTranTipoSeccion(TraTipoSeccion tranTipoSeccion) {
        this.tranTipoSeccion = tranTipoSeccion;
    }

    public List<TraPermiso> getPermisoList() {
        return permisoList;
    }

    public void setPermisoList(List<TraPermiso> permisoList) {
        this.permisoList = permisoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (secId != null ? secId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the secId fields are not set
        if (!(object instanceof TraSeccion)) {
            return false;
        }
        TraSeccion other = (TraSeccion) object;
        if ((this.secId == null && other.secId != null) || (this.secId != null && !this.secId.equals(other.secId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entites.security.TranSeccion[ id=" + secId + " ]";
    }
    
}
