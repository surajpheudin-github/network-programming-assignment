import java.net.InetAddress;
import java.net.UnknownHostException;

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
        String address = "157.240.7.35";
        System.out.println("----------OUTPUT----------");
        System.out.println("The canonical address of " + address +  " is " + get_canonical_host_name(address));
    }
}
