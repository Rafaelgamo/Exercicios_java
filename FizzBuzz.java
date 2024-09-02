public class FizzBuzz {
    public static void main(String[] args) {
        // Escreva um programa que imprime os números de 1 a 100
        //Para multiplos de 3, imprima "Fizz"
        //para mulltiplos de 5, imprima "Buzz"
        //para multiplos de 5 e 3, imprima "FizzBuzz"


        //definido varialvel contador
        int contador;

        for (contador = 1; contador <= 100; contador++) { //loop de repetição para exibir número de 1 até 100
            if (contador % 3 == 0 && contador % 5 == 0) {// lógica para econtar números muplidos de 5 e 3
                System.out.println("FizzBuzz"); //comando para exibir FizzBuzz no lugar dos números multiplos
            } else if (contador % 3 == 0) { //lógica de repetição para encontrar numeros multiplos de 3
                System.out.println("Fizz"); // exibição
            } else if (contador % 5 == 0) { //lógica de repetição para encontrar numeros multiplos de 5
                System.out.println("Buzz"); // exibição
            } else {  //se não estiver dentre os parametros acima imprime a contagem em  número
                System.out.println(contador); // exibição
            }
        }
    }
}



