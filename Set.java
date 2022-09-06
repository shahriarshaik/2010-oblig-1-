import java.util.ArrayList;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

import java.util.HashSet;
public class Set {
    static ArrayList<Integer> liste = new ArrayList<>();
    static HashSet<Integer> tallliste = new HashSet<>();
    static boolean contains(HashSet<Integer> set, int o){if(set.contains(o)){return true;} else {return false;}}
    static boolean insert(HashSet<Integer> set, int o){try {set.add(o); return true;} catch (Exception e) {return false;}}
    static boolean remove(HashSet<Integer> set, int o){try {set.remove(o); return true;} catch (Exception e) {return false;}}
    static void size(){System.out.println("size: " + liste.size());}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("hvor mange ");
        int antallganger = Integer.parseInt(sc.next());
        for (int i = 0; i < antallganger; i++) {
            System.out.println("skriv contains / insert / remove / size");
            String inputString = input.nextLine();
            String[] splitte = inputString.split(" ");
            try {
                if(splitte[0].equals("contains")){contains(tallliste, Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("insert")){insert(tallliste, Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("remove")){remove(tallliste, Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("size")){size();}
                else{System.out.println("wrong input given ");i--;}
            } catch (Exception e) {}}}}
