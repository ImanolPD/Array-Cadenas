public class Cadena3 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};

        // Contar y mostrar la cantidad de letras mayúsculas en cada cadena
        for (int i = 0; i < cadenas.length; i++) {
            int mayusculas = 0;
            for (char c : cadenas[i].toCharArray()) {
                if (Character.isUpperCase(c)) {
                    mayusculas++;
                }
            }
            System.out.println("En la posición " + (i + 1) + " hay " + mayusculas + " letras mayúsculas.");
        }
    }
}
