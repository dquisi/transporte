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
@Table(name = "TRA_CONTA_CUENTA")
@SequenceGenerator(name = "TRA_CONTA_CUENTA_SEQ", sequenceName = "TRA_CONTA_CUENTA_SEQ", initialValue = 1, allocationSize = 1)
public class tra_conta_cuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_CONTA_CUENTA_SEQ")
    @Column(name = "COCU_ID_PK")
    private Long id;
     @Column(name = "COCU_CODIGO")
     private String cocuCodigo;
     @Column(name = "COCU_NOMBRE")
     private String cocuNombre;

    public String getCocuCodigo() {
        return cocuCodigo;
    }

    public void setCocuCodigo(String cocuCodigo) {
        this.cocuCodigo = cocuCodigo;
    }

    public String getCocuNombre() {
        return cocuNombre;
    }

    public void setCocuNombre(String cocuNombre) {
        this.cocuNombre = cocuNombre;
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
        if (!(object instanceof tra_conta_cuenta)) {
            return false;
        }
        tra_conta_cuenta other = (tra_conta_cuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.situacionInicial.tra_conta_cuenta[ id=" + id + " ]";
    }
    
}
