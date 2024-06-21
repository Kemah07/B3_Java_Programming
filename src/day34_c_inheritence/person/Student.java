package day34_c_inheritence.person;

public class Student extends Person {

    boolean isHappy;

    public void study () {
        System.out.println(name + " is studying");
    }

}

// Student is-A Person
// Student is Sub Class / Child Class /  Derived CLass
// Person is Super Class / Parent Class / Base Class