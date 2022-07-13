
package exemplo;


public class Exemplo {

    public static void main(String[] args) {
        double[] valores = new double[6];
        
        // preencher o array:
        
        valores[0] = 6.0;
        valores[1] = 7.5;
        valores[2] = 8.2;
        valores[3] = 2.3;
        valores[4] = 1.5;
        valores[5] = 4.9;
      
        // Acessando seu quinto elemento (número de posição 4)
        System.out.println("ELEMENTO 5 DO ARRAY: " + valores[4]);
        
        //  Alterando os valores de duas posições no array:
        valores[0] = 2.3;
        valores[4] = 7.1;
        
        // Mostra todos os elementos do array(for int)
        
        for(double elemento: valores){
            System.out.println(elemento);
        
        }
        
        
    }
    
}
