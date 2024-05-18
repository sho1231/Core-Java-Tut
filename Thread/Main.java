// package Thread;

class A extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println("hi");
        }
    }
}

class B extends A{
    @Override
    public void run() {
        for(int i=0;i<1000;i++) {
            System.out.println("hello");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        System.out.println(a.getPriority());

        System.out.println(b.getPriority());
        

        a.start();
        b.start();
    }
}
