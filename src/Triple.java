/**
 * Created by Andrew Shubin on 9/28/16.
 */
public class Triple<Type1, Type2, Type3> {

    // fields
    private Type1 left;
    private Type2 middle;
    private Type3 right;

    // constructor
    public Triple(Type1 left, Type2 middle, Type3 right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    // getters and setters
    public Type1 getLeft() { return left; }
    public Type2 getMiddle() { return middle; }
    public Type3 getRight() { return right; }
    public void setLeft(Type1 left) { this.left = left; }
    public void setMiddle(Type2 middle) { this.middle = middle; }
    public void setRight(Type3 right) { this.right = right; }

    public String toString() {
        return "(" + left + ", " + middle + ", " + right + ")";
    }

}
