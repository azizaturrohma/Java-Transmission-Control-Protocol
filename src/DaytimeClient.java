import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DaytimeClient {
    public static final int SERVICE_PORT = 13;

    public static void main(String[] args) {
        try {
            String hostname = "localhost";

            // Get a socket to daytime service
            Socket daytime = new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection established");

            // Set the socket option just in case server stalls
            daytime.setSoTimeout(2000);

            // Read from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(daytime.getInputStream()));
            System.out.println("Result: " + reader.readLine());

            // Close the connection
            daytime.close();
        } catch (IOException ioe) {
            System.err.println("Error: " + ioe);
        }
    }
}