



public class Main2 {
    public static void main(String[] args) {
        Runnable obj = ()->{
            for(int i=0;i<5;i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(105);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = ()->{
            for(int i=0;i<5;i++) {
                System.out.println("hello1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        new Thread(obj).start();
        new Thread(obj2).start();
    }
}
