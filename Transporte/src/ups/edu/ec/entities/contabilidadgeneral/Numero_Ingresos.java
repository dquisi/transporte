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
@Table(name = "TRA_NUMERO_INGRESOS")
@SequenceGenerator(name = "TRA_NUMERO_INGRESOS_SEQ", sequenceName = "TRA_NUMERO_INGRESOS_SEQ", initialValue = 1, allocationSize = 1)
public class Numero_Ingresos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_NUMERO_INGRESOS_SEQ")
    @Column(name="TRA_ID_PK")
    private Long ninId;
    @Column(name="TRA_DES", precision=2, scale=4)
    private double ninDes;
    @Column(name="TRA_HAS", precision=2, scale=4)
    private double ninHas;
    @Column(name="TRA_SUMA", precision=2, scale=4)
    private double ninSuma;

    public Long getNinId() {
        return ninId;
    }

    public void setNinId(Long ninId) {
        this.ninId = ninId;
    }

    public double getNinDes() {
        return ninDes;
    }

    public void setNinDes(double ninDes) {
        this.ninDes = ninDes;
    }

    public double getNinHas() {
        return ninHas;
    }

    public void setNinHas(double ninHas) {
        this.ninHas = ninHas;
    }

    public double getNinSuma() {
        return ninSuma;
    }

    public void setNinSuma(double ninSuma) {
        this.ninSuma = ninSuma;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ninId != null ? ninId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Numero_Ingresos)) {
            return false;
        }
        Numero_Ingresos other = (Numero_Ingresos) object;
        if ((this.ninId == null && other.ninId != null) || (this.ninId != null && !this.ninId.equals(other.ninId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.contabilidadgeneral.Numero_Ingresos[ id=" + ninId + " ]";
    }
    
}
