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
@Table(name = "TRA_MOTIVO_TRASLADOS")
@SequenceGenerator(name = "TRA_MOTIVO_TRASLADOS_SEQ", sequenceName = "TRA_MOTIVO_TRASLADOS_SEQ", initialValue = 1, allocationSize = 1)
public class Motivo_Traslados extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_MOTIVO_TRASLADOS_SEQ")
    @Column(name="MTR_ID_PK",nullable = false,unique = true)
    private Long mtr_id_pk;

    @Column(name="MTR_DESCRIPCION", length = 100)
    private String mtr_descripcion;

    public Long getMtr_id_pk() {
        return mtr_id_pk;
    }

    public void setMtr_id_pk(Long mtr_id_pk) {
        this.mtr_id_pk = mtr_id_pk;
    }

    public String getMtr_descripcion() {
        return mtr_descripcion;
    }

    public void setMtr_descripcion(String mtr_descripcion) {
        this.mtr_descripcion = mtr_descripcion;
    }
        

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtr_id_pk != null ? mtr_id_pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motivo_Traslados)) {
            return false;
        }
        Motivo_Traslados other = (Motivo_Traslados) object;
        if ((this.mtr_id_pk == null && other.mtr_id_pk != null) || (this.mtr_id_pk != null && !this.mtr_id_pk.equals(other.mtr_id_pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.GuiaDeRemision.Motivo_Traslados[ id=" + mtr_id_pk + " ]";
    }
    
}
