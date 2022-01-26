import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CheckIpv4AndIpv6 {
    static String checkIpType(String name){
        try{
            InetAddress net_obj = InetAddress.getByName(name);
            byte[] address = net_obj.getAddress();

            if(address.length == 4) return "IPV4";
            else return "IPV6";

        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Not found";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------INPUT----------");
        System.out.println("Enter the address or hostname: ");
        String name = scanner.nextLine();
        System.out.println("----------OUTPUT----------");
        System.out.println("The type of ip address is " + checkIpType(name));
    }
}
