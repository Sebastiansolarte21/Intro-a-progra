/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.en.clase;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrador
 */
public class Empresa {
    public String personal;
    public String nombre;
    public int numeroTrabajadores;
    public String sucursales;
    public String cliente;
    
  
    public void nombreEmpresa(String nombre){
            nombre = "";
        System.out.println("Su empresa es   " + nombre);

    }
  
    public int nombreEmpresa1(int nombre) {
        return 0;
    }
    
    public void personalAdministrativo(int numeroTrabajadores) {
        int resultado = 0;
        resultado = Integer.parseInt(JOptionPane.showInputDialog("Numero de Trabajadores"));
    
    }
}

