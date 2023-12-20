public class Cadena8 {

    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        char letraBuscada = 'A';

        // Contar y mostrar la cantidad de cadenas que comienzan con la letra 'A'
        int contador = contarCadenasQueEmpiezanCon(cadenas, letraBuscada);

        // Imprimir el resultado
        System.out.println("Cantidad de cadenas que comienzan con la letra '" + letraBuscada + "': " + contador);
    }

    // Función auxiliar para contar cadenas que comienzan con una letra específica
    private static int contarCadenasQueEmpiezanCon(String[] cadenas, char letra) {
        int contador = 0;

        for (String cadena : cadenas) {
            if (empiezaCon(cadena, letra)) {
                contador++;
            }
        }

        return contador;
    }

    // Función auxiliar para verificar si una cadena comienza con una letra específica (mayúscula o minúscula)
    private static boolean empiezaCon(String cadena, char letra) {
        return cadena.startsWith(String.valueOf(letra)) || cadena.startsWith(String.valueOf(Character.toLowerCase(letra)));
    }
}
