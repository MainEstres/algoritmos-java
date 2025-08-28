package clases;

public class Algoritmos {

    public boolean esPar(int num) {
        return num % 2 == 0;  
    }

    public  boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public  String stringEnReversa(String texto){
        StringBuilder stringReversa = new StringBuilder(texto);
        return stringReversa.reverse().toString();
    }

   
    public  boolean esPalindromo(String texto){
        texto = texto.toLowerCase().trim().toString();

        String invertido = new StringBuilder(texto).reverse().toString();

        return texto.equals(invertido);
    }
}
