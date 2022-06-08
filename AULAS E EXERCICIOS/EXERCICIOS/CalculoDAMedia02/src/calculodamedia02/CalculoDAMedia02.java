
package calculodamedia02;

import java.util.Scanner;


public class CalculoDAMedia02 {

    public static void main(String[] args) {
             float n1, n2, media;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("DIGITE A PRIMEIRA NOTA: ");
        n1 = teclado.nextFloat();
        
        System.out.print("DIGITE A SEGUNDA NOTA: ");
        n2 = teclado.nextFloat();
        
        media = (n1 + n2) / 2;
       
        System.out.println("A MEDIA DO ALUNO FOI " + media);
       
        if(media >= 7){ 
            System.out.println("ALUNO APROVADO...");   
        }  
        else{
            System.out.println("ALUNO REPROVADO...");
        }
    }
    
}
