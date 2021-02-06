/* SampleServer.java */
import java.rmi.*;
public interface SampleServer extends Remote
{
  public String sayhello() throws RemoteException;
  public int sum(int a,int b) throws RemoteException;
  public int sub(int a,int b) throws RemoteException;
  public int divide(int a,int b) throws RemoteException;
  public int multiply(int a,int b) throws RemoteException;
  public int modulo(int a,int b) throws RemoteException;
}
