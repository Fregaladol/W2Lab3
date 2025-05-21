public class App {
    public static void main(String[] args) throws Exception {
        /* 3- En la siguiente frase:

        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";

        Decir si existe la letra "e", cuántas veces aparece, y en qué posiciones. */

        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";

        char findLetter = 'e';
        int counter = 0;

        for (int i = 0; i < fraseAleatoria.length(); i++) {
            if (fraseAleatoria.charAt(i) == findLetter) {
                counter += 1;
            }
        }

        System.out.printf("Dento de la variable fraseAleatoria, %s , encuentras %d veces la letra e.\n", fraseAleatoria,counter);

    }
}
