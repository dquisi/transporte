/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.RRHH;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRAN_TIPO_PERSONA")
@SequenceGenerator(name = "TRAN_TPE_SEQ",sequenceName = "TRAN_TPE_SEQ",initialValue = 1,allocationSize = 1)
public class TRAN_TIPO_PERSONA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRAN_TPE_SEQ")
    @Column(name = "TPE_ID")
    private Long tpeId;
    @Column(name = "TPE_DESCRIPCION")
    private String tpeDescripcion;
    //Relacion
    @OneToMany(mappedBy = "TPE_ID", fetch = FetchType.LAZY)

    public Long getId() {
        return tpeId;
    }

    public void setId(Long id) {
        this.tpeId = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tpeId != null ? tpeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the tpeId fields are not set
        if (!(object instanceof TRAN_TIPO_PERSONA)) {
            return false;
        }
        TRAN_TIPO_PERSONA other = (TRAN_TIPO_PERSONA) object;
        if ((this.tpeId == null && other.tpeId != null) || (this.tpeId != null && !this.tpeId.equals(other.tpeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.RRHH.TRAN_TIPO_PERSONA[ id=" + tpeId + " ]";
    }
    
}
