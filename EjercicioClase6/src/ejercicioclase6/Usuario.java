/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclase6;

/**
 *
 * @author Administrador
 */
public class Usuario {
    private String nombre;
    private String email;
    private String contrasena;

    public Usuario(String nombre, String email, String contrasena) {
        this.nombre = nombre;
        this.email = email;
        if (validarContrasena(contrasena)) {
            this.contrasena = contrasena;
        } else {
            this.contrasena = ""; // Establece una contraseña vacía si no es válida
            System.out.println("La contraseña proporcionada no es valida.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return "*".repeat(contrasena.length());
    }

    public boolean setContrasena(String contrasena) {
        if (validarContrasena(contrasena)) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("La contraseña no es valida.");
            return false;
        }
    }

    private boolean validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            return false;
        }
        for (int i = 0; i < contrasena.length() - 1; i++) {
            if (contrasena.charAt(i) == contrasena.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
