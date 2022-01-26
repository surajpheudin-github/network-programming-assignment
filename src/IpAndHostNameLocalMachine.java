import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;

public class IpAndHostNameLocalMachine {
    static byte[] get_ip_address(){
        try {
            InetAddress net_obj = InetAddress.getLocalHost();
            return net_obj.getAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("Could not get ip address");
            return null;
        }
    }

    static String get_hostname(){
        try {
            InetAddress net_obj = InetAddress.getLocalHost();
            return net_obj.getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Could not get host name";
        }
    }

    public static void main(String[] args) {
        String ip_address = "";
        boolean first_byte = true;
        for(byte b: Objects.requireNonNull(get_ip_address())){
                int unsigned_byte = b < 0 ? b + 256 : b;
                ip_address = ip_address + (first_byte ? "" : ".") + unsigned_byte;
                if (first_byte) {
                    first_byte=false;
                }
        }

        System.out.println("----------OUTPUT----------");
        System.out.println("The ip address of local machine is " + ip_address);
        System.out.println("The hostname of local machine is " + get_hostname());

    }
}
