/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclase6;

/**
 *
 * @author Administrador
 */
public class EjercicioClase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Usuario usuario = new Usuario("Juan", "juan@example.com", "Passw0rd");
        System.out.println(usuario.getContrasena());  // ********
        if (!usuario.setContrasena("newPass1")) {
            System.out.println("La nueva contraseña no es valida");
        } else {  // Establecer nueva contraseña
            System.out.println(usuario.getContrasena());  // ********
        }
    }
        
    }
    

