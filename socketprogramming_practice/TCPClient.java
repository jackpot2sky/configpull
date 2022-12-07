/* Write a TCP client program which reads a sentence from the user and sends it to the TCP server
// program which converts it into uppercase and sends the result back to the client program which
 displays the result
 */

// TCP Client Code
import java.io.*;
import java.net.*;
class TCPClient
{
    public static void main(String[] args) throws UnknownHostException, IOException {
        String sentence;
        String modifiedSentence;
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("localhost", 6789);
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        sentence = inFromUser.readLine();
        outToServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);

        outToServer.flush();
        clientSocket.close();
    }
}