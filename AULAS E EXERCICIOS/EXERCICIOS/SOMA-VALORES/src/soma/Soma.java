
package soma;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        float x1,x2,soma;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("DIGITE PRIMEIRO VALOR: ");
        x1 = teclado.nextFloat();
        System.out.print("DIGITE O SEGUNDO VALOR: ");
        x2 = teclado.nextFloat();
        
        soma = x1 + x2;
        
        System.out.println(x1 + " + " + x2 +" = "+ soma);
        
        
        
        
    }
    
}
