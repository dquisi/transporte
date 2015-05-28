/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.situacionInicial;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author jlc
 */
@Entity
@Table(name = "TRA_CONTA_MAYOR_DETALLES")
@SequenceGenerator(name = "TRA_CONTA_MAYOR_DETALLES_SEQ", sequenceName = "TRA_CONTA_MAYOR_DETALLES_SEQ", initialValue = 1, allocationSize = 1)
public class tra_conta_mayor_detalles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_CONTA_MAYOR_DETALLES_SEQ")
    @Column(name = "COMADE_ID")
    private Long id;
    @Column(name = "COMADE_FECHA")
    @Temporal(TemporalType.DATE)
    private Date comadeFecha;
    @Column(name = "COMADE_DEBE")
    private double comaDebe;
    @Column(name = "COMADE_HABER")
    private double comaHaber;
    @Column(name = "COMADE_SALDO")
    private double comaSaldo;
    @Column(name = "COMADE_SALDO_CIERRE")
    private double comaSaldoCierre;
    @Column(name = "COMADE_SALDO_DEBE_BAL_COMP")
    private double comaSaldoDebeBal;
    @Column(name = "COMADE_SALDO_HABER_BAL_COMP")
    private double comaSaldoHaberBal;
    @Column(name = "COMADE_TOTAL_DEBE_BAL_COMP")
    private double comaSaldoTotalDebeBal;
    @Column(name = "COMADE_TOTAL_HABER_BAL_COMP")
    private double comaSaldoTotalHaberBal;
    @Column(name = "COMADE_ASIENTO_CIERRE")
    private double comaAientoCierre;

    public Date getComadeFecha() {
        return comadeFecha;
    }

    public void setComadeFecha(Date comadeFecha) {
        this.comadeFecha = comadeFecha;
    }

    public double getComaDebe() {
        return comaDebe;
    }

    public void setComaDebe(double comaDebe) {
        this.comaDebe = comaDebe;
    }

    public double getComaHaber() {
        return comaHaber;
    }

    public void setComaHaber(double comaHaber) {
        this.comaHaber = comaHaber;
    }

    public double getComaSaldo() {
        return comaSaldo;
    }

    public void setComaSaldo(double comaSaldo) {
        this.comaSaldo = comaSaldo;
    }

    public double getComaSaldoCierre() {
        return comaSaldoCierre;
    }

    public void setComaSaldoCierre(double comaSaldoCierre) {
        this.comaSaldoCierre = comaSaldoCierre;
    }

    public double getComaSaldoDebeBal() {
        return comaSaldoDebeBal;
    }

    public void setComaSaldoDebeBal(double comaSaldoDebeBal) {
        this.comaSaldoDebeBal = comaSaldoDebeBal;
    }

    public double getComaSaldoHaberBal() {
        return comaSaldoHaberBal;
    }

    public void setComaSaldoHaberBal(double comaSaldoHaberBal) {
        this.comaSaldoHaberBal = comaSaldoHaberBal;
    }

    public double getComaSaldoTotalDebeBal() {
        return comaSaldoTotalDebeBal;
    }

    public void setComaSaldoTotalDebeBal(double comaSaldoTotalDebeBal) {
        this.comaSaldoTotalDebeBal = comaSaldoTotalDebeBal;
    }

    public double getComaSaldoTotalHaberBal() {
        return comaSaldoTotalHaberBal;
    }

    public void setComaSaldoTotalHaberBal(double comaSaldoTotalHaberBal) {
        this.comaSaldoTotalHaberBal = comaSaldoTotalHaberBal;
    }

    public double getComaAientoCierre() {
        return comaAientoCierre;
    }

    public void setComaAientoCierre(double comaAientoCierre) {
        this.comaAientoCierre = comaAientoCierre;
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
        if (!(object instanceof tra_conta_mayor_detalles)) {
            return false;
        }
        tra_conta_mayor_detalles other = (tra_conta_mayor_detalles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.situacionInicial.tra_conta_mayor_detalles[ id=" + id + " ]";
    }
    
}
