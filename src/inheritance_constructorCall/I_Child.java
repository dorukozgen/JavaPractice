package inheritance_constructorCall;

public class I_Child extends H_Parent {

    I_Child() {
        super(true);
        System.out.println("Child class log 1!");
    }

    public static void main(String[] args) {
        I_Child obj = new I_Child();
    }
}
