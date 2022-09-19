import java.util.Scanner;
import java.util.HashSet;

public class prog {
    public static void main(String[] args) {
        Set<Integer> set = new Set<>();
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("hvor mange ");
        int antallganger = Integer.parseInt(sc.next());
        for (int i = 0; i < antallganger; i++) { // for loop som looper antall ganger oppgitt
            // System.out.println("\nskriv contains / insert / remove / size");
            String inputString = input.nextLine(); // leser input
            String[] splitte = inputString.split(" "); // splitter input
            try {
                System.out.println("input: " + splitte[0]);
                if (splitte[0].equals("contains")) { // contains, true = finnes, false = finnes ikke
                    System.out.println("contains kjørte");
                    System.out.println("contains returnerer: " + set.contains(set, Integer.parseInt(splitte[1])));
                    try {
                        if (set.contains(set, Integer.parseInt(splitte[1])).data == Integer.parseInt(splitte[1])) {
                            System.out.println("True");
                        }
                    } catch (Exception e) {
                        System.out.println("False");
                    }
                } else if (splitte[0].equals("insert")) { // insert
                    set.insert(set, Integer.parseInt(splitte[1]));
                } else if (splitte[0].equals("remove")) { // remove
                    set.remove(set, Integer.parseInt(splitte[1]));
                } else if (splitte[0].equals("size")) { // size
                    set.size();
                } else {
                    System.out.println("wrong input given ");
                    i--;
                }
            } catch (Exception e) {
            }
        }
        System.out.println("siste linje");
    }
}
