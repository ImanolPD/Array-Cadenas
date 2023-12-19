public class Cadena7 {
    public static void main(String[] args) {
        // Datos de entrada
        String[] cadenas = {"Sue", "Charlotte", "Anna", "Mike", "William", "Ed"};
        String subcadenaBuscada = "zar";
        int contador = 0;

        // Contar y mostrar la cantidad de cadenas que contienen la subcadena "zar"
        for (String cadena : cadenas) {
            if (cadena.contains(subcadenaBuscada)) {
                contador++;
            }
        }

        System.out.println("Cantidad de cadenas que contienen la subcadena '" + subcadenaBuscada + "': " + contador);
    }
}
