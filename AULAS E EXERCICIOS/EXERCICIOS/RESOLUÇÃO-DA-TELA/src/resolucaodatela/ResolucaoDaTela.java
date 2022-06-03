
package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoDaTela {

   
    public static void main(String[] args) {
        Toolkit x = Toolkit.getDefaultToolkit();
        Dimension y = x.getScreenSize();
        
        System.out.println("SUA TELA TEM RESOLUÇÃO "+ y.width+" X "+y.height);
        
        
        
    
        
    }
    
}
