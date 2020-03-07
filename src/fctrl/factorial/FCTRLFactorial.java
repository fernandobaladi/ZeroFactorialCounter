/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fctrl.factorial;
import java.util.Scanner;
/**
 *
 * @author Estudiantes
 */
public class FCTRLFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int numero, cant=0, cant5 = 5;
        
        System.out.println("Bienvenido a la contador de 0 en los factoriales");
        System.out.println("Coloque a continuacion el numero que quiere calcular:");
        numero=sc.nextInt();

        do{
            cant = cant + (numero/cant5);
            cant5 = cant5*5;
        }while(numero >= cant5);
        System.out.println(cant);
            //En 1000 hay un 625 = 4 ceros 
            //200+40+8+1
            
            
            
            
            
            
     
      
    }
    
}
