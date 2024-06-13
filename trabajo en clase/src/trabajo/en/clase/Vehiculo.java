/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.en.clase;

/**
 *
 * @author Administrador
 */
public class Vehiculo {
    public String placa;
    public String modelo;
    public int anioCreacion;
    
    public void calculaAnos (int anoActual){
    int resultado =0;
    resultado = anoActual - anioCreacion;
    System.out.println("Ano del vheiculo " + resultado );
    
    } 
    public int resultadocalculaAnos (int anoActual){
    return 0;
    }
    
}
