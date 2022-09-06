public class settest {
    public static void main(String[] args) {
        Set<Integer> set = new Set<>(0);
        System.out.println("lagde set");
        set.insert(set, 2);
        set.insert(set, 5);
        set.insert(set, 1);
        System.out.println("satte inn set");
        set.contains(set, 2);
        System.out.println("kjørte contains");
        System.out.println("set.data: " + set.data);
        try {
            System.out.println("set.rightChild.data: " + set.rightChild.data);
        } catch (Exception e) {
            System.out.println("kjørte ikke rightchild");
        }
        try {
            System.out.println("set.leftChild.data: " + set.leftChild.data);
        } catch (Exception e) {
            System.out.println("kjørte ikke leftchild");
        }
        System.out.println("siste linje med kode");
    }
}
