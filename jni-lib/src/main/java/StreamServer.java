import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class StreamServer extends Thread {

    private DatagramSocket socket;
    private InetAddress address;
    private boolean running;
    private int port;

    private byte[] buf;

    public StreamServer(InetAddress inetAddress, Integer port) throws SocketException {
        this.socket = new DatagramSocket(port);
        this.address = inetAddress;
        this.port = port;
    }

    public void run() {
        running = true;

        DatagramPacket packet;

        while (running) {
            packet = new DatagramPacket(buf, buf.length, this.address, this.port);

            try {
                socket.send(packet);
            } catch (IOException e) {
                // TODO: Auto-generated catch block
                e.printStackTrace();
                break;
            }
        }
        socket.close();
    }
}
