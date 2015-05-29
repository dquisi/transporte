/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ups.edu.ec.entities.DIARIOGENERAL;

import ups.edu.ec.entities.Abstract.TraAuditoria;
import java.util.Date;
import java.io.Serializable;
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
@Table(name = "TRA_ASIENTO")
@SequenceGenerator(name = "TRA_ASIENTO_SEQ", sequenceName = "TRA_ASIENTO_SEQ", initialValue = 1, allocationSize = 1)

public class TRA_ASIENTO extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_ASIENTO_SEQ")
    @Column(name = "ASI_ID", nullable=false, unique=true)
    private Long ASI_ID;
    
    @Column(name = "ASI_CONCEPTO_ASIENTO", length = 300)
    private String ASI_CONCEPTO_ASIENTO;
    
    @Column(name = "ASI_NUMERO_ASIENTO")
    private int ASI_NUMERO_ASIENTO;
    
    @Column(name = "ASI_FECHA_ASIENTO")
    @Temporal(TemporalType.DATE)
    private Date  ASI_FECHA_ASIENTO;
    
    @Column(name = "ASI_ESTADO_ASIENTO")
    private int ASI_ESTADO_ASIENTO;

    public Long getASI_ID() {
        return ASI_ID;
    }

    public void setASI_ID(Long ASI_ID) {
        this.ASI_ID = ASI_ID;
    }

    public String getASI_CONCEPTO_ASIENTO() {
        return ASI_CONCEPTO_ASIENTO;
    }

    public void setASI_CONCEPTO_ASIENTO(String ASI_CONCEPTO_ASIENTO) {
        this.ASI_CONCEPTO_ASIENTO = ASI_CONCEPTO_ASIENTO;
    }

    public int getASI_NUMERO_ASIENTO() {
        return ASI_NUMERO_ASIENTO;
    }

    public void setASI_NUMERO_ASIENTO(int ASI_NUMERO_ASIENTO) {
        this.ASI_NUMERO_ASIENTO = ASI_NUMERO_ASIENTO;
    }

    public Date getASI_FECHA_ASIENTO() {
        return ASI_FECHA_ASIENTO;
    }

    public void setASI_FECHA_ASIENTO(Date ASI_FECHA_ASIENTO) {
        this.ASI_FECHA_ASIENTO = ASI_FECHA_ASIENTO;
    }

    public int getASI_ESTADO_ASIENTO() {
        return ASI_ESTADO_ASIENTO;
    }

    public void setASI_ESTADO_ASIENTO(int ASI_ESTADO_ASIENTO) {
        this.ASI_ESTADO_ASIENTO = ASI_ESTADO_ASIENTO;
    }
    
    
    
}
