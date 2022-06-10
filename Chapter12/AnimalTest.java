package Chapter12;

public class AnimalTest {
    public static void main(String[] args) {
        String[] animals = { "ant", "bat", "cat", "dog" };

        for (String s : animals) {
            System.out.println(s.charAt(0) + " : " + s);
        }
    }
}
