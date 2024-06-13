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
public class Persona {

    public String nombre;
    public String apellido;
    public String altura;
    public int peso;
    public String sexo;
    public String femenino;
    public String masculino;
    public String nacionalidad;

    public void nombreCompleto(String nombreCompleto) {
        String resultadoNombre = "";
        resultadoNombre = nombre + " " + apellido;
        System.out.println("Su nombre es  " + resultadoNombre);

    }
  
    public int ResultadoNombre(int nombreCompleto) {
        return 0;
    }
  
    public void sexo(String sexo) {
        String resultadoSexo = "";
        String sexo1 = "";
        resultadoSexo = JOptionPane.showInputDialog(sexo);
        if ((sexo1 == "masculino")
                || (sexo == "femenino")) {
            System.out.println("Su sexo es   " + resultadoSexo);
        }
    
  

    

    } 

}
