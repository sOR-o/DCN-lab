import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket sersock = new ServerSocket(4000);
        System.out.println("Server ready for connection");
        Socket s = sersock.accept();
        System.out.println("Connection Is successful and waiting for chatting");

        InputStream i = s.getInputStream();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(i));
        String fname = fileRead.readLine();

        
        BufferedReader r2 = new BufferedReader(new FileReader(fname));
        OutputStream o = s.getOutputStream();
        PrintWriter p = new PrintWriter(o, true);
        String str;
        while ((str = r2.readLine()) != null) {
            p.println(str);
        }
        s.close();
        sersock.close();
        p.close();
        r1.close();
        r2.close();
    }
}
