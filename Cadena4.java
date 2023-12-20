public class Cadena4 {

    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Contar y mostrar la cantidad de letras mayúsculas y minúsculas en cada cadena
        for (String cadena : cadenas) {
            int mayusculas = contarMayusculas(cadena);
            int minusculas = contarMinusculas(cadena);

            // Mostrar el resultado para cada cadena
            System.out.println("En la cadena '" + cadena + "' hay " + mayusculas + " mayúsculas y " +
                               minusculas + " minúsculas.");
        }
    }

    // Función auxiliar para contar las letras mayúsculas en una cadena
    private static int contarMayusculas(String cadena) {
        int count = 0;

        for (char c : cadena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }

    // Función auxiliar para contar las letras minúsculas en una cadena
    private static int contarMinusculas(String cadena) {
        int count = 0;

        for (char c : cadena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                count++;
            }
        }

        return count;
    }
}
