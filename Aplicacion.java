import clases.Algoritmos;

public class Aplicacion {

    public static void main(String[] args) {

        Algoritmos alg = new Algoritmos();

        boolean par = alg.esPar(5);
        boolean primo = alg.esPrimo(18);
        String reversaString = alg.stringEnReversa("Hola");
        boolean palindromo = alg.esPalindromo("radar");

        System.out.println("El numero 5 es par: " + par);
        System.out.println("El numero 18 es primo: " + primo);
        System.out.println(reversaString);
        System.out.println("La palabra es un palindromo "  + palindromo);
    }

}
