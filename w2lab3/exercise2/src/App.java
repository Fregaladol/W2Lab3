import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*  2- ArrayList de números enteros:
        • Pedir cuantos números quiere el usuario entrar
        • Hacer entrada de datos (números) en el bucle
        • Cuando tengas el ArrayList completo, hacer la media de todos los números y dar ese resultado en pantalla */

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
 

        System.out.println("Cuantos números enteros quieres ingresar?");
        int numberIntegers = scanner.nextInt();
        scanner.nextLine();

        int counter = 0;
        System.out.println("Agrega tus números");

        do {
            if (scanner.hasNextInt()){
                myList.add(scanner.nextInt());
                counter +=1;
                System.out.printf("Se ha agregado el número, te quedan por agregar %d.\n",numberIntegers-counter);
            } else {
                System.out.println("El número que intentas agregar No es un entero");
            }

        } while (myList.size()<numberIntegers);

        System.out.println("La lista es la siguiente:");
        System.out.println(myList);

        int sum = 0;
        for (int num : myList) {
            sum += num;
        }

        float average = (float) sum / myList.size();

        System.out.printf("La media de la lista es: %.3f", average);

        scanner.close();


    }
}
