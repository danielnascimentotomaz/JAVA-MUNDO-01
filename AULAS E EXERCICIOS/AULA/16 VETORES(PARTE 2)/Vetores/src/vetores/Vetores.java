
package vetores;

import java.util.Arrays;

public class Vetores {

  
    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        
        // PERCORRER A LISTA(USANDO FOR INT)
        for(int x: n){
        System.out.println(x);
        }
        System.out.println("=================");
        // TAMANHO DO VETOR
        System.out.println("TAMANHO DO VETOR: "+ n.length);
        
        System.out.println("=================");
        // PERCORRER A LISTA PELO INDICE
        for(int c = 0; c < n.length; c++){
            System.out.println("POSIÇÃO "+ c +" VALOR: "+ n[c]);
        }
        
       String mes[]  = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Set","out",
           "Nov","Dez" };
       
       for(String u: mes){
           System.out.println("O MÊS DO ANO: " + u);
           
       }
       
      System.out.println("=================");
       
       // VETOR EM ORDEM
       
     Arrays.sort(n);
     
     for(int y : n){
         System.out.println(y);
     
     }
     
     // BUSCA BINARIA
     
     int pos = Arrays.binarySearch(mes,"Jan");
     System.out.println("ENCONTREI O MÊS NA POSIÇÃO: " + pos);
     
       System.out.println("=================");

    //PREENCHER TODO VETOR COM MESMO VALOR
     
     int [] vetor = new int[5];
     Arrays.fill(vetor, 1);
     
     for(int u: vetor){
         System.out.println(u);
     
     }
     
     
     
       
       
       
        
        
    }
    
}
