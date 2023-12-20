public class Cadena6 {

    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Verificar y mostrar si cada palabra es un palíndromo
        for (String palabra : cadenas) {
            if (esPalindromo(palabra)) {
                System.out.println("La palabra '" + palabra + "' es un palíndromo.");
            } else {
                System.out.println("La palabra '" + palabra + "' NO es un palíndromo.");
            }
        }
    }

    // Función auxiliar para verificar si una palabra es un palíndromo
    private static boolean esPalindromo(String palabra) {
        // Convertir la palabra a minúsculas para comparación sin distinción entre mayúsculas y minúsculas
        palabra = palabra.toLowerCase();

        // Crear una versión invertida de la palabra
        String reversa = new StringBuilder(palabra).reverse().toString();

        // Comparar la palabra original con la versión invertida
        return palabra.equals(reversa);
    }
}

