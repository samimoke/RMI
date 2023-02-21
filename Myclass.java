import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SAMUEL PC
 */
public class Myclass extends UnicastRemoteObject implements Myinter{
     
    public Myclass()throws RemoteException{ 
        
    }       
   

    @Override
    public int sub(int a, int b) throws RemoteException {
   return(a-b);  }
        
    }

    

