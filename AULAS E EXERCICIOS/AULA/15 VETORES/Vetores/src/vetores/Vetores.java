/*   DECLARAÇÃO DE ARRAYS EM JAVA

ARRAY EM JAVA:

=> UM ARRAY É UMA ESTRUTURA DE DADOS QUE ARMAZENA UMA COLEÇÃO SEQUENCIAL
DE TAMANHO FIXO DE ELEMENTO DO MESMO TIPO.

=> Os arrays são usados para armazenar uma coleção de dados, porem é inte-
ressante pensar neles como sendo coleção de variáveis do mesmo tipo.


=> PARA USARMOS UM ARRAY, PRIMEIRO DECLARAMOS UMA VARIÁVEL PARA
REFERENCIÁ-LO,e especificamos o tipo de array que será referenciado
(qualquer tipo,incluindo uma classe).

SINTAXE:

tipoDado[]variávelReferência;

EXEMPLO:

double[] salarios;

=> COMO CRIAR ARRAYS EM JAVA:

Criamos um array usando o operador new

SINTAXE:

tipoDado[] variávelReferência = new tipoDado[tamanhoArray];

Declaramos a variável array, criamo o array , e atribuimos a referência
do array á variável de uma só vez.

COMO CRIAR ARRAYS EM JAVA- EXEMPLO

=>Vamos criar um array de nome valores com 5 elemento do tipo double:

doudle[] valores = new double[10];

os elemento do tipo array são acessados por meio de seu número de indice.

os indices são numerados a partir de 0, ou seja, o array começa em 0 e vai até 
variávelreferência.legth - 1

=> ATRIBUIR VALORES AO ARRAY

=> Podemos atribuir valores a um array por meio do número de indice de cada posição.

-valores[0] = 5.0;
valores[1] = 4.8;
valores[2] = 7.9;
valores[3] = 4.2;
valores[4] = 6.4;

=> Atribuir valores ao Array durante a criação

O array também pode ser criado a partir de uma lista de valores, atribuidos durante a sua 
criação:

int[] numeros = {45,85,96,12,32};

=> Chamamos a esta lista de LISTA DE INICIALIZAÇÃO.

=> tRABALHANDO COM aRRAYS

Para processar um array geralmente usamos os laçõs for ou foreach, pois o tamanho do array
é conhecido e todos os seus elementos são de mesmo tipo.

Exemplo completto a sequir:




*/
