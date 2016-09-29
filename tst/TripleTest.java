import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andrew Shubin on 9/28/16.
 */
public class TripleTest {

    @Test
    public void getterTest() throws Exception {
        // Arrange
        String a = "What is the answer to life, the universe, and everything?";
        Double b = 3.1415;
        Integer c = 42;
        Triple<String, Double, Integer> triple = new Triple<>(a, b, c);

        // Act
        String result1 = triple.getLeft();
        double result2 = triple.getMiddle();
        int result3 = triple.getRight();

        // Assert
        assertEquals("ERROR in Triple.getLeft()", a, result1);
        assertEquals("ERROR in Triple.getMiddle()", b, result2, 0);
        assertEquals("ERROR in Triple.getRight()", c, result3, 0);

    }

    @Test
    public void setterTest() throws Exception {
        // Arrange
        Boolean a = true;
        MyObject b = new MyObject("Hello...");
        Triple<String, String, String> c = new Triple<>("x", "y", "z");
        Triple<Boolean, MyObject, Triple> triple
                = new Triple<>(null, null, null);

        // Act
        triple.setLeft(a);
        triple.setMiddle(b);
        triple.setRight(c);

        // Assert
        assertEquals("ERROR in Triple.setLeft()", a, triple.getLeft());
        assertEquals("ERROR in Triple.setMiddle()", b, triple.getMiddle());
        assertEquals("ERROR in Triple.setRight()", c, triple.getRight());

    }

    @Test
    public void toStringTest() throws Exception {
        // Arrange
        String a = "What is the answer to life, the universe, and everything?";
        Double b = 3.1415;
        Integer c = 42;
        Triple<String, Double, Integer> triple = new Triple<>(a, b, c);
        String expected = "(" + a + ", " + b + ", " + c + ")";

        // Act
        String result = triple.toString();

        // Assert
        assertEquals("ERROR in Triple.toString()", expected, result);

    }

    private class MyObject {

        private String message = "DEFAULT";

        public MyObject(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Someone whispers, \"" + message + "\"";
        }

    }

}