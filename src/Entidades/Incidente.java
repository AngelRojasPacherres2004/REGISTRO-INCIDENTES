




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAMER
 */
public class Incidente extends Problema 
        implements Registro {
    private String fecha;       
    private String tipo;
    private String hora;
    private String descripcion;
     private List<String> imagePaths;
//private String DatosMostrar;

   @Override
   public String getDatosMostrar() {
        return "Tipo: "+tipo+" - HORA: "+hora+" - Fecha: "+fecha;
    }
    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Incidente(String fecha, String tipo,String descripcion,String hora) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.hora=hora;
        this.descripcion=descripcion;
        this.imagePaths = new ArrayList<>();
    }
      public List<String> getImagePaths() {
        return imagePaths;
    }

    public void addImagePath(String imagePath) {
        imagePaths.add(imagePath);
    }
    

    @Override
    public void registra() {
        
    }

    
    
    
}
