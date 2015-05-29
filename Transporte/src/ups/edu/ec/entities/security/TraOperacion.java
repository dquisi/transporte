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
@SequenceGenerator(name = "tra_operacion_seq", sequenceName = "tra_operacion_seq", initialValue = 1, allocationSize = 1)
@Table(name="TRA_OPERACION")
public class TraOperacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_operacion_seq")
    @Column(name="OPE_ID")
    private Long opeId;
    @Column(name="OPE_DESCRIPCION")
    private String opeDescripcion;
    
    //RELACION DE UNO A MUCHOS <OPERACION A PERMISO>
    @OneToMany(mappedBy="tranOperacion",cascade={CascadeType.REMOVE, CascadeType.REFRESH},fetch=FetchType.LAZY)
    public List<TraPermiso> tranPermisoList;
    
    
    public Long getOpeId() {
        return opeId;
    }

    public void setOpeId(Long opeId) {
        this.opeId = opeId;
    }

       public String getOpeDescripcion() {
        return opeDescripcion;
    }

    public void setOpeDescripcion(String opeDescripcion) {
        this.opeDescripcion = opeDescripcion;
    }

    public List<TraPermiso> getTranPermisoList() {
        return tranPermisoList;
    }

    public void setTranPermisoList(List<TraPermiso> tranPermisoList) {
        this.tranPermisoList = tranPermisoList;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (opeId != null ? opeId.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the opeId fields are not set
        if (!(object instanceof TraOperacion)) {
            return false;
        }
        TraOperacion other = (TraOperacion) object;
        if ((this.opeId == null && other.opeId != null) || (this.opeId != null && !this.opeId.equals(other.opeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entites.security.TranOperacion[ id=" + opeId + " ]";
    }
    
}
