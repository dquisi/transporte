/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.GuiaDeRemision;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import ups.edu.ec.entities.Abstract.TraAuditoria;

/**
 *
 * @author Julio Martinez
 */
@Entity
@Table(name = "TRA_TIPO_LUGARES")
@SequenceGenerator(name = "TRA_TIPO_LUGARES_SEQ", sequenceName = "TRA_TIPO_LUGARES_SEQ", initialValue = 1, allocationSize = 1)
public class Tipo_Lugares extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_TIPO_LUGARES_SEQ")
    @Column(name="TLU_ID_PK",nullable = false,unique = true)
    private Long tlu_id_pk;

    @Column(name="TLU_DESCRIPCION",length = 100)
    private String tlu_descripcion;

    public Long getTlu_id_pk() {
        return tlu_id_pk;
    }

    public void setTlu_id_pk(Long tlu_id_pk) {
        this.tlu_id_pk = tlu_id_pk;
    }

    public String getTlu_descripcion() {
        return tlu_descripcion;
    }

    public void setTlu_descripcion(String tlu_descripcion) {
        this.tlu_descripcion = tlu_descripcion;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tlu_id_pk != null ? tlu_id_pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo_Lugares)) {
            return false;
        }
        Tipo_Lugares other = (Tipo_Lugares) object;
        if ((this.tlu_id_pk == null && other.tlu_id_pk != null) || (this.tlu_id_pk != null && !this.tlu_id_pk.equals(other.tlu_id_pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.GuiaDeRemision.Tipo_Lugares[ id=" + tlu_id_pk + " ]";
    }
    
}
