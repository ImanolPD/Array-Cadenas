public class Cadena9 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int posicion = 0;

        // Encontrar y mostrar la cadena más larga y su posición
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].length() > cadenas[posicion].length()) {
                posicion = i;
            }
        }

        System.out.println("La cadena más larga es: " + cadenas[posicion] +
                           ", en posición: " + (posicion + 1));
    }
}
