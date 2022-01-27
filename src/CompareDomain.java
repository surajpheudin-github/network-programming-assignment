import java.net.InetAddress;
import java.net.UnknownHostException;

public class CompareDomain {
    public static void main(String[] args) {
        try{
            String name_one = "www.webdevsimplified.com";
            String name_two = "blog.webdevsimplified.com";
            InetAddress ibiblio = InetAddress.getByName(name_one);
            InetAddress helios = InetAddress.getByName(name_two);

            if(ibiblio.equals(helios)){
                System.out.println("----------OUTPUT----------");
                System.out.println(name_one + " is same as the " + name_two);
            }else {
                System.out.println("----------OUTPUT----------");
                System.out.println(name_one + " is different than " + name_two);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
