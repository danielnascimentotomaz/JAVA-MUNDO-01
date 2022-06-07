
public class OperadoresAritmetico {
    
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        
        float n3 =(n1 + n2)/2;
        System.out.printf("A MÉDIA É IQUAL %.2f\n",n3);
         System.out.println("=====================");
        // INCREMENTO
        int x = 6;
        x++;
        int io = 10;
        int pix = 4 + io++;
        System.out.println("............"+ pix);
        System.out.println(x);
        
        
        // DECREMENTO
        
        int w = 5;
        w--;
        System.out.println(w);
        
         System.out.println("=====================");
        ////////////////////////////////////////////////////////////////////////
       // ++  quando vem despois do número significa o sequinte,ultiliza-se número despois soma + 1
       /// => PÓS INCREMENTO
       int numero = 999;
       int valor = 4 + numero++;
       System.out.println(valor);
       System.out.println(numero);
       
       // quando ++ vem ante do número o número ja ta pré inclemetado
       //=> PRÉ INCREMENTO
        System.out.println("=====================");
       int j = 599;
       int k =1  +  ++j;
       System.out.println(k);
       System.out.println(j);
      
      //////////////////////////////////////  
      /// IDEIA ANALOGA PRA O DECREMENTO  
     ////////////////////////////////////////////   
       System.out.println("=====================");
      float raiz ;
      
      raiz = (float) Math.sqrt(25);  // TEMOS QUE USAR TYPECAST
      
      System.out.println(raiz);
      
      
      
      // GERA NÚMERO ALEÁTORIO
      
      System.out.println("=====================");
      
      
     double aleatorio;
     
     aleatorio = Math.random();
     
     System.out.println(aleatorio);
     ////////////////////////////////////
     System.out.println("=====================");
     // GERA UM NÚMERO ENTRE X ATÉ Y; EX: X= 5 ATÉ Y = 10
     
     int inteiro;
     
     inteiro = (int) (1 + aleatorio * (6- 1));
     
     System.out.println(inteiro);
     
     
     
     
     
     
     
     
     
        
    }
    
}

/*
      ============== OPERADADORES ARITMÉTICO ========================


SOMA = +
SUBTRAÇÃO = -
DIVISÃO = /
MULTIPLICAÇÃO = *
RESTO => %


>>>>>>>> OPERADORE UNÁRIOS

++ => INCREMENTO => a++ => a = a + 1 

-- => DECREMENTO => a-- => a = a - 1


===== OPERADORES DE ATRIBUIÇÃO:

+= => SOMA E ATRIBUIR => a += b => a = a + b
-= => SUBTRAIR E ATRIBUIR => a -= b => a = a - b
*= => MULTIPLICAR E ATRIBUIR => a *= b => a = a * b
/= => DIVIDIR E ATRIBUIR => a /= b => a = a / b
%= => RESTO ATRIBUIR => a %= b => a = a % b


========= CLASSE math ========

PI => CONSTANTE =>  Math.PI => 31415
POW => EXPONENCIAÇÃO => Math.pow(5,2) => 25
SQET => RAIZ QUADRADA => Math.sqrt(25) => 5
CBRT => RAIZ CÚBICA => Math.cbrt(27) => 3

=> ARREDONDAMENTO:

ABS => VALOR ABSOLUTO => Math.abs(-10) => 10
FLOOR => ARREDONDA PARA BAIXO => Math.floor(3.9) => 3
CEIL => ARRREDONDA PARA CIMA => Math.ceil(4.2) => 5
ROUND => ARREDONDA ARITMETICAMENTE => Math.round(5.6) =>6 

=> GERADORES DE NÚMEROS:

Math.random() => VAI GERA UM NÚMERO ENTRE 0.0 A 1.0



*/