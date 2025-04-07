/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2_ejercicio8;
import java.util.Scanner;
/**
 *
 * @GLORIA PAULINA MORENO SALDIVAR
 */
public class Act2_Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        int num, contador=0, suma=0;
        double media;
        
        do
        {
            System.out.println("Ingrese el numero positivo");
            num = asignar.nextInt();
            
            suma = suma + num;
            contador++;
            
        }while(0 < num);
        media = suma/contador;
        System.out.println("La media de los numeros ingresados es " +media);
    }
    
}
