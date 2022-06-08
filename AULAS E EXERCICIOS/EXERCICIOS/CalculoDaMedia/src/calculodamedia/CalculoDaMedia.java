
package calculodamedia;

import java.util.Scanner;


public class CalculoDaMedia {

 
    public static void main(String[] args) {
            float n1, n2, media;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("DIGITE A PRIMEIRA NOTA: ");
        n1 = teclado.nextFloat();
        
        System.out.print("DIGITE A SEGUNDA NOTA: ");
        n2 = teclado.nextFloat();
        
        media = (n1 + n2) / 2;
        System.out.println("SUA MÉDIA FOI "+ media);
       
        if(media >= 7){ 
            System.out.println("ALUNO APROVADO.");   
        } 
        
    }
    
}
