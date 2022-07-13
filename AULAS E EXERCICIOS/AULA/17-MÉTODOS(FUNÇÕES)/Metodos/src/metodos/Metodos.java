/*   MÉTODO
=> Em java não existem uma palavra especifica pra  pra função pra procedimento
na verdade é chamado de método, não existem uma palavra chave pra criar um método.

=> um método faz a identificação pelo tipo de retorno

=> Procedimento não retorna valor usa a palavra void

=> O método main ele é static o médodo static ele serve para classe não pra uma instacia,
então eu não posso chama um método dentro de um método static se esse método também
não for static



*/
package metodos;


public class Metodos {
      
     // Método sem retorno
      static void soma(int a, int b){
        int s = a + b;
        System.out.println(s);
    }
      
      // Método com retorno
      
     static int resultado(int x, int y){
          
          int z = x + y;
          return z;
      
      }

    public static void main(String[] args) {
        soma(2,4);
        
        int T = resultado(2,5);
        System.out.println(T);
       
       
    }
    
}
