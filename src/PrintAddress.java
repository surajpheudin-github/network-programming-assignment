import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintAddress {

    public static void main(String[] args) {
        String host = "www.tufohss.edu.np";
        System.out.println(getAddress(host));
    }
    static String getAddress (String host_name){
        try{
            InetAddress address = InetAddress.getByName(host_name);
            return address.getHostAddress();
        }catch (UnknownHostException e){
            return "Could not find " + host_name;
        }
    }

}
