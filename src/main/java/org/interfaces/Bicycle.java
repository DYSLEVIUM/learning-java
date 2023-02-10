package org.interfaces;

// it is like a "contract" that spells out how software interacts
// in java, an interface is a reference type, similar to a class that can contain only constants, method signatures, default methods, static methods, and nested types
// any class that implements the Bicycle interface can use the default implementation of the applyBrake method, but can also override it if necessary. Also abstract classes do not support default method implementations, only interfaces do.
public interface Bicycle {
//    int x; // error

    void applyBrake(int decrement);

    // this is the default implementation of the function
//    default void applyBrake(int decrement) {
//        System.out.println("No Decrement function defined");
//    }

    void speedUp(int increment);
}
