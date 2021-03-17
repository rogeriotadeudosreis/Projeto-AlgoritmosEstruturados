/*
Escrever um algoritmo que, partindo de diferentes estados iniciais, produza os valores:
2 4 6 8 10 12 14
 */
package exercicios;

public class Exercicio_01 {

    public static void main(String[] args) {

        int numInicial = 0;
        int numFinal = 14;
        int resultado = numInicial;

        while (resultado < numFinal) {

            resultado += 2;
            System.out.print(resultado + " ");

        }
        System.out.print("\n---------------------------------------------------");
        System.out.println("\nOutra forma de fazer para obter o mesmo resultado");

         numInicial = 4;
         numFinal = 14;
         resultado = 0;
        while (resultado < numFinal) {
            resultado += numInicial - 2;
           
            System.out.print(resultado + " ");
        }

        System.out.println("\nFim do algoritmo!");
    }

}
