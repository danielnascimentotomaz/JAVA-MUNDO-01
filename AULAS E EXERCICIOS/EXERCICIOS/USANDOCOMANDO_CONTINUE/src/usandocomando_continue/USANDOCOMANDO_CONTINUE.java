
package usandocomando_continue;


public class USANDOCOMANDO_CONTINUE {

    
    public static void main(String[] args) {
              int contador;
      contador = 0;
      while(contador < 10){
          contador = contador + 1;
         
          if (contador == 5){// VAI PULAR O NÚMERO 5
              continue;
          }
        System.out.println(contador);
      }
        
    }
    
       
    }
    

