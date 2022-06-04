package tipoprimitivo;

import java.util.Scanner;

public class TipoPrimitivo {

    public static void main(String[] args) {
        
        int x;
       
        Scanner teclado = new Scanner(System.in);
        
  
        
        
        
        float valor = 4.86f;
        
        System.out.println("SUA NOTA É "+ valor);
        
        System.out.printf("SUA NOTA É %.4f",valor);
        System.out.println();
        System.out.println("SUA NOTA É "+ valor);
        System.out.println("INFORME UM VALOR: ");
        x = teclado.nextInt();
        //teclado.close();
        
        
        
        
        
        
       
    }   
}
/*
                TIPO PRIMITIVO:


=>>>>>> DECLARAÇÃO DE TIPO:

=> USANDO MODELO TRADICIONAL

int idade = 3;
float preco = 3.56f;
char letra = 'A';
boolean = casado = false


=> USANDO TYPECAST

int idade = (int)= 3;
float preco = (float) = 3.56;
char letra = (char) = 'A';
boolean casado = (boolean) false ;


=> USANDO WRAPPER CLASS//CLASSE ENVÓLUCRO

Integer idade = new Interger(3);
Float preco = new Float(3.56);
Character letra = new Character letra('A');
Boolean casado = new Boolean(false);

================================================================================================================

 FAMILIA     TIPO PRIMITIVO    CLASSE ENVÓLUCRO   TAMANHO       EXEMPLO
=========    ==============    ================   =======       =======
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
=> LÓGICO      ºboolean        ºBoolean           ºbit           True
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
=> LITERAIS    ºchar           ºCharacter         ºbyte           'A'
              -----            ºString            º1byte/cada     "JAVA" 
 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
=> INTEIRO   ºbyte             ºByte              º 1 byte          valor até 127
             ºshort            ºShort             º 2 bytes         valor até 32767 mil
             ºint              ºInteger           º 4 bytes         valor até 2 147 483 milhão
             ºlong             ºLong              º 8 bytes         valor  até 2^63

>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
=>REAIS      ºfloat           ºFloat              º 4 bytes          valor até 3.4e+38                        
             ºdouble          ºDouble             º 8 bytes          valor até 1.8e+308


+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

               
                  SAIDA DE DADOS

float nota = 8.5f;

System.out.print("SUA NOTA É" + nota);
System.out.println("SUA NOTA É " + nota); "println pula linha"
System.out.printf("SUA NOTA É %.2f",nota); "printf formatado .2 é o tanto de casa decimais"

                  ENTRADA DE DADOS

=> PARA ENTRADA DE DADOS PRECISA IMPORTA CLASSE Scanner

import java.util.Scanner;

=> DESPOIS DE IMPORTADO A CLASSE Scanner PARA ATIVA PRECISAMOS CRIAR UM OBJETO

Scanner teclado = new scanner(System.in);

>>> DESPOIS DO OBJETO CRIADO existem varios metodos pra ler valor diferentes:

> inteiro

int idade = teclado.nextInt();

> REIAS

float idade = teclado.nextFloat();

> String

String nome = teclado.nextline















*/