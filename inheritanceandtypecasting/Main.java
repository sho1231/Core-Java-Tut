// package inheritanceandtypecasting;

class Parent {
    public void run() {
        System.out.println("A");
    }
}

class Child extends Parent {
    @Override
    public void run() {
        System.out.println("B");
    }
    public void run2() {
        System.out.println("B2");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.run();
        Child obj1 = (Child) obj;
        obj1.run2();
    }   
}
