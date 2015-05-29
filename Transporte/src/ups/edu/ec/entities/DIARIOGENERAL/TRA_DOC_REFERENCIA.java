/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ups.edu.ec.entities.DIARIOGENERAL;

import ups.edu.ec.entities.Abstract.TraAuditoria;
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
 * @author Paul
 */

@Entity
@Table(name = "TRA_DOC_REFERENCIA")
@SequenceGenerator(name = "TRA_DOC_REFERENCIA_SEQ", sequenceName = "TRA_DOC_REFERENCIA_SEQ", initialValue = 1, allocationSize = 1)

public class TRA_DOC_REFERENCIA extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_DOC_REFERENCIA_SEQ")
    @Column(name = "DOR_ID", nullable=false, unique=true)
    private Long DOR_ID;
    
    @Column(name = "DOR_NUM_DOCREFERENCIA", length=100)
    private String DOR_NUM_DOCREFERENCIA;
    
    @Column(name = "DOR_DESCRIPCION_DOCREFERENCIA", length=100)
    private String DOR_DESCRIPCION_DOCREFERENCIA;

    public Long getDOR_ID() {
        return DOR_ID;
    }

    public void setDOR_ID(Long DOR_ID) {
        this.DOR_ID = DOR_ID;
    }

    public String getDOR_NUM_DOCREFERENCIA() {
        return DOR_NUM_DOCREFERENCIA;
    }

    public void setDOR_NUM_DOCREFERENCIA(String DOR_NUM_DOCREFERENCIA) {
        this.DOR_NUM_DOCREFERENCIA = DOR_NUM_DOCREFERENCIA;
    }

    public String getDOR_DESCRIPCION_DOCREFERENCIA() {
        return DOR_DESCRIPCION_DOCREFERENCIA;
    }

    public void setDOR_DESCRIPCION_DOCREFERENCIA(String DOR_DESCRIPCION_DOCREFERENCIA) {
        this.DOR_DESCRIPCION_DOCREFERENCIA = DOR_DESCRIPCION_DOCREFERENCIA;
    }
    
    
}
