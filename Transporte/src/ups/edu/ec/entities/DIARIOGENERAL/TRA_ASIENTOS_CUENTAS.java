/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ups.edu.ec.entities.DIARIOGENERAL;

import ups.edu.ec.entities.Abstract.TraAuditoria;
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
 * @author Paul
 */

@Entity
@Table(name = "TRA_ASIENTOS_CUENTAS")
@SequenceGenerator(name = "TRA_ASIENTOS_CUENTAS_SEQ", sequenceName = "TRA_ASIENTOS_CUENTAS_SEQ", initialValue = 1, allocationSize = 1)

public class TRA_ASIENTOS_CUENTAS extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_ASIENTOS_CUENTAS_SEQ")
    @Column(name = "ASC_ID", nullable=false, unique=true)
    private Long ASC_ID;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "ASC_FECHA_SIENTOCUENTA")
    private Date ASC_FECHA_SIENTOCUENTA;
    
    @Column(name = "ASC_DEBE_ASIENTOCUENTA", precision = 10, scale = 2)
    private Long ASC_DEBE_ASIENTOCUENTA;
    
    @Column(name = "ASC_HABER_ASIENTOCUENTA", precision = 10, scale = 2)
    private Long ASC_DEBE_HABER_ASIENTOCUENTA;
    
    @Column(name = "ASC_ID_CUENTA_AUX_ASIENTOCUENTA", precision = 10, scale = 2)
    private Long ASC_ID_CUENTA_AUX_ASIENTOCUENTA;
    
    @Column(name = "ASC_CTA_ELEGIDA_ASIENTOCUENTA", precision = 10, scale = 2)
    private Long ASC_CTA_ELEGIDA_ASIENTOCUENTA;
    
    @Column(name = "ASC_NOTAS_ASIENTOCUENTA", length=100)
    private String ASC_NOTAS_ASIENTOCUENTA;

    public Long getASC_ID() {
        return ASC_ID;
    }

    public void setASC_ID(Long ASC_ID) {
        this.ASC_ID = ASC_ID;
    }

    public Date getASC_FECHA_SIENTOCUENTA() {
        return ASC_FECHA_SIENTOCUENTA;
    }

    public void setASC_FECHA_SIENTOCUENTA(Date ASC_FECHA_SIENTOCUENTA) {
        this.ASC_FECHA_SIENTOCUENTA = ASC_FECHA_SIENTOCUENTA;
    }

    public Long getASC_DEBE_ASIENTOCUENTA() {
        return ASC_DEBE_ASIENTOCUENTA;
    }

    public void setASC_DEBE_ASIENTOCUENTA(Long ASC_DEBE_ASIENTOCUENTA) {
        this.ASC_DEBE_ASIENTOCUENTA = ASC_DEBE_ASIENTOCUENTA;
    }

    public Long getASC_DEBE_HABER_ASIENTOCUENTA() {
        return ASC_DEBE_HABER_ASIENTOCUENTA;
    }

    public void setASC_DEBE_HABER_ASIENTOCUENTA(Long ASC_DEBE_HABER_ASIENTOCUENTA) {
        this.ASC_DEBE_HABER_ASIENTOCUENTA = ASC_DEBE_HABER_ASIENTOCUENTA;
    }

    public Long getASC_ID_CUENTA_AUX_ASIENTOCUENTA() {
        return ASC_ID_CUENTA_AUX_ASIENTOCUENTA;
    }

    public void setASC_ID_CUENTA_AUX_ASIENTOCUENTA(Long ASC_ID_CUENTA_AUX_ASIENTOCUENTA) {
        this.ASC_ID_CUENTA_AUX_ASIENTOCUENTA = ASC_ID_CUENTA_AUX_ASIENTOCUENTA;
    }

    public Long getASC_CTA_ELEGIDA_ASIENTOCUENTA() {
        return ASC_CTA_ELEGIDA_ASIENTOCUENTA;
    }

    public void setASC_CTA_ELEGIDA_ASIENTOCUENTA(Long ASC_CTA_ELEGIDA_ASIENTOCUENTA) {
        this.ASC_CTA_ELEGIDA_ASIENTOCUENTA = ASC_CTA_ELEGIDA_ASIENTOCUENTA;
    }

    public String getASC_NOTAS_ASIENTOCUENTA() {
        return ASC_NOTAS_ASIENTOCUENTA;
    }

    public void setASC_NOTAS_ASIENTOCUENTA(String ASC_NOTAS_ASIENTOCUENTA) {
        this.ASC_NOTAS_ASIENTOCUENTA = ASC_NOTAS_ASIENTOCUENTA;
    }
    
    
}
