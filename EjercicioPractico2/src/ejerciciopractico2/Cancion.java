/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico2;

/**
 *
 * @author Ville
 */
public class Cancion {
    
  // Se pusieron atributos privados
    
    private String idCancion;
    private String titulo;
    private String autor;
    private int duracion;
    private int anioCreacion;

    // Constructores
    
    public Cancion(String idCancion, String titulo, String autor, int duracion, int anioCreacion) {
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anioCreacion = anioCreacion;
    }

    // Aqui se usaron los getters y setters
    
    public String getIdCancion() {
        return idCancion;
    }

    public void setIdCancion(String idCancion) {
        this.idCancion = idCancion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
    
}
