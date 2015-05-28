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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import ups.edu.ec.entities.Abstract.TraAuditoria;

/**
 *
 * @author maga
 */
@Entity
@Table(name = "TRA_PERSONA",uniqueConstraints = {
@UniqueConstraint(columnNames = "PER_CEDULA")})
@SequenceGenerator(name = "TRA_PER_SEQ",sequenceName = "TRA_PER_SEQ",initialValue = 1,allocationSize = 1)
public class TraPersona extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "TRA_PER_SEQ")
    @Column(name = "PER_ID_PK",nullable = false,unique = true)
    private Long perId;
    
    @Basic(optional = false)
    @Column(name = "PER_CEDULA",nullable = false,length = 10,unique = true)    
    private String perCedula;
    
    @Column(name = "PER_NOMBRE",length = 200)
    private String perNombre;
    
    @Column(name = "PER_APELLIDO",length = 200)
    private String perApellido;
    
    @Column(name = "PER_FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date perFechaNac;
    
    @Column(name = "PER_DIRECCION",length = 400)
    private String perDireccion;
    
    @Column(name = "PER_CELULAR",nullable = false,length = 10)
    private String perCelular;
    
    @Column(name = "PER_TELEFONO",length = 10)
    private String perTelefono;
    
    //Relacion Persona_tipoPersona
    @JoinColumn(name = "TPE_ID_PK", referencedColumnName = "TPE_ID_PK")
    @ManyToOne(fetch = FetchType.LAZY)
    
    //Realacion Persona_liqCabecera
    @OneToMany(mappedBy = "PER_ID_PK", fetch = FetchType.LAZY)    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perId != null ? perId.hashCode() : 0);
        return hash;
    }

    public void setPerId(Long perId) {
        this.perId = perId;
    }

    public void setPerCedula(String perCedula) {
        this.perCedula = perCedula;
    }

    public void setPerNombre(String perNombre) {
        this.perNombre = perNombre;
    }

    public void setPerApellido(String perApellido) {
        this.perApellido = perApellido;
    }

    public void setPerFechaNac(Date perFechaNac) {
        this.perFechaNac = perFechaNac;
    }

    public void setPerDireccion(String perDireccion) {
        this.perDireccion = perDireccion;
    }

    public void setPerCelular(String perCelular) {
        this.perCelular = perCelular;
    }

    public void setPerTelefono(String perTelefono) {
        this.perTelefono = perTelefono;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getPerId() {
        return perId;
    }

    public String getPerCedula() {
        return perCedula;
    }

    public String getPerNombre() {
        return perNombre;
    }

    public String getPerApellido() {
        return perApellido;
    }

    public Date getPerFechaNac() {
        return perFechaNac;
    }

    public String getPerDireccion() {
        return perDireccion;
    }

    public String getPerCelular() {
        return perCelular;
    }

    public String getPerTelefono() {
        return perTelefono;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the perId fields are not set
        if (!(object instanceof TraPersona)) {
            return false;
        }
        TraPersona other = (TraPersona) object;
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
