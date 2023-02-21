import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SAMUEL PC
 */
public class Clients {

    /**
     * @param args the command line arguments
     */
    public static void main(String []args) throws  RemoteException, NotBoundException, MalformedURLException {
String url="rmi://localhost/myremoteobj";
Myinter remobj= (Myinter)Naming.lookup(url);
int n=remobj.sub(43, 45);
System.out.println(n);
    
}
}