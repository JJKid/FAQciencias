package modelo;
// Generated 21/03/2018 11:34:09 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pregunta generated by hbm2java
 */
public class Pregunta  implements java.io.Serializable {


     private int idpregunta;
     private Usuario usuario;
     private String titulo;
     private String detalles;
     private Date fecha;
     private Integer vistas;
     private char activa;
     private Set respuestas = new HashSet(0);
     private String nombre;
     
     
    public Pregunta() {
    } 
    public Pregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }
	
    public Pregunta(Usuario usuario, String titulo, String detalles, Date fecha, char activa) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.detalles = detalles;
        this.fecha = fecha;
        this.vistas = 0;
        this.activa = activa;
        this.nombre=usuario.getNombre();
    }
    public Pregunta(Usuario usuario, String titulo, String detalles, Date fecha, Integer vistas, char activa, Set respuestas) {
       this.usuario = usuario;
       this.titulo = titulo;
       this.detalles = detalles;
       this.fecha = fecha;
       this.vistas = vistas;
       this.activa = activa;
       this.respuestas = respuestas;
    }
   
    public int getIdpregunta() {
        return this.idpregunta;
    }
    
    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }
    public String nombre(){
        return usuario.getNombre();
    }
    
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDetalles() {
        return this.detalles;
    }
    
    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getVistas() {
        return this.vistas;
    }
    
    public void setVistas(Integer vistas) {
        this.vistas = vistas;
    }
    public char getActiva() {
        return this.activa;
    }
    
    public void setActiva(char activa) {
        this.activa = activa;
    }
    public Set getRespuestas() {
        return this.respuestas;
    }
    
    public void setRespuestas(Set respuestas) {
        this.respuestas = respuestas;
    }

}