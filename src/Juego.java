import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = (int) (Math.random() * 30 )+ 1980; // año aleatorio
        int month = (int) ((Math.random() * 12)+1); // mes aleatorio
        int day = (int) ((Math.random() * 31)+1); // día aleatorio
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        int y; // Número para el año
        int m; // Número para el mes
        int d; // Número para el día
        int i; // Contador para bucle for

        System.out.println("Ingresa el año entre 1990 y 2010");

        System.out.print("Tienes 5 intentos. Escribe un número entre 1990 y 2010: ");
        y = sc.nextInt();

        for (i=0; i<=4; i++) {

            // Primero se evalúa si se ha acertado.

            if (year == y) {
                System.out.println("¡Has acertado!");
                break; }

            // Luego da la partida por perdida si ya has gastado 5 intentos.

            else if (i == 4) {
                System.out.println("Lo siento: ¡has perdido!. El número era el: " + year);
                break; }

            // Si no es ninguno de los casos anteriores, comparamos números.

            else if (year > y)
                System.out.println("El número secreto es MAYOR que " + y);
            else if (year < y)
                System.out.println("El número secreto es MENOR que " + y);

            // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.

            if (i <=1) {
                System.out.print("Otro intento: ");
                y = sc.nextInt(); }
            else if (i ==2) {
                int x = (int) (year/10);
                System.out.println("Una pista, la primera cifra es " + x);
                System.out.print("Inténtalo de nuevo: ");
                y = sc.nextInt(); }
            else if (i >= 3) {
                System.out.print("Oh, oh... ÚLTIMO intento: ");
                y = sc.nextInt(); }
        }
        System.out.println("El juego consiste en averiguar un número secreto de 12 posibles.");

        System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 12: ");
        m = sc.nextInt();
        for (i=0; i<=4; i++) {

            // Primero se evalúa si se ha acertado.

            if (month == m) {
                System.out.println("¡Has acertado!");
                break; }

            // Luego da la partida por perdida si ya has gastado 5 intentos.

            else if (i == 4) {
                System.out.println("Lo siento: ¡has perdido!. El número era el: " + month);
                break; }

            // Si no es ninguno de los casos anteriores, comparamos números.

            else if (month > m)
                System.out.println("El número secreto es MAYOR que " + m);
            else if (month < m)
                System.out.println("El número secreto es MENOR que " + m);

            // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.

            if (i <=1) {
                System.out.print("Otro intento: ");
                m = sc.nextInt(); }
            else if (i ==2) {
                int x = (int) (month/10);
                System.out.println("Una pista, la primera cifra es " + x);
                System.out.print("Inténtalo de nuevo: ");
                m = sc.nextInt(); }
            else if (i >= 3) {
                System.out.print("Oh, oh... ÚLTIMO intento: ");
                m = sc.nextInt();
        }
        System.out.println("El juego consiste en averiguar un número secreto de 31 posibles.");

        System.out.print("Tienes 5 intentos. Escribe un número entre 1 y 31: ");
        d = sc.nextInt();
        for (i=0; i<=4; i++) {

            // Primero se evalúa si se ha acertado.

            if (day == d) {
                System.out.println("¡Has acertado!");
                break;
            }

            // Luego da la partida por perdida si ya has gastado 5 intentos.

            else if (i == 4) {
                System.out.println("Lo siento: ¡has perdido!. El número era el: " + day);
                break;
            }

            // Si no es ninguno de los casos anteriores, comparamos números.

            else if (day > d)
                System.out.println("El número secreto es MAYOR que " + d);
            else if (day < d)
                System.out.println("El número secreto es MENOR que " + d);

            // Por último un bucle if que sirve para dar una pista y avisarte de la última oportunidad.

            if (i <= 1) {
                System.out.print("Otro intento: ");
                d = sc.nextInt();
            } else if (i == 2) {
                int x = (int) (day / 10);
                System.out.println("Una pista, la primera cifra es " + x);
                System.out.print("Inténtalo de nuevo: ");
                d = sc.nextInt();
            } else if (i >= 3) {
                System.out.print("Oh, oh... ÚLTIMO intento: ");
                d = sc.nextInt();
            }
        }
        if (m == 1 && d > 20){
            System.out.println("Eres acuario");
        }
        }
    }
}
