import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SpamCheck {
    public static void main(String[] args) throws UnknownHostException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hostname or address: ");
        String name_or_address =  scanner.next();

        if(isSpammer(name_or_address)){
            System.out.println(name_or_address + " is a known spammer");
        }else {
            System.out.println(name_or_address + " appears legitimate.");
        }
    }

    private  static boolean isSpammer(String name){
        try {
            InetAddress network = InetAddress.getByName(name);
            byte[] address = network.getAddress();
            String query = "sbl.spamhaus.org";

            for(byte octet: address){
                int unsigned_byte = octet > 0 ? octet : octet + 256;
                query = unsigned_byte + "." + query;
            }
            System.out.println("query " + query);
            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }
}
