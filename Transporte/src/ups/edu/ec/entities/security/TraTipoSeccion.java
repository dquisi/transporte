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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author asissistemas
 */
@Entity
@Table(name="TRA_TIPO_SECCION")
@SequenceGenerator(name = "tra_tipo_seccion_seq", sequenceName = "tra_tipo_seccion_seq", initialValue = 1, allocationSize = 1)
public class TraTipoSeccion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_tipo_seccion_seq")
    @Column(name="TIS_ID")
    private Long tisId;
    @Column(name="TIS_DESCRIPCION")
    private String tisDescripcion;
    @Column(name="TIS_NIVEL")
    private String tisNivel;
    
    //RELACION DE UNO A MUCHOS <TIPOSECCION A SECCION>
    @OneToMany(mappedBy="tranTipoSeccion",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<TraSeccion> seccionList;
    
   
    public Long getTisId() {
        return tisId;
    }

    public void setTisId(Long tisId) {
        this.tisId = tisId;
    }

    public String getTisDescripcion() {
        return tisDescripcion;
    }

    public void setTisDescripcion(String tisDescripcion) {
        this.tisDescripcion = tisDescripcion;
    }

    public String getTisNivel() {
        return tisNivel;
    }

    public void setTisNivel(String tisNivel) {
        this.tisNivel = tisNivel;
    }

    public List<TraSeccion> getSeccionList() {
        return seccionList;
    }

    public void setSeccionList(List<TraSeccion> seccionList) {
        this.seccionList = seccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tisId != null ? tisId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TraTipoSeccion)) {
            return false;
        }
        TraTipoSeccion other = (TraTipoSeccion) object;
        if ((this.tisId == null && other.tisId != null) || (this.tisId != null && !this.tisId.equals(other.tisId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entites.security.TranTipoSeccion[ id=" + tisId + " ]";
    }
    
}
