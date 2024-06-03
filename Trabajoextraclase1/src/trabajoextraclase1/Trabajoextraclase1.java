/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoextraclase1;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrador
 */
public class Trabajoextraclase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int anos;
        int horasLaboradas;
        int pagoPorHora;
        int salarioBruto;
        int bono;
        int deduccion;

        // Se solicitan los datos del tiempo, horas laboradas y cuanto gana por hora.
        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su tiempo en la empresa"));
        
        horasLaboradas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las horas laboradas por semana"));

        pagoPorHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto gana por hora?"));

        
        // Se calcula el salario bruto del usuario
        salarioBruto = horasLaboradas * pagoPorHora * 4 * 12;

        // Aplicar bono si tiene más de 10 años de antigüedad
        if (anos > 10) {
            bono = salarioBruto * 20 / 100;
            salarioBruto += bono;
        }

        // si el salario bruto es superior a $1000 se le rebajara dinero
        if (salarioBruto > 1000) {
            if (salarioBruto > 2000) {
                deduccion = salarioBruto * 15 / 100;
            } else {
                deduccion = salarioBruto * 10 / 100;
            }
            salarioBruto -= deduccion;
        }

        // Se le mostrara al usuario final su salario neto
        JOptionPane.showMessageDialog(null, "Su salario neto final es: $" + salarioBruto);
    }
}
    
    

