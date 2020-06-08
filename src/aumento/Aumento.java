/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumento;

import java.util.Scanner;

/**
 *
 * @author João Pedro Gambirasio da Rosa
 */
public class Aumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

           double cod310, cod456, cod885, salario, offcode, dif1, dif2, dif3, dif4;
           
           Scanner scan = new Scanner (System.in);
           Scanner entrada = new Scanner (System.in);
           Scanner ler = new Scanner (System.in);
           
           
           System.out.println("Informe seu salario:");
           salario = scan.nextDouble();
           
          
           cod310 = salario+(salario*(5.0/100));
           cod456 = salario+(salario*(7.5/100));
           cod885 = salario+(salario*(10.0/100));
           offcode = salario+(salario*(15.0/100));
           dif1 = cod310-salario;
           dif2 = cod456-salario;
           dif3 = cod885-salario;
           dif4 = offcode-salario;
           
           System.out.println("1 - Se seu código for 310 digite 1:\n2 - Se seu código for 456 digite 2:\n3 - Se seu código for 885 digite 3:\n4 - Se seu código não está listado digite 4:");
           int num = entrada.nextInt();
               switch(num){
                   case 1:
                       System.out.println("Seu salario atual: R$" +salario+ " Seu aumento é de: R$" +dif1+ " Seu novo salario é de R$" +cod310);
                       break;
                   case 2:
                       System.out.println("Seu salario atual: R$" +salario+ " Seu aumento é de: R$" +dif2+ " Seu novo salario é de R$" +cod456);
                       break;
                   case 3:
                       System.out.println("Seu salario atual: R$" +salario+ " Seu aumento é de: R$" +dif3+ " Seu novo salario é de R$" +cod885);
                       break;
                   case 4:
                       System.out.println("Seu salario atual: R$" +salario+ " Seu aumento é de: R$" +dif4+ " Seu novo salario é de R$" +offcode);
                       break;
                   default: 
                       System.out.println("Código Invalido");
                       break;
               }
            
           }
  }


