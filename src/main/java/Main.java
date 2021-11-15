import Network.Protocol;
import handler.ViewHandler;

public class Main {
    public static void main(String[] args) throws Exception {
        ViewHandler viewHandler = new ViewHandler();
        do {
            viewHandler.start();
        }while (true);
    }
}
