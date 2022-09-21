/*
 * notater til meg selv
 * kan bare bruke heap. aka priorityQueue
 * fra priorityQueue kan jeg bare bruke disse methodene:
 *      offer()
 *      poll()
 *      size()
 * 
 *  offer() = setter inn som add()
 *  poll() = fjerner / henter ut, usikker hvilken
 */



import java.util.Scanner;
import java.io.File;
import java.util.PriorityQueue;
public class oppgave4b {

    public static void midt(PriorityQueue<Integer> o) {
        // finner midten
        int midten = o.size() / 2;

        // variabler
        int antallHoyre = 0;
        int antallVenstre = 0;
        int peker;
        PriorityQueue<Integer> hoyreListe = new PriorityQueue<>();
        PriorityQueue<Integer> venstreListe = new PriorityQueue<>();


        // size = 11
        // dette lager venstre siden
        for (int i = 0; i < midten; i++) {
            venstreListe.offer(o.poll());
        }
        
        // size = 6
        // printer ut svaret / midten
        System.out.println("popper ut: " + o.poll());


        //size = 5
        //denne lager hoyre siden
        for (int i = 0; i <= o.size(); i++) {
            hoyreListe.offer(o.poll());
        }

        /* 
        for (Integer integer : o) {
            hoyreListe.offer(integer);
        }
        */

        System.out.println("dette er høyreliste: ");
        for (Integer integer : hoyreListe) {
            System.out.println(integer);
        }

        System.out.println("dette er venstre: ");
        for (Integer integer : venstreListe) {
            System.out.println(integer);
        }
    }


    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> liste = new PriorityQueue<>();

        Scanner sc = new Scanner(new File("enTilTi"));

        // leser første linjen som angir antall linjer å lese
        int kjorAnt = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < kjorAnt; i++) {
            liste.offer(Integer.parseInt(sc.nextLine())) ;
        }

        midt(liste);
    }
}
