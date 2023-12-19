public class Cadena11 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Inicializar variables para el seguimiento de la cadena con más vocales
        int maxVocales = 0;
        String cadenaConMasVocales = "";
        int posicion = -1;

        // Iterar sobre cada cadena
        for (int i = 0; i < cadenas.length; i++) {
            int conteoVocales = 0;
            // Convertir la cadena a minúsculas para facilitar la comparación
            String cadenaActual = cadenas[i].toLowerCase();

            // Iterar sobre cada carácter y contar las vocales
            for (char c : cadenaActual.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    conteoVocales++;
                }
            }

            // Verificar si la cadena actual tiene más vocales que la cadena con más vocales hasta ahora
            if (conteoVocales > maxVocales) {
                maxVocales = conteoVocales;
                cadenaConMasVocales = cadenas[i];
                posicion = i + 1;  // Ajustar la posición a la forma humana (empezando desde 1)
            }
        }

        // Mostrar la cadena con más vocales y su posición
        System.out.println("La cadena con más vocales es: " + cadenaConMasVocales +
                           ", con " + maxVocales + " vocales, en posición: " + posicion);
    }
}
