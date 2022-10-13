import java.util.Scanner;
import java.net.Socket;
import java.io.IOException;

publicclass socket_client {
publicstaticvoid main(String[] args) throws IOException {
if (args.length != 1) {
            System.err.println("Pass the server IP as the sole command line argument");
return;
        }
        Socket soc = new Socket(args[0], 59090);
        Scanner in = new Scanner(soc.getInputStream());
        System.out.println("Server response: " + in.nextLine());
    }
}
