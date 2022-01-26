import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CanonicalHostName {
    static String get_canonical_host_name(String address){
        try {

            InetAddress net_obj = InetAddress.getByName(address);
            return net_obj.getCanonicalHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Can not find the canonical host name";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address;

        System.out.println("Enter the address: ");
        address = scanner.next();

        System.out.println("----------OUTPUT----------");
        System.out.println("The canonical address of " + address +  " is " + get_canonical_host_name(address));
    }
}
