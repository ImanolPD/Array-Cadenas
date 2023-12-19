public class Cadena1 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        // Array para almacenar la longitud de cada cadena
        int[] longitudCadenas = new int[cadenas.length];

        // Calcular y mostrar la longitud de cada cadena
        for (int i = 0; i < cadenas.length; i++) {
            longitudCadenas[i] = cadenas[i].length();
            System.out.println("Longitud de " + cadenas[i] + ": " + longitudCadenas[i]);
        }
    }
}
