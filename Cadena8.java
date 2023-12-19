public class Cadena8 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        char letraBuscada = 'A';
        int contador = 0;

        // Contar y mostrar la cantidad de cadenas que comienzan con la letra 'A'
        for (String cadena : cadenas) {
            if (cadena.startsWith(String.valueOf(letraBuscada)) || cadena.startsWith(String.valueOf(Character.toLowerCase(letraBuscada)))) {
                contador++;
            }
        }

        System.out.println("Cantidad de cadenas que comienzan con la letra '" + letraBuscada + "': " + contador);
    }
}
