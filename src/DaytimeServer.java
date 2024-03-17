import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class DaytimeServer {
    public static final int SERVICE_PORT = 13;

    public static void main(String[] args) {
        try {
            // Bind to the service port, to grant clients access to the TCP daytime service
            ServerSocket server = new ServerSocket(SERVICE_PORT);
            System.out.println("Daytime service started");

            // Loop indefinitely, accepting clients
            for (;;) {
                // Get the next TCP client
                Socket nextClient = server.accept();

                // Display connection details
                System.out
                        .println("Received request from " + nextClient.getInetAddress() + " : " + nextClient.getPort());

                // Just write the message
                OutputStream out = nextClient.getOutputStream();
                PrintStream pout = new PrintStream(out);

                // Write the current date out to the user
                pout.print(new java.util.Date());

                // Flust unsent bytes
                out.flush();

                // Close stream
                out.close();

                // Close the connection
                nextClient.close();
            }
        } catch (BindException be) {
            System.err.println("Service already running on port " + SERVICE_PORT);
        } catch (IOException ioe) {
            System.err.println("I/O error: " + ioe);
        }
    }
}