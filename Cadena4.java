public class Cadena4 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Contar y mostrar la cantidad de letras mayúsculas y minúsculas en cada cadena
        for (String cadena : cadenas) {
            int mayusculas = 0;
            int minusculas = 0;

            for (char c : cadena.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                } else if (Character.isLowerCase(c)) {
                    minusculas++;
                }
            }

            System.out.println("En la cadena '" + cadena + "' hay " + mayusculas + " mayúsculas y " +
                               minusculas + " minúsculas.");
        }
    }
}
