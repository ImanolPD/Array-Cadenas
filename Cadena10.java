public class Cadena10 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Identificar y mostrar palabras duplicadas
        for (int i = 0; i < cadenas.length - 1; i++) {
            for (int j = i + 1; j < cadenas.length; j++) {
                if (cadenas[i].equalsIgnoreCase(cadenas[j])) {
                    System.out.println("Palabra duplicada: " + cadenas[i]);
                }
            }
        }
    }
}
