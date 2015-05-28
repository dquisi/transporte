/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.ContabilidadEgresos;

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
 * @author usuario
 */
@Entity
@Table(name = "TRA_CHEQUE_DETALE")
@SequenceGenerator(name = "TRA_CHEQUE_DETALLE_SEQ",sequenceName = "TRA_CHEQUE_DETALLE_SEQ", initialValue = 1,allocationSize = 1)
public class TraChequeDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_CHEQUE_DETALLE_SEQ")
    @Column(name = "CDE_ID", nullable = false)
    private Long id;
    @Column(name = "CDE_NUMERO_CHEQUE", length = 50)
    private String numeroCheque;
    @Column(name = "CDE_VENCIMIENTO", length = 50)
    private String vencimiento;
    @Column(name = "CDE_VALOR")
    private double valor;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        if (!(object instanceof TraChequeDetalle)) {
            return false;
        }
        TraChequeDetalle other = (TraChequeDetalle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.ContabilidadEgresos.TraChequeDetalle[ id=" + id + " ]";
    }
    
}
