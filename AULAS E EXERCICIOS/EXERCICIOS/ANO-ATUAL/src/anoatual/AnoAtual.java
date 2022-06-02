
package anoatual;

import java.text.SimpleDateFormat;
import java.util.Date;


public class AnoAtual {

   
    public static void main(String[] args) {
        String resultado;
        Date ano = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("y");
        resultado = formatar.format(ano);
        System.out.println("ANO ATUAL: "+ resultado);
        
        
        
        
      
    }
    
}
