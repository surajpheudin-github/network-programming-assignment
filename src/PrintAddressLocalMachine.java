import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintAddressLocalMachine {
    static String get_address_of_local_machine(){
        try{
            InetAddress me = InetAddress.getLocalHost();
            String address = me.getHostAddress();
            return address;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "Can not get the local address";
        }


    }
    public static void main(String[] args) {
        System.out.println("----------OUTPUT----------");
        System.out.println("The address of my local machine is " + get_address_of_local_machine());
    }
}
