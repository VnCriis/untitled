import java.util.Scanner;
public class Ejercicio {
    public static void  main(String[] args){
        float temp, time;
        Scanner entry = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        temp = entry.nextFloat();
        System.out.println("Ingrese el tiempo disponible: ");
        time = entry.nextFloat();
        if (temp > 25 && time > 5){
            System.out.println("A la playa!!");
        } else if (temp > 15 && time > 5) {
            System.out.println("A la montaña!!");
        } else if (temp < 5 && time > 5) {
            System.out.println("A descansar.... zzz");
        }
    }
}
