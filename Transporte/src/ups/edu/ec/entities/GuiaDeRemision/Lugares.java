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
import ups.edu.ec.entities.HojaDeRuta.Hoja_Ruta_Cabecera;

/**
 *
 * @author Julio Martinez
 */
@Entity
@Table(name = "TRA_LUGARES")
@SequenceGenerator(name = "TRA_LUGARES_SEQ", sequenceName = "TRA_LUGARES_SEQ", initialValue = 1, allocationSize = 1)
public class Lugares extends TraAuditoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRA_LUGARES_SEQ")
    @Column(name="LUG_ID_PK",nullable = false, unique = true)
    private Long lug_id_pk;

    @Column(name="LUG_DESCRIPCION",length = 100)
    private String lug_descripcion;

    @Column(name="LUG_PADRE_ID")
    private Long lug_padre_id;
    
    @ManyToOne
    @JoinColumn(name="HRC_HRD_FK")
    private Tipo_Lugares tlu_lug_fk;

    public Long getLug_id_pk() {
        return lug_id_pk;
    }

    public void setLug_id_pk(Long lug_id_pk) {
        this.lug_id_pk = lug_id_pk;
    }

    public String getLug_descripcion() {
        return lug_descripcion;
    }

    public void setLug_descripcion(String lug_descripcion) {
        this.lug_descripcion = lug_descripcion;
    }

    public Long getLug_padre_id() {
        return lug_padre_id;
    }

    public void setLug_padre_id(Long lug_padre_id) {
        this.lug_padre_id = lug_padre_id;
    }

    public Tipo_Lugares getTlu_lug_fk() {
        return tlu_lug_fk;
    }

    public void setTlu_lug_fk(Tipo_Lugares tlu_lug_fk) {
        this.tlu_lug_fk = tlu_lug_fk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lug_id_pk != null ? lug_id_pk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugares)) {
            return false;
        }
        Lugares other = (Lugares) object;
        if ((this.lug_id_pk == null && other.lug_id_pk != null) || (this.lug_id_pk != null && !this.lug_id_pk.equals(other.lug_id_pk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ups.edu.ec.entities.GuiaDeRemision.Lugares[ id=" + lug_id_pk + " ]";
    }
    
}
