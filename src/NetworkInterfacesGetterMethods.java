import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Scanner;

public class NetworkInterfacesGetterMethods {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of network interface: ");
            String name = scanner.nextLine();

            NetworkInterface network = NetworkInterface.getByName(name);
            Enumeration<InetAddress> addresses = network.getInetAddresses();
            String interface_name = network.getName();

            System.out.println("----------OUTPUT----------");

            System.out.println("Interface Name: " + interface_name);

            System.out.println("----------IP Addresses----------");

            while (addresses.hasMoreElements()){
                System.out.println(addresses.nextElement());
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
