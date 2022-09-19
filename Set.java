public class Set<Integer> {

    public int data;
    public Set<Integer> rightChild;
    public Set<Integer> leftChild;
    public Set<Integer> parent;
    public int size = 0;

    public Set(int data) {
        this.data = data;
    }
    public Set(){}

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

    public Set<Integer> remove(Set<Integer> v, int x){
        if(v == null){
            return null;
        }
        if( x < v.data){
            v.leftChild = remove(v.leftChild, x);
            return v;
        }
        if(x > v.data){
            v.rightChild = remove(v.rightChild, x);
            return v; 
        }
        if(v.leftChild == null){
            return v.rightChild;
        }
        if(v.rightChild == null){
            return v.leftChild;
        }
        Set<Integer> u = FindMin(v.rightChild);
        v.data = u.data;
        v.rightChild = remove(v.rightChild, u.data);
        return v;
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

}
