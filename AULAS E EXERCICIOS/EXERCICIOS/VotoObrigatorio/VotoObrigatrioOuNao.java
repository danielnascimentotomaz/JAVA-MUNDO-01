
package exercicio;

import java.util.Scanner;


public class VotoObrigatrioOuNao {

    public static void main(String[] args) {
        int idade;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("INFORME SUA IDADE:");
        idade = teclado.nextInt();
        
        if(idade < 16){
            System.out.println("NÃO VOTA.");
        }
        
        else if((idade >= 16 && idade <= 18)||(idade>= 70)){
            System.out.println("VOTO OPCIONAL.");
        }
       
        else{
            System.out.println("VOTO OBRIGATÓRIO.");
        
        }        
    }
    
}
