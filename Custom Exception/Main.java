class CustomException extends Exception{
    public CustomException(String m) {
        super(m);
        System.out.println("123123");        
    }
}


public class Main{

    public static void main(String[] args) {
        try {
            if(true)
                throw new CustomException("abc");
        }
        catch(Exception e ) {
                System.out.println("abc123 "+e);
        }
    }
}