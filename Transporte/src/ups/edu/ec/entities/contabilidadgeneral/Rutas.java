/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.contabilidadgeneral;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TRA_RUTAS")
@SequenceGenerator(name = "TRA_RUTAS_SEQ", sequenceName = "TRA_RUTAS_SEQ", initialValue = 1, allocationSize = 1)
public class Rutas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_RUTAS_SEQ")
    @Column(name="TRA_ID_PK")
    private Long rutId;
    @Column(name="TRA_TIEMPO", length=50)
    private String creTiempo;
    @Column(name = "TRA_DESCRIPCION", length=200)
    @Basic(fetch = FetchType.LAZY)
    private String rutDescripcion;

    public Long getRutId() {
        return rutId;
    }

    public void setRutId(Long rutId) {
        this.rutId = rutId;
    }

    public String getCreTiempo() {
        return creTiempo;
    }

    public void setCreTiempo(String creTiempo) {
        this.creTiempo = creTiempo;
    }

    public String getRutDescripcion() {
        return rutDescripcion;
    }

    public void setRutDescripcion(String rutDescripcion) {
        this.rutDescripcion = rutDescripcion;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rutId != null ? rutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rutas)) {
            return false;
        }
        Rutas other = (Rutas) object;
        if ((this.rutId == null && other.rutId != null) || (this.rutId != null && !this.rutId.equals(other.rutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.Rutas[ id=" + rutId + " ]";
    }
    
}
