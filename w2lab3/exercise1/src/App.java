import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
     public static void guessListPrint(ArrayList<String> array) {
        System.out.println("La lista actualizada de la fiesta es la siguiente:");
        for (int i=0;i<array.size();i++){
            System.out.printf("%d.- %s\n",i+1,array.get(i));;
        }
        
    }
    public static void main(String[] args) throws Exception {
        
    /* 1- FIESTA EN TU CASA!  (JAVA VERSION)

    Montas una fiesta este finde en tu casa!
    Tienes una lista de 10 invitados en un arraylist

    – Michael, que estaba el primero de la lista, resulta que está de viaje y no puede venir
    – Te llama la Pepi que se apunta con su novio Silvester
    – Te encuentras a Eva, que dice que le cueles la tercera
    – Resulta que hay otra fiesta al lado la misma noche, con 10 personas más,  y toda esa gente dicen que les gusta vuestra música que se apuntan a tu fiesta!
    – Mostrar la lista definitiva de invitados en orden alfabético. En un momento dado, tienes curiosidad por saber quién es el último de la lista (mostrarlo)
    – Además, con tanto lío, te entra la duda de si tu amigo Pedro está incluído en la lista o no. Si está, decir en qué posición está. Si no, decir que no está.

    A cada paso debe ir actualizándose la la lista de invitados en tu casa y qué proceso has hecho. */
    
    ArrayList<String> guessList = new ArrayList<>(Arrays.asList("Michael","Albert", "Francisco", "Sebastian", "Emilia", "Alejandro", "Jorge", "Victor", "Cristian", "Elisabeth"));

    guessListPrint(guessList);
    
    System.out.println("Michael, que estaba el primero de la lista, resulta que está de viaje y no puede venir");
    guessList.remove(0);
    guessListPrint(guessList);

    guessList.addAll(Arrays.asList("Pepi","Silvester"));
    System.out.println("Hay dos invitados nuevos");
    guessListPrint(guessList);

    guessList.add("Eva");
    System.out.println("Una colada más");
    guessListPrint(guessList);

    ArrayList<String> morePeople = new ArrayList<>(Arrays.asList("Jd", "Aranzazu","Matias", "Romain","Andrea","Lau","Albert","Pepe","Juan","Romina"));
    guessList.addAll(morePeople);
    System.out.println("Se arma el botellon");
    guessListPrint(guessList);

  
    System.out.println("La lista en orden alfabetico es:");
    Collections.sort(guessList, String.CASE_INSENSITIVE_ORDER);
    guessListPrint(guessList);
    
    System.out.printf("Sabes que %s es el último en la lista ?\n", guessList.get(guessList.size()-1));

     if (guessList.indexOf("Pedro") != -1){
        System.out.printf("Pedro esta en la posición %d de la lista.\n",guessList.indexOf("Pedro")+1);

     } else {
        System.out.println("Pedro no esta en la lista ;__;");
     }


    }
}
