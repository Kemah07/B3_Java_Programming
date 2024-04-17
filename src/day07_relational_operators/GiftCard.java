package day07_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        double giftCardBalance = 200;
        double item1Price = 100;
        double item2Price = 70;
        System.out.println("In my gift card, I have $" + giftCardBalance + " balance.");
        System.out.println("Buy item 1 for $" + item1Price + " with you gift card.");

        // giftCardBalance = giftCardBalance - item1Price;
        giftCardBalance -= item1Price; // this one is same as above. Just using SHORTHAND operator

        System.out.println("After purchasing item 1, my gift card balance is $" + giftCardBalance);

        //giftCardBalance = giftCardBalance - item2Price; // 100 - 50;
        giftCardBalance -= item2Price;

        System.out.println("After purchasing item 2, my gift card balance is $" + giftCardBalance);
    }
}
