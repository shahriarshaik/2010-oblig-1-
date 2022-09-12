public class Set<Integer> {

    public int data;
    public Set<Integer> rightChild;
    public Set<Integer> leftChild;
    public Set<Integer> parent;
    public int size = 0;

    public Set(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "node: " + data;
    }

    public Set<Integer> insert(Set<Integer> set, int o) {
        if (set == null) { // usikker om jeg skal ha set == null eller set.data == null
            set = new Set<>(o);
        } else if (o < set.data) {
            set.leftChild = insert(set.leftChild, o);
        } else if (o > set.data) {
            set.rightChild = insert(set.rightChild, o);
        }
        return set;
    }

    public Set<Integer> contains(Set<Integer> set, int o) {
        if (set == null) {
            return null;
        } else if (set.data == o) {
            return set;
        } else if (o < set.data) {
            return contains(set.leftChild, o);
        } else if (o > set.data) {
            return contains(set.rightChild, o);
        }
        return null;
    }
    /* 
    public Set<Integer> remove(Set<Integer> set, int o) {
        if (set == null) {
            return null;
        }
        if (o < set.data) {
            if (set.leftChild.rightChild == null && set.leftChild.leftChild == null) {
                set.leftChild = null;
                return null;
            }
            return remove(set.leftChild, o);
        }
        if (o > set.data) {
            if (set.rightChild.leftChild == null && set.rightChild.leftChild == null) {
                set.rightChild = null;
                return null;
            }
            return remove(set.rightChild, o);
        }
        if (set.leftChild == null && set.rightChild == null) {
            System.out.println("setter denne set til null: " + set);
            set = null;
            return null;
        }
        if (set.leftChild == null) {
            return set.rightChild;
        }
        if (set.rightChild == null) {
            return set.leftChild;
        }
        /// ikkke ferdig trenger findmin
        Set<Integer> min = FindMin(set.rightChild);
        set.data = min.data;
        set.rightChild = remove(set.rightChild, min.data);
        return set;
    }
    */
    public Set<Integer> remove(Set<Integer> set, int o) {
    if (set == null) {
        return null;
    }
    if (o < set.data) {
        set.leftChild = remove(set.leftChild, o);
        //return remove(set.leftChild, o);
    }
    if (o > set.data) {
        set.rightChild = remove(set.rightChild, o);
        //return remove(set.rightChild, o);
    } 
    if (set.leftChild == null) {
        //set.data = set.rightChild.data;
        return set.rightChild;
    } 
    if (set.rightChild == null) {
        //set.data = set.leftChild.data;
        return set.leftChild;
    }
    Set<Integer> min = FindMin(set.rightChild);
    set.data = min.data;
    set.rightChild = remove(set.rightChild, min.data);
    return set;
    }

    public Set<Integer> FindMin(Set<Integer> set) {
        if (set != null && set.leftChild != null) {
            return FindMin(set.leftChild);
        } else {
            return set;
        }
    }

    public int size() {
        return size;
    }

    /*
     * static ArrayList<Integer> liste = new ArrayList<>();
     * static HashSet<Integer> tallliste = new HashSet<>();
     * static boolean contains(HashSet<Integer> set, int
     * o){if(set.contains(o)){return true;} else {return false;}}
     * static boolean insert(HashSet<Integer> set, int o){try {set.add(o); return
     * true;} catch (Exception e) {return false;}}
     * static boolean remove(HashSet<Integer> set, int o){try {set.remove(o); return
     * true;} catch (Exception e) {return false;}}
     * static void size(){System.out.println("size: " + liste.size());}
     */
}
