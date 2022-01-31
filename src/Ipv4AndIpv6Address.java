import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipv4AndIpv6Address {

    public static void ipv4_and_ipv6_address(String address_or_name) {
        try {
            InetAddress[] net_obj = InetAddress.getAllByName(address_or_name);

            for (InetAddress obj : net_obj) {
                String formated_address = "";
                if (obj instanceof Inet4Address) {
                    byte[] ip_address = obj.getAddress();
                    boolean first_byte = true;
                    for (byte unsigned_byte : ip_address) {
                        int signed_byte = unsigned_byte > 0 ? unsigned_byte : unsigned_byte + 256;
                        formated_address = formated_address + (first_byte ? "" : ".") + signed_byte;
                        if (first_byte) {
                            first_byte = false;
                        }
                    }
                    System.out.println(formated_address + " (This is IPV4 Address)");
                    return;
                }
            }

            for (InetAddress obj : net_obj) {

                if (obj instanceof Inet6Address) {
                    String ip = (obj.toString().split("/")[1]);
                    System.out.println(ip + " (This is IPV6 Address)");
                    return;
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("-----------OUTPUT-------------");
        for (String address : args) {
            ipv4_and_ipv6_address(address);
        }
    }
}
