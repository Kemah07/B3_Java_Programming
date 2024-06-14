package day37_a_abstraction.language;

public class Translator {
    //Language obj = new Language();  // cannot create an object of interface

    public static void main(String[] args) {
        Spanish s = new Spanish();
        s.hi();
        s.bye();
        System.out.println(s.PLANET);

        System.out.println("----");

        Turkish t = new Turkish();
        t.hi();
        t.bye();
        System.out.println(t.PLANET);


        System.out.println("-----");
        System.out.println(Language.PLANET);
        System.out.println(Turkish.PLANET);
        System.out.println(Spanish.PLANET);
    }


}
