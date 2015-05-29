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
@SequenceGenerator(name = "tra_usuario_seq", sequenceName = "tra_usuario_seq", initialValue = 1, allocationSize = 1)
@Table(name="TRA_USUARIO")
public class TraUsuario implements Serializable {
   // public static final String TRA_PERMISO_SEQ = "TRA_PERMISO_ID";
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_usuario_seq")
    @Column(name="USU_ID")
    private Long idUsuario;
    @Column(name="USU_USUARIO", unique =true,nullable =false)
    private String nombreUsuario;
    @Column(name="USU_CLAVE",nullable =false)
    private String claveUsuario;
    
    //RELACION DE UNO A MUCHOS <USUARIO A USUARIOROL>
    @OneToMany(mappedBy="usuario",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<TraUsuarioRol> usuarioRolList;
    

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public List<TraUsuarioRol> getUsuarioRolList() {
        return usuarioRolList;
    }

    public void setUsuarioRolList(List<TraUsuarioRol> usuarioRolList) {
        this.usuarioRolList = usuarioRolList;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idUsuario fields are not set
        if (!(object instanceof TraUsuario)) {
            return false;
        }
        TraUsuario other = (TraUsuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.security.mains.entities.Usuario[ id=" + idUsuario + " ]";
    }
    
}
