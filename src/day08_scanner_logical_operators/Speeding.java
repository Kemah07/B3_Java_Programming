package day08_scanner_logical_operators;

public class Speeding {
    public static void main(String[] args) {
        int currentSpeed = 26;
        int speedLimit = 25;
        // lets say you can go 3 MPH more than what is allowed

        boolean isSpeeding = currentSpeed > speedLimit+3; //

        System.out.println("Are you speeding? " + isSpeeding);

    }

}
