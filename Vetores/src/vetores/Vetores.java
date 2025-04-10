/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author GUSTAVO
 */
public class Vetores {

    public static void main(String[] args) {
        
        //  int a [] = {3,5,8,2}; // declaração de vetor fixo
        
            int n [] = new int[4]; //declaração de vetor
          
             n[0] = 3; //atribuição
          
             n[1] = 5;
          
             n[2] = 8;
          
             n[3] = 2;
             
             //System.out.println("Total de casas de n " + n.length); //mostra a quantidade de um vetor
          
         /*   for (int i = 0; i < 4; i++) {  //mostrar um vetor
               System.out.print(n[i] + " "); //mostrar n(vetor) na posição de i(variavel do for)
               System.out.println("Na posição " + i + " temos o vetor " + n[i]); //exemplificação
        }
          */
         
        // Arrays.sort(n); //deixa o vetor em ordem
        // Arrays.fill(n, 10); //muda os valores do vetor
        
         for(int valor: n ){            //outro metódo de mostar um vetor
             System.out.println(valor);
             
         }
        
        
    }
    
}
