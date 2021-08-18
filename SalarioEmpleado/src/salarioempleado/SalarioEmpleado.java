/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarioempleado;

import java.util.Scanner;

import java.lang.Math;
/**
 *
 * @author ddera
 */
public class SalarioEmpleado {

    /**
     * @param args the command line arguments
     */
    //- Calcular el salario neto de un empleado, solicitando nombre y salario base
   //- El salario no puede ser negativo, y debe ser mayor a 500
   //- Salario neto = salario base - deducciones
   //- Deducciones (AFP 3% , ISSS 2%, RENTA 5%)
   //- Se debe imprimir en pantalla , el salario neto
   // y el porcentaje descuento de cada deducción.
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String empleado = "";
        float salariobase = 0, salarioneto = 0, deducciones = 0;//posible problema ; dejar en double;;
        double AFP=0.03 , ISSS=0.02 , renta=0.05 ;
        
        
        System.out.print("Ingrese su nombre de empleado: ");
        empleado = reader.nextLine();
        
        System.out.print("Ingrese su salario: ");
        salariobase = reader.nextInt();
        
        if(salariobase>=500){
          deducciones= (float) ((salariobase*AFP)+(salariobase*ISSS)+(salariobase*renta));
           salarioneto=(float) (salariobase) - (deducciones);
           
        System.out.println("Nombre: " + empleado);
        System.out.println("Salario neto: " + (salarioneto));
        System.out.println("La deduccion de AFP es: " + (AFP)); 
        System.out.println("La deduccion de ISSS es: " + (ISSS));
        System.out.println("La deduccion de renta es: " + (renta));
           
        }
        else{
          System.out.print("Error al realizar la operacion");  
        }
    
    }
    
}
