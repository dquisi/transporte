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
@SequenceGenerator(name = "tra_rol_seq", sequenceName = "tra_rol_seq", initialValue = 1, allocationSize = 1)
@Table(name="TRA_ROL")
public class TraRol implements Serializable {
   // public static final String TRA_ROL_SEQ = "TRA_ROL_ID";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_rol_seq")
    @Column(name="ROL_ID")
    private Long rolId;
    @Column(name="ROL_DESCRIPCION",unique =true,nullable =false)
    private String rolDescripción;
    
    //RELACION DE UNO A MUCHOS <ROL A USUARIOROL>
    @OneToMany(mappedBy="rol",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<TraUsuarioRol> usuarioRol;

    //RELACION DE UNO A MUCHOS DE <ROL A PERMISO>
    @OneToMany(mappedBy="tranRol",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<TraPermiso> PermisoList;
    
    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getRolDescripción() {
        return rolDescripción;
    }

    public void setRolDescripción(String rolDescripción) {
        this.rolDescripción = rolDescripción;
    }

    public List<TraUsuarioRol> getUsuarioRol() {
        return usuarioRol;
    }

    public void setUsuarioRol(List<TraUsuarioRol> usuarioRol) {
        this.usuarioRol = usuarioRol;
    }

    public List<TraPermiso> getPermisoList() {
        return PermisoList;
    }

    public void setPermisoList(List<TraPermiso> PermisoList) {
        this.PermisoList = PermisoList;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolId != null ? rolId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the rolId fields are not set
        if (!(object instanceof TraRol)) {
            return false;
        }
        TraRol other = (TraRol) object;
        if ((this.rolId == null && other.rolId != null) || (this.rolId != null && !this.rolId.equals(other.rolId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.utils.security.entities.Rol[ id=" + rolId + " ]";
    }
    
}
