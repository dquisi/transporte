/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.situacionInicial;

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
 * @author jlc
 */
@Entity
@Table(name = "TRA_TIPO_CUENTAS")
@SequenceGenerator(name = "TRA_TIPO_CUENTAS_SEQ", sequenceName = "TRA_TIPO_CUENTAS_SEQ", initialValue = 1, allocationSize = 1)
public class tra_tipo_cuentas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_TIPO_CUENTAS_SEQ")
    @Column(name = "TICU_ID")
    private Long id;
    @Column(name = "TICU_DESCRIPCION")
    private  String ticuDescripcion;

    public String getTicuDescripcion() {
        return ticuDescripcion;
    }

    public void setTicuDescripcion(String ticuDescripcion) {
        this.ticuDescripcion = ticuDescripcion;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof tra_tipo_cuentas)) {
            return false;
        }
        tra_tipo_cuentas other = (tra_tipo_cuentas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.situacionInicial.tra_tipo_cuentas[ id=" + id + " ]";
    }
    
}
