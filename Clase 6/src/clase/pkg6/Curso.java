/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.pkg6;

/**
 *
 * @author Administrador
 */
public class Curso {
    public int id;
    public String nombre = "";
    private String correo = "";

public String getCorreo(){
return correo.substring(0,3) + "....." + correo.substring(correo.indexOf("@"));}

public void setCorreo(String correo){
if (!correo.contains("@")){
    System.out.println("No es un correo valido");
} else  {
this.correo = correo;
}

}




}