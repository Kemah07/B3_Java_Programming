package day08_scanner_logical_operators;

public class Discount {
    public static void main(String[] args) {
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFirefighter = false;

        boolean isEligibleForDiscount = isWeekend && (isTeacher || isOfficer || isFirefighter);
        //                                                false  ||  true     || false
        //                                                      true          || false
        //                                                                  true
        //                                 true  &&   true
        //                                      true

        System.out.println("It is eligible: " + isEligibleForDiscount);

    }
}
