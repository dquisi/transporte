/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.utils.security.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author asissistemas
 */
@Entity
@Table(name="USUARIO_ROL")
public class UsuarioRol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USEROL_CODIGO")
    private Long userolCodigo;
    
    @ManyToOne
    @JoinColumn(name="USR_CODIGO")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="ROL_CODIGO")
    private Rol rol;
    
    public Long getUserolCodigo() {
        return userolCodigo;
    }

    public void setUserolCodigo(Long userolCodigo) {
        this.userolCodigo = userolCodigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userolCodigo != null ? userolCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the userolCodigo fields are not set
        if (!(object instanceof UsuarioRol)) {
            return false;
        }
        UsuarioRol other = (UsuarioRol) object;
        if ((this.userolCodigo == null && other.userolCodigo != null) || (this.userolCodigo != null && !this.userolCodigo.equals(other.userolCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.utils.security.entities.UsuarioRol[ id=" + userolCodigo + " ]";
    }
    
}
