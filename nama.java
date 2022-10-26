import java.net.*;
public class nama{
public static void main(String args[]) throws Exception{
 InetAddress host = null ;
 host = InetAddress.getLocalHost();
 System.out.println("Nama komputer Anda :" +
host.getHostName());
}
}