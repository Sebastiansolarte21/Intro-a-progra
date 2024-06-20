/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizsebas;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrador
 */
public class Quizsebas {

    public static void main(String[] args) {
          // Inicializo las variables para los totales de SEM e IVM
        double SEM = 0.0;
        double IVM = 0.0;
 
        // se solicita cantidad de empleados
        int cEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de empleados para calcular el SEM e IVM: "));
 
        // Solicitar el salario y calcular los montos de cada empleado
        for (int i = 0; i < cEmpleados; i++){
            double salarios = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado #" + (i + 1) + ":"));
 
            // Se calcula el SEM y IVM
            double totalSEM = salarios * 0.0925;
            double totalIVM = salarios * 0.0508;
 
            // Suma de montos totales
            SEM += totalSEM;
            IVM += totalIVM;
        }
 
        // Se calcula el monto total a pagar de SEM + IVM
        double totalPagar = SEM + IVM;
 
        // Se muestra el resultado que la empresa abona a la CCSS
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de " + totalPagar);

    }
}
