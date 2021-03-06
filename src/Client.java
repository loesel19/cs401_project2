// The client class will implemnet the functions listed in the project description.
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;
import java.lang.*;

public class Client {

    int serverPort;
    InetAddress ip = null;
    Socket s;
    ObjectOutputStream outputStream;
    ObjectInputStream inputStream;
    int peerID;
    int peer_listen_port;
    char FILE_VECTOR[];

    public Client(String ip, String filepath) throws IOException {
        System.out.println(filepath);
        String[] initData = parseFile(filepath);
        System.out.println(initData[0] + ": " + initData[3] + ": " + initData[2] + ": " + initData[3] + ": ");
    }



    public static void main(String args[]) throws IOException {
        // parse client config and server ip.
        String connectionAddress = "127.0.0.1";
        // create client object and connect to server. If successful, print success message , otherwise quit.
        Client c = new Client(connectionAddress, "./src/test.txt");

        // Once connected, send registration info, event_type=0
        // start a thread to handle server responses. This class is not provided. You can create a new class called ClientPacketHandler to process these requests.

        //done! now loop for user input

        while (true) {
            break;
            // wait for user commands.
        }

    }


    // implement other methods as necessary

    /**
     * this method takes in the filepath for a client config file and returns a string array with values ID, server Port,
     * client port, file vector. since all config files will be of the same structure (for now at least), we can just
     * read in each line of the file (which will contain a key-value pair essentially), split it, and add the second value
     * to our array
     *
     * @param path file path for config file
     * @return String array with our values
     */

    public String[] parseFile(String path) throws IOException {
        Scanner s = new Scanner(new File(path));
        String[] arr = new String[4];
        //set up for loop with condition of scanner having next line. this way its easy to index array
        System.out.println(s.nextLine());
        for (int i = 0; s.hasNext(); i++) {
            //arr[i] = s.nextLine().split(" ")[1].trim();
        }

        //return array format
        /*
        index 0: client ID
              1: server port num
              2: client port num
              3: file vector
         */
        System.out.println("data loaded");
        return arr;
    }



}