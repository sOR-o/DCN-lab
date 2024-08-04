
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("127.0.0.1", 4000);
        System.out.println("Enter the filename");

        BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
        String fname = r1.readLine();

        OutputStream ostream = s.getOutputStream();
        PrintWriter p = new PrintWriter(ostream, true);
        p.println(fname);
        
        InputStream istream = s.getInputStream();
        BufferedReader r2 = new BufferedReader(new InputStreamReader(istream));
        String str;
        while ((str = r2.readLine()) != null) {
            System.out.println(str);
        }
        p.close();
        r2.close();
        r1.close();
        s.close();
    }
}
