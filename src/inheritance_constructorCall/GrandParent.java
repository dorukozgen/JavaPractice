package inheritance_constructorCall;

public class GrandParent {
    GrandParent() {
        System.out.println("Grand Parent class log 1!");
    }

    GrandParent(String str) {
        this();
        System.out.println("Grand Parent class String log: " + str);
    }
}
