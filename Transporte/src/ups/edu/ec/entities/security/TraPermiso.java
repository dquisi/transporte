/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.security;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 *
 * @author asissistemas
 */
@Entity
@SequenceGenerator(name = "tra_permiso_seq", sequenceName = "tra_permiso_seq", initialValue = 1,allocationSize = 1)
@Table(name="TRA_PERMISO")
public class TraPermiso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tra_permiso_seq")
    @Column(name="PER_ID")
    private Long idPermiso;
    @Column(name="PER_DESCRIPCION")
    private String desPermiso;
    
   //Relacion de muchos a uno <TranPermiso a TraRol>
    @ManyToOne
    @JoinColumn(name="ROL_ID")
    private TraRol tranRol;

//    Relacion de muchos a uno <TranPermiso a TraOperacion>
    @ManyToOne
    @JoinColumn(name="OPE_ID")
    private TraOperacion tranOperacion;
    
//RELACION DE MUCHOS A UNO <PERMISO A SECCION>
    @ManyToOne
    @JoinColumn(name="SEC_ID")
    private TraSeccion tranSeccion;
    
    public Long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(Long idPermiso) {
        this.idPermiso = idPermiso;
    }

     public String getDesPermiso() {
        return desPermiso;
    }

    public void setDesPermiso(String desPermiso) {
        this.desPermiso = desPermiso;
    }

    public TraOperacion getTranOperacion() {
        return tranOperacion;
    }

    public void setTranOperacion(TraOperacion tranOperacion) {
        this.tranOperacion = tranOperacion;
    }

    public TraSeccion getTranSeccion() {
        return tranSeccion;
    }

    public void setTranSeccion(TraSeccion tranSeccion) {
        this.tranSeccion = tranSeccion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermiso != null ? idPermiso.hashCode() : 0);
        return hash;
    }

    public TraRol getTranRol() {
        return tranRol;
    }

    public void setTranRol(TraRol tranRol) {
        this.tranRol = tranRol;
    }

    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idPermiso fields are not set
        if (!(object instanceof TraPermiso)) {
            return false;
        }
        TraPermiso other = (TraPermiso) object;
        if ((this.idPermiso == null && other.idPermiso != null) || (this.idPermiso != null && !this.idPermiso.equals(other.idPermiso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.utils.security.entities.Permiso[ id=" + idPermiso + " ]";
    }
    
}
