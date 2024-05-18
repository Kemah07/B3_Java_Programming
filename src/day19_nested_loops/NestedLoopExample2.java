package day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            //System.out.println(i + " x " + 1 + " = " + (i * 1));

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

    }
}
