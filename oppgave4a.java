import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class oppgave4a {
    public static ArrayList<Integer> finalList = new ArrayList();
    

    public static void midt(int[] o) {
        //finner midten
        int midten = o.length/2; 
        
        //variabler
        int antallHoyre = 0;
        int antallVenstre = 0;

        //legger midterste til den print lista
        finalList.add(o[midten]);

        //teller antall i høyre siden og venstre siden
        for (int i = midten+1; i < o.length; i++) {
            System.out.println(o[i]);
            antallHoyre++;
        }
        for (int i = 0; i < midten; i++) {
            System.out.println(o[i]);
            antallVenstre++;
        }

        //lager listene med høyre og venstre
        int[] hoyreListe = new int[antallHoyre];
        int[] venstreListe = new int[antallVenstre];
        
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("enTilTi"));
        int kjorAnt = Integer.parseInt(sc.nextLine());
        int[] liste = new int[kjorAnt];

        for (int i = 0; i < kjorAnt; i++) {
            liste[i] = Integer.parseInt(sc.nextLine());
        }

        //System.out.println((kjorAnt)/2);
        //ystem.out.println(liste[kjorAnt/2]);

        midt(liste);
    }
}
