/*SampleClient.java*/
import java.rmi.*;
import java.rmi.server.*;

public class SampleClient  

{
   public static void main(String[]  args)
   {
      // set the security manager for the client
     // System.setSecurityManager(new RMISecurityManager());
      //get the remote object from the registry
      try
        {
			System.out.println("Security Manager loaded");
			String url = "//localhost/SAMPLE-SERVER";
			SampleServer remoteObject = (SampleServer)Naming.lookup(url);
			System.out.println("Got remote object");
			System.out.println( remoteObject.sayhello() );
			System.out.println(" 12 + 3 = " + remoteObject.sum(12,3) );
			System.out.println(" 12 - 3 = " + remoteObject.sub(12,3) );
			System.out.println(" 12 / 3 = " + remoteObject.divide(12,3) );
			System.out.println(" 12 * 3 = " + remoteObject.multiply(12,3) );
			System.out.println(" 12 % 3 = " + remoteObject.modulo(12,3) );
        }
        catch (RemoteException exc) {
          System.out.println("Error in lookup: " + exc.toString()); }
        catch (java.net.MalformedURLException exc) {
          System.out.println("Malformed URL: " + exc.toString());   }
        catch (java.rmi.NotBoundException exc)  {
          System.out.println("NotBound: " + exc.toString());
        }
}
}
