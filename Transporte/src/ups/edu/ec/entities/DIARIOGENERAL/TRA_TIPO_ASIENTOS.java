/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ups.edu.ec.entities.DIARIOGENERAL;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




/**
 *
 * @author Paul
 */

@Entity
@Table(name = "TRA_TIPO_ASIENTOS")
@SequenceGenerator(name = "TRA_TIPO_ASIENTOS_SEQ", sequenceName = "TRA_TIPO_ASIENTOS_SEQ", initialValue = 1, allocationSize = 1)

public class TRA_TIPO_ASIENTOS extends TraAuditoria implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TIA_ID", nullable=false, unique=true)
    private Long TIA_ID;
    
    @Column(name = "TIA_DESCRIPCION", length=100)
    private String TIA_DESCRIPCION;

    public Long getTIA_ID() {
        return TIA_ID;
    }

    public void setTIA_ID(Long TIA_ID) {
        this.TIA_ID = TIA_ID;
    }
    
    
}
