/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico2;

/**
 *
 * @author Ville
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //se creo una clase usando un constructor
        
        Cancion cancion = new Cancion("001", "Love the way you lie", "Rihanna", 262, 2018);

        // Se llamo a los getters para obtener los valores de los atributos
        
        System.out.println("ID de la cancion: " + cancion.getIdCancion());
        System.out.println("Titulo: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duracion: " + cancion.getDuracion() + " segundos");
        System.out.println("Año de creacion: " + cancion.getAnioCreacion());

        // Modificar algunos atributos usando los setters
        
        cancion.setTitulo("Love The Way You Lie - Eminem ft. Rihanna");
        cancion.setDuracion(360);

        // Imprimir los valores modificados
        
        System.out.println("Titulo modificado: " + cancion.getTitulo());
        System.out.println("Duracion modificada: " + cancion.getDuracion() + " segundos");
    
    }
    
}
