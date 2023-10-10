package inheritance_constructorCall;

public class H_Parent extends GrandParent {

    H_Parent() {
        super("Wassup man!");
        System.out.println("Parent class log 1!");
    }

    H_Parent(boolean b) {
        this();
        System.out.println("Parent class boolean log: " + b);
    }


}
