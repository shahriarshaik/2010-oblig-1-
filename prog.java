import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Set<Integer> set = null;
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("hvor mange ");
        int antallganger = Integer.parseInt(sc.next());
        String inputString = "";
        for (int i = 0; i < antallganger; i++) { // for loop som looper antall ganger oppgitt
            inputString = input.nextLine(); // leser input
            String[] splitte = inputString.split(" "); // splitter input
            try {
                if (splitte[0].equals("contains")) { // contains, true = finnes, false = finnes ikke
                    try {
                        if (set.contains(set, Integer.parseInt(splitte[1])).data == Integer.parseInt(splitte[1])) {
                            System.out.println("True");
                        }
                    } catch (Exception e) {
                        System.out.println("False");
                    }
                } else if (splitte[0].equals("insert")) { // insert
                    if (set == null) {
                        set = new Set<>(Integer.parseInt(splitte[1]));
                    } else {
                        set.insert(set, Integer.parseInt(splitte[1]));
                    }
                } else if (splitte[0].equals("remove")) { // remove
                    set = set.remove(set, Integer.parseInt(splitte[1]));
                    System.out.println(set);
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
