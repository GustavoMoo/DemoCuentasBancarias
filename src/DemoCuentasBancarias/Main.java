/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoCuentasBancarias;

import java.util.Scanner;
import modelo.CuentaBasica;

/**
 *
 * @author gusta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
        
        CuentaBasica micuenta = new CuentaBasica(1, "Gustavo",50);
                
        int menu;
       
        
        do
        {       
        System.out.println("Selecciona una opcion");
        System.out.println("1.- Consulta de Saldo");
        System.out.println("2.- Deposito");
        System.out.println("3.- Retirar");
        System.out.println("4.- Cuenta de Ahorro");
        System.out.println("5.- Salir");

        menu=entrada.nextInt();
        
        if (menu == 1)
        {
         System.out.println("El saldo de la cuenta es de: " + micuenta.getSaldo());
        }
        else
        {
            if(menu == 2)
            {
                double deposito;
                System.out.print("Ingresa la cantidad a Depositar: $");
                deposito=entrada.nextDouble();
                micuenta.depositar(deposito);
            }
            else
            {
                if (menu == 3)
                {
                    double retirar;
                    System.out.println("Ingresa la cantidad a Retirar: $");
                    retirar=entrada.nextDouble();
                    micuenta.retirar(retirar);
                
                
                }   
            }
        }
        
        }while (menu != 5);
        
    }
        }

        
        


        
        
    

        

        
        
    
    
  
        
     