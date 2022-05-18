import java.util.Scanner;

public class InverteFrase{

    public static void main(String args[]){       
        Scanner input = new Scanner(System.in);        
        
        System.out.println("Digite uma frase");
        
        String frase = input.nextLine();//armazena frase 

        String[] ar = frase.split(" ");//cria array com palavras da frase
        
        //mostrando array
        System.out.println("\nImprimindo array:");
        for (int i = 0; i < ar.length; ++i){            
            System.out.printf("Elemento %d: %s\n", i, ar[i]);
        }
        
        //empilhando array        
        Pilha pilha = new Pilha(ar.length);        
        for (int cont = 0; cont < ar.length; ++cont){
            pilha.push(ar[cont]);
        } 

        //imprimindo pilha
        System.out.printf("\nEmpilhamento:\n");
        pilha.apenasImprimir();
        
        System.out.printf("\nDesempilhamento:\n");
        pilha.imprimirRetirar();        
    }
    
}