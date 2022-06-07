
package operadoreslogicoserelacionais;


public class Main {

    
    public static void main(String[] args) {
       // OPERADOR TERNARIO
        int n1,n2,r;
        n1 = 4;
        n2 = 5;
        
        // TRADUZINDO SE N1 FOR MAIOR DO N2 R = N1 SE NÃO R = N2
        r = (n1 > n2) ? n1:n2;
        System.out.println(r);
        
        System.out.println("=============================");
        
        int x1,x2,r1,r2;
        
        x1 = 10;
        x2 = 20;
        
        r1 = x1 > x2 ? x1:x2;
        System.out.println(r1);
       
          System.out.println("=============================");
        
       // TAMBEM ACEITA FORMULA O OPERADOR TERNARIO:
       
       r2 = x1 > x2 ? x1 * 3: x2 + 2;
        System.out.println(r2);
       
       System.out.println("=============================");
       
       int a,b;
       boolean c;
       a = 4;
       b = 5;
       c = a > b;
        System.out.println(c);
              
     System.out.println("=============================");  
    
    
    // OPERADOR LÓGICO:
    
    int k1,k2,k3; 
    boolean k4;
    
    k1 = 4;
    k2 = 7;
    k3 = 11;
    
    k4 = (k1 < k2 && k2 < k3) ? true: false;
    
        System.out.println(k4);
    
    
    
    
    
    }          
    
}
/*

==> OPERADORES LÓGICOS

>>> and => &&              or => ||                 or excluvisamente => ^      not => 

P   Q   P&&Q              P   Q     P||Q              P    Q    P ^ Q          P  !P

V   V     V               V    V      V               V     V     F            V   F
V   F     F               V    F      V               V     F     V            F   V
F   V     F               F    V      V               F     V     V
F   F     F               F    F      F               F     F     F




==> OPERADORES RELACIONAIS

>   >> MAIOR QUE >> 5 > 2 >> true

<   >> MENOR QUE >> 4 < 1 >> false

>=  >> MAIOR OU IGUAL A >> 8 >= 3 >> true

<=  >> MENOR OU IGUAL A >> 6 <= 6 >> true

== >> IQUAL A >> 9 == 8 >> false

!= >> DIFERENTE DE 4 != 5 >> true
    }
    
}
