import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TestingReachability {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the host name or address: ");
            String name_or_address = scanner.next();

            InetAddress network = InetAddress.getByName(name_or_address);
            if(network.isReachable(5000)){
                System.out.println("The connection can be made");
            }else {
                System.out.println("The connection can not be made");
            }
            System.out.println();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
