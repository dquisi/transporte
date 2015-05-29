/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.GuiaDeRemision;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import ups.edu.ec.entities.Abstract.TraAuditoria;

/**
 *
 * @author Julio Martinez
 */
@Entity
@Table(name = "TRA_DETALLES_GUIA")
@SequenceGenerator(name = "TRA_DETALLES_GUIA_SEQ", sequenceName = "TRA_DETALLES_GUIA_SEQ", initialValue = 1, allocationSize = 1)
public class Detalles_Guia extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_HOJA_RUTA_CABECERA_SEQ")
    @Column(name="DGU_ID_PK", nullable = false,unique = true)
    private Long dgu_id_pk;

    @Column(name="DGU_CANTIDAD", precision = 8, scale = 2)
    private double dgu_cantidad;
    
    @Column(name="DGU_UNIDAD", length = 100)    
    private String dgu_unidad;

    @Column(name="DGU_DESCRIPCION", length = 200)
    private String dgu_descripcion;
    
    @Column(name="DGU_VALOR_UNITARIO", precision = 8, scale = 2)
    private double dgu_valorUnitario;

    @Column(name="DGU_VALOR_TOTAL", precision = 10, scale = 2)    
    private double dgu_valorTotal;
    
    @ManyToOne
    @JoinColumn(name="GRC_DGU_FK")    
    private Guia_Remision_Cabecera grc_dgu_fk;    

    public Long getDgu_id_pk() {
        return dgu_id_pk;
    }

    public void setDgu_id_pk(Long dgu_id_pk) {
        this.dgu_id_pk = dgu_id_pk;
    }

    public double getDgu_cantidad() {
        return dgu_cantidad;
    }

    public void setDgu_cantidad(double dgu_cantidad) {
        this.dgu_cantidad = dgu_cantidad;
    }

    public String getDgu_unidad() {
        return dgu_unidad;
    }

    public void setDgu_unidad(String dgu_unidad) {
        this.dgu_unidad = dgu_unidad;
    }

    public String getDgu_descripcion() {
        return dgu_descripcion;
    }

    public void setDgu_descripcion(String dgu_descripcion) {
        this.dgu_descripcion = dgu_descripcion;
    }

    public double getDgu_valorUnitario() {
        return dgu_valorUnitario;
    }

    public void setDgu_valorUnitario(double dgu_valorUnitario) {
        this.dgu_valorUnitario = dgu_valorUnitario;
    }

    public double getDgu_valorTotal() {
        return dgu_valorTotal;
    }

    public void setDgu_valorTotal(double dgu_valorTotal) {
        this.dgu_valorTotal = dgu_valorTotal;
    }

    public Guia_Remision_Cabecera getGrc_dgu_fk() {
        return grc_dgu_fk;
    }

    public void setGrc_dgu_fk(Guia_Remision_Cabecera grc_dgu_fk) {
        this.grc_dgu_fk = grc_dgu_fk;
    }


    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dgu_id_pk != null ? dgu_id_pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalles_Guia)) {
            return false;
        }
        Detalles_Guia other = (Detalles_Guia) object;
        if ((this.dgu_id_pk == null && other.dgu_id_pk != null) || (this.dgu_id_pk != null && !this.dgu_id_pk.equals(other.dgu_id_pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.GuiaDeRemision.Detalles_Guia[ id=" + dgu_id_pk + " ]";
    }
    
}
