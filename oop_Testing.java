import java.io.*;
public class oop_Testing{
    public static void main (String args[])
        throws IOException{
            BufferedReader scan = new BufferedReader(
                new InputStreamReader(System.in));
            
            int a = Integer.parseInt(scan.readLine());
            int b = Integer.parseInt(scan.readLine());

            System.out.println("Hasil Penjumlahan = "+(a + b));
     }
}