import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaces {
    public static void main(String[] args) {
        try{
            System.out.println("----------OUTPUT----------");

            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()){
                NetworkInterface n = interfaces.nextElement();
                System.out.println(n);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
