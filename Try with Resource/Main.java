import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        // way 1
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
           int a = Integer.parseInt(br.readLine());
        } 
        finally {
            br.close();
        }
        // way 2
        try(BufferedReader br1 =  new BufferedReader(new InputStreamReader(System.in))) {
            br = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(br.readLine());
        }
    }
}