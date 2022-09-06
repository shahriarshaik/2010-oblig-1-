import java.util.ArrayList;
import java.util.Scanner;
public class tree {
    static ArrayList<Integer> liste = new ArrayList<>();
    static void contains(){System.out.println(liste);}
    static void insert(int i){liste.add(i);}
    static void remove(int i){try {liste.remove(i);} catch (Exception e) {System.out.println("finnes ikke");}}
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
                if(splitte[0].equals("contains")){contains();}
                else if(splitte[0].equals("insert")){insert(Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("remove")){remove(Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("size")){size();}
                else{System.out.println("wrong input given ");i--;}
            } catch (Exception e) {}}}}
