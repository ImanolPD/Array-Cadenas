public class Cadena2 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        int posicion = 0;

        // Encontrar la primera cadena alfabéticamente
        for (int i = 1; i < cadenas.length; i++) {
            if (cadenas[i].compareTo(cadenas[posicion]) < 0) {
                posicion = i;
            }
        }

        // Mostrar la primera cadena y su posición
        System.out.println("La primera cadena alfabéticamente es " + cadenas[posicion] +
                           ", en la posición " + (posicion + 1));
    }
}
