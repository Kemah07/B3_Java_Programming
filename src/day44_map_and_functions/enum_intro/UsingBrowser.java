package day44_map_and_functions.enum_intro;

import static day44_map_and_functions.enum_intro.Browser.CHROME;

public class UsingBrowser {
    public static void main(String[] args) {

        Browser browser = CHROME;

        switch (browser) {

            case EDGE:
            case CHROME:
                System.out.println("Opening chrome or edge browser");
                break;
            case SAFARI:
                System.out.println("Opening safari browser");
                break;
            case FIREFOX:
                System.out.println("Opening firefox browser");
                break;
            default:
                System.out.println("NOT VALID browser");

        }

        }
}
