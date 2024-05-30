package day31_custom_classes;

public class UseCarpet {
    public static void main(String[] args) {


            Carpet carpet1 = new Carpet(true, 8.5, 12, 2.5);
            //carpet1.calculatePrice();

            System.out.println(carpet1);

            carpet1.length = 14;
            carpet1.calculatePrice();

            // // We had to call the .calculatePrice() method again because that method was called in constructor. Since, we have updated the length, I am calling .calculateMethod() to get updated totalPrice.


            System.out.println();
            System.out.println(carpet1);






        }
}
