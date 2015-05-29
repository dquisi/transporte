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
@Table(name = "TRA_TIPODOCS")
@SequenceGenerator(name = "TRA_TIPODOCS_SEQ", sequenceName = "TRA_TIPODOCS_SEQ", initialValue = 1, allocationSize = 1)

public class TRA_TIPODOCS extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_TIPODOCS_SEQ")
    @Column(name = "TIP_ID", nullable=false, unique=true)
    private Long TIP_ID;
    
    @Column(name = "TIP_DESCRIPCION", length=100)
    private String TIP_DESCRIPCION;

    public Long getTIP_ID() {
        return TIP_ID;
    }

    public void setTIP_ID(Long TIP_ID) {
        this.TIP_ID = TIP_ID;
    }

    public String getTIP_DESCRIPCION() {
        return TIP_DESCRIPCION;
    }

    public void setTIP_DESCRIPCION(String TIP_DESCRIPCION) {
        this.TIP_DESCRIPCION = TIP_DESCRIPCION;
    }
    
    
}
