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
import static ups.edu.ec.utils.security.entities.Usuario.USUARIO_SEQUENCE_NAME;

/**
 *
 * @author asissistemas
 */
@Entity
@SequenceGenerator(name = Rol.  ROL_SEQUENCE_NAME, sequenceName = Rol.ROL_SEQUENCE_NAME, initialValue = 1,
allocationSize = 20)
@Table(name="ROL")
public class Rol implements Serializable {
    public static final String ROL_SEQUENCE_NAME = "ROL_SEQUENCE_ID";
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = USUARIO_SEQUENCE_NAME)
    @Column(name="ROL_CODIGO")
    private Long rolCodigo;
    @Column(name="ROL_DESCRIPCION",unique =true,nullable =false)
    private String rolDescripción;
    
    @OneToMany(mappedBy="rol",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<UsuarioRol> usuarioRol;

    public Long getRolCodigo() {
        return rolCodigo;
    }

    public void setRolCodigo(Long rolCodigo) {
        this.rolCodigo = rolCodigo;
    }

    public String getRolDescripción() {
        return rolDescripción;
    }

    public void setRolDescripción(String rolDescripción) {
        this.rolDescripción = rolDescripción;
    }

    public List<UsuarioRol> getUsuarioRol() {
        return usuarioRol;
    }

    public void setUsuarioRol(List<UsuarioRol> usuarioRol) {
        this.usuarioRol = usuarioRol;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolCodigo != null ? rolCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the rolCodigo fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.rolCodigo == null && other.rolCodigo != null) || (this.rolCodigo != null && !this.rolCodigo.equals(other.rolCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.utils.security.entities.Rol[ id=" + rolCodigo + " ]";
    }
    
}
