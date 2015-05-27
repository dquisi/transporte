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
import javax.persistence.Table;

/**
 *
 * @author asissistemas
 */
@Entity
@Table(name="PERMISO")
public class Permiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PERM_CODIGO")
    private Long permCodigo;
    @Column(name="PERM_DESCRIPCION")
    private String permDescripcion;

    public Long getPermCodigo() {
        return permCodigo;
    }

    public void setPermCodigo(Long permCodigo) {
        this.permCodigo = permCodigo;
    }

     public String getPermDescripcion() {
        return permDescripcion;
    }

    public void setPermDescripcion(String permDescripcion) {
        this.permDescripcion = permDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permCodigo != null ? permCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the perCodigo fields are not set
        if (!(object instanceof Permiso)) {
            return false;
        }
        Permiso other = (Permiso) object;
        if ((this.permCodigo == null && other.permCodigo != null) || (this.permCodigo != null && !this.permCodigo.equals(other.permCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.utils.security.entities.Permiso[ id=" + permCodigo + " ]";
    }
    
}
