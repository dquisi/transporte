/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.RRHH;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRAN_PERSONA",uniqueConstraints = {
@UniqueConstraint(columnNames = "PER_CEDULA")})
@SequenceGenerator(name = "TRAN_PER_SEQ",sequenceName = "TRAN_PER_SEQ",initialValue = 1,allocationSize = 1)
public class TRAN_PERSONA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRAN_PER_SEQ")
    @Column(name = "PER_ID")
    private Long perId;
    @Basic(optional = false)
    @Column(name = "PER_CEDULA",nullable = false,length = 10)    
    private String perCedula;
    @Column(name = "PER_NOMBRE")
    private String perNombre;
    @Column(name = "PER_APELLIDO")
    private String perApellido;
    @Column(name = "PER_FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date perFechaNac;
    @Column(name = "PER_DIRECCION")
    private String perDireccion;
    @Column(name = "PER_CELULAR")
    private String perCelular;
    @Column(name = "PER_TELEFONO")
    private String perTelefono;
    //Relacion
    @JoinColumn(name = "TPE_ID", referencedColumnName = "TPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the perId fields are not set
        if (!(object instanceof TRAN_PERSONA)) {
            return false;
        }
        TRAN_PERSONA other = (TRAN_PERSONA) object;
        if ((this.perId == null && other.perId != null) || (this.perId != null && !this.perId.equals(other.perId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.RRHH.TRAN_PERSONA[ id=" + perId + " ]";
    }
    
}
