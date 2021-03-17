/*
Escreve um algoritmo que, partindo de diferentes estados iniciais,
produza os valores > 1 3 5 7 9 11 13

 */
package exercicios;

public class Exercicio_02 {

    public static void main(String[] args) {
        int numInicial = 1;
        int numFinal = 13;
        int resultado = numInicial;
        
        while (resultado <= numFinal){
            System.out.print(resultado + " ");
            resultado += 2;
        }
        System.out.println("\nFim do algoritmo!");
    }

}
