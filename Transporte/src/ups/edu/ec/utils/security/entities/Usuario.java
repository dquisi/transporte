/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils.security.entities;

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
@SequenceGenerator(name = Usuario.USUARIO_SEQUENCE_NAME, sequenceName = Usuario.USUARIO_SEQUENCE_NAME, initialValue = 1,
allocationSize = 200)
@Table(name="USUARIO")
public class Usuario implements Serializable {
    public static final String USUARIO_SEQUENCE_NAME = "USUARIO_SEQUENCE_ID";
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = USUARIO_SEQUENCE_NAME)
    @Column(name="USR_CODIGO")
    private Long usrCodigo;
    @Column(name="USR_USUARIO", unique =true,nullable =false)
    private String usrUsuario;
    @Column(name="USR_CLAVE",nullable =false)
    private String usrClave;
    
    @OneToMany(mappedBy="usuario",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<UsuarioRol> usuarioRolList;
    

    public Long getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(Long usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrUsuario() {
        return usrUsuario;
    }

    public void setUsrUsuario(String usrUsuario) {
        this.usrUsuario = usrUsuario;
    }

    public String getUsrClave() {
        return usrClave;
    }

    public void setUsrClave(String usrClave) {
        this.usrClave = usrClave;
    }

    public List<UsuarioRol> getUsuarioRolList() {
        return usuarioRolList;
    }

    public void setUsuarioRolList(List<UsuarioRol> usuarioRolList) {
        this.usuarioRolList = usuarioRolList;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrCodigo != null ? usrCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the usrCodigo fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usrCodigo == null && other.usrCodigo != null) || (this.usrCodigo != null && !this.usrCodigo.equals(other.usrCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.security.mains.entities.Usuario[ id=" + usrCodigo + " ]";
    }
    
}
