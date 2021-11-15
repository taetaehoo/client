package Network;

import handler.ViewHandler;

public class Client {
    public static void main(String [] args) throws Exception {
        Network net = new Network();
        Protocol protocol = new Protocol();
        byte[] buf = protocol.getPacket();
        ViewHandler viewHandler = new ViewHandler();
        while (true) {
            viewHandler.start();
        }

    }
}
