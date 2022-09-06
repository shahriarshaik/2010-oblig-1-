import java.util.Scanner;
import java.util.HashSet;
public class prog {
    public static void main(String[] args) {
        Set set = new Set();
        HashSet<Integer> tallliste = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("hvor mange ");
        int antallganger = Integer.parseInt(sc.next());
        for (int i = 0; i < antallganger; i++) {
            System.out.println("skriv contains / insert / remove / size");
            String inputString = input.nextLine();
            String[] splitte = inputString.split(" ");
            try {
                if(splitte[0].equals("contains")){set.contains(tallliste, Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("insert")){set.insert(tallliste, Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("remove")){set.remove(tallliste, Integer.parseInt(splitte[1]));}
                else if(splitte[0].equals("size")){set.size();}
                else{System.out.println("wrong input given ");i--;}
            } catch (Exception e) {}}

    }
}
