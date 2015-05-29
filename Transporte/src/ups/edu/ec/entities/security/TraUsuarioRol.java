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
@SequenceGenerator(name = "tra_usuario_rol_seq", sequenceName = "tra_usuario_rol_seq", initialValue = 1,allocationSize = 1)
@Table(name="TRA_USUARIO_ROL")
public class TraUsuarioRol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_usuario_rol_seq")
    @Column(name="USR_ID")
    private Long usrId;
    
    @ManyToOne
    @JoinColumn(name="USU_ID")
    private TraUsuario usuario;

    @ManyToOne
    @JoinColumn(name="ROL_ID")
    private TraRol rol;
    
    
    
    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public TraUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TraUsuario usuario) {
        this.usuario = usuario;
    }

    public TraRol getRol() {
        return rol;
    }

    public void setRol(TraRol rol) {
        this.rol = rol;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the usrId fields are not set
        if (!(object instanceof TraUsuarioRol)) {
            return false;
        }
        TraUsuarioRol other = (TraUsuarioRol) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.utils.security.entities.UsuarioRol[ id=" + usrId + " ]";
    }
    
}
