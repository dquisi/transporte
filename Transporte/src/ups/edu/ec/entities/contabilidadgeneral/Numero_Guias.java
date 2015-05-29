/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.contabilidadgeneral;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "TRA_NUMERO_GUIAS")
@SequenceGenerator(name = "TRA_NUMERO_GUIAS_SEQ", sequenceName = "TRA_NUMERO_GUIAS_SEQ", initialValue = 1, allocationSize = 1)
public class Numero_Guias implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_NUMERO_GUIAS_SEQ")
    @Column(name="TRA_ID_PK")
    private Long nguId;
    @Column(name="TRA_DES", precision=2, scale=4)
    private double nguDes;
    @Column(name="TRA_HAS", precision=2, scale=4)
    private double nguHas;
    @Column(name="TRA_SUMA", precision=2, scale=4)
    private double nguSuma;

    public Long getNguId() {
        return nguId;
    }

    public void setNguId(Long nguId) {
        this.nguId = nguId;
    }

    public double getNguDes() {
        return nguDes;
    }

    public void setNguDes(double nguDes) {
        this.nguDes = nguDes;
    }

    public double getNguHas() {
        return nguHas;
    }

    public void setNguHas(double nguHas) {
        this.nguHas = nguHas;
    }

    public double getNguSuma() {
        return nguSuma;
    }

    public void setNguSuma(double nguSuma) {
        this.nguSuma = nguSuma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nguId != null ? nguId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numero_Guias)) {
            return false;
        }
        Numero_Guias other = (Numero_Guias) object;
        if ((this.nguId == null && other.nguId != null) || (this.nguId != null && !this.nguId.equals(other.nguId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.Numero_Guias[ id=" + nguId + " ]";
    }
    
}
