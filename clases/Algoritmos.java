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

    public void secuenciaFizzBuzz(int num){
        for(int  i = 0; i < num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if ( i % 3 == 0){
                System.out.println("Fizz");
            }else if( i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
