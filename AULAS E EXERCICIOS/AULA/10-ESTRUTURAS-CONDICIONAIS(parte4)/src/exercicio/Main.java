
package exercicio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int pernas;
       String tipo;
       Scanner teclado = new Scanner(System.in);
       
       System.out.print("INFORME A QUANTIDADE DE PERNAS:");
       pernas = teclado.nextInt();
      
       
       switch (pernas){
          case 1:
            tipo = "Saci";
            break;
            
          case 2:
              tipo = "Bipede";
              break;
              
          case 4:
            tipo = "Quadrúpede";
            break;
           
          default:
              tipo = "OUTROS TIPOS";
           
    }
       
    System.out.println(tipo);
       
    
       
       
       
    }  
       
    }
    

