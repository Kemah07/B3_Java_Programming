package day38_a_abstraction_interface.relation;

//Going from interface to interface is INHERITANCE, and we use "extends" keyword
//Since these are interface, they do not follow the same rules as classes. So, we can extend multiple interfaces

import day38_a_abstraction_interface.shopping.Shipping;

//We are passing the method from AllowUserToSell and Shipping interfaces to ConsumerApp interface
public interface ConsumerApp extends AllowUserToSell, Shipping {

}

// class - class ---------- > extends
// class - interface ------ > implements
// interface - interface -- > extends



abstract class TestA implements Shipping, AllowUserToSell {

}


