package HomeWork.lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT = 8189;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;
    private Thread serverThread;


    public static void main(String[] args) {
        new  Server().start();
        //
    }

    private void start() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started");
            waitConnection(serverSocket);
            startConcoleImput();

            while (true){
                String income = in.readUTF();
                if(income.startsWith("/end")){
                    shutdown();
                    break;
                }
                System.out.println("Received :" + income);

            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                shutdown();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void shutdown() throws IOException {
        if(serverThread != null && serverThread.isAlive()){
            serverThread.interrupt();
        }
        if (socket != null && socket.isClosed()){
            socket.close();
        }
        System.out.println("Server stopped");
    }

    private void startConcoleImput() {
        serverThread = new Thread(() ->{
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Enter your massage>>>>>>>>>>>");
                while (!Thread.currentThread().isInterrupted() && !socket.isClosed()){
                    if (br.ready()){
                        String outcome = br.readLine();
                        out.writeUTF(outcome);
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        });
        serverThread.start();
    }

    private void waitConnection(ServerSocket serverSocket) throws IOException {
        System.out.println("Waiting for connection.....");
        socket = serverSocket.accept();
        System.out.println("Client connect");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }

}
