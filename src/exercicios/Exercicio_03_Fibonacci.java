package exercicios;

// Escreva um algoritmo que imprima a sequencia de fibonacci
// até o valor do número informado pelo usuário

public class Exercicio_03_Fibonacci {
    
    public static void main(String[] args) {
        
        int numero = 50;
        int fibonacci = 0;
        int primTermo = 1;
        int segTermo = 1;
        
        if(primTermo < numero){           
            System.out.print(primTermo + " ");
        }
        
        if (segTermo < numero) {
            System.out.print(segTermo + " ");
        }
        
            fibonacci = primTermo + segTermo;
        while(fibonacci < numero){
            System.out.print(fibonacci + " ");
            primTermo = segTermo;
            segTermo = fibonacci;
            fibonacci = primTermo + segTermo;
        }
        
        
        
    }
    
}
