/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.entities.Abstract;

import ups.edu.ec.enums.EnumAudEliminadoTipo;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Bertha Tacuri
 */
@MappedSuperclass
public abstract class TraAuditoria {
    
    @Column(name = "AUD_USUARIO_INSERTO")
    private String audUsuarioInserto;
    @Column(name = "AUD_FECHA_INSERCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaInsercion;
    @Column(name = "AUD_USUARIO_MODIFICO")
    private String audUsuarioModifico;
    @Column(name = "AUD_FECHA_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date audFechaModificacion;
    @Column(name = "AUD_ELIMINADO", length = 1)
    @Enumerated(EnumType.STRING)
    private EnumAudEliminadoTipo audEliminado;

    public EnumAudEliminadoTipo getAudEliminado() {
        return audEliminado;
    }

    public void setAudEliminado(EnumAudEliminadoTipo audEliminado) {
        this.audEliminado = audEliminado;
    }
    
    public String getAudUsuarioInserto() {
        return audUsuarioInserto;
    }

    public void setAudUsuarioInserto(String audUsuarioInserto) {
        this.audUsuarioInserto = audUsuarioInserto;
    }

    public Date getAudFechaInsercion() {
        return audFechaInsercion;
    }

    public void setAudFechaInsercion(Date audFechaInsercion) {
        this.audFechaInsercion = audFechaInsercion;
    }

    public String getAudUsuarioModifico() {
        return audUsuarioModifico;
    }

    public void setAudUsuarioModifico(String audUsuarioModifico) {
        this.audUsuarioModifico = audUsuarioModifico;
    }

    public Date getAudFechaModificacion() {
        return audFechaModificacion;
    }

    public void setAudFechaModificacion(Date audFechaModificacion) {
        this.audFechaModificacion = audFechaModificacion;
    }
    
    @PrePersist
    public void auditoriaPreInsert(){
        setAudEliminado(EnumAudEliminadoTipo.N);
        setAudFechaInsercion(new Date());
        if(getAudUsuarioInserto() == null || getAudUsuarioInserto().equals("")){
            setAudUsuarioInserto("ANONIMO");
        }
    }
    
    @PreUpdate
    public void auditoriaPreUpdate(){
        setAudFechaModificacion(new Date());
        if(getAudUsuarioModifico() == null || getAudUsuarioModifico().equals("")){
            setAudUsuarioModifico("ANONIMO");
        }
    }
    
    
}
