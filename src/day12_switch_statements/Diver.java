package day12_switch_statements;

public class Diver {
    public static void main(String[] args) {
        int oxygenLevel = 40;

//          YOU NEED TO BE CAREFUL with ORDER OF YOUR ELSE IF sequence.
//        if (oxygenLevel > 50 && oxygenLevel <= 60) {
//            System.out.println("Be careful");
//        } else if  (oxygenLevel > 60 && oxygenLevel <= 70) {
//            System.out.println("Start to head back");
//        }


        if (oxygenLevel > 90) {
            System.out.println("Your tank is full");
        } else if (oxygenLevel > 80) {
            System.out.println("Still okay");
        } else if (oxygenLevel > 70) {
            System.out.println("Don't go too far");
        } else if (oxygenLevel > 60){
            System.out.println("Start to head back");
        } else if (oxygenLevel > 50) {
            System.out.println("Be careful now you at at 50%");
        } else {
            System.out.println("See you in heaven");
        }
    }
}
