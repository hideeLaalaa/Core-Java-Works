package objectOriented;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.LocalDevice;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;
import javax.bluetooth.UUID;

public class bluetooth {

	private static Object lock=new Object();
	public bluetooth() {
		// TODO Auto-generated constructor stub
	
	
	 
	 try{
	            // 1
	            LocalDevice localDevice = LocalDevice.getLocalDevice();
	 
	            // 2
	            DiscoveryAgent agent = localDevice.getDiscoveryAgent();
	             
	            // 3
	            agent.startInquiry(DiscoveryAgent.GIAC, new MyDiscoveryListener());
	 
	            try {
	                synchronized(lock){
	                    lock.wait();
	                }
	            }
	            catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println("Device Inquiry Completed. ");
	             
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }

}

class MyDiscoveryListener implements DiscoveryListener{

	private Object lock=new Object();
    @Override
    public void deviceDiscovered(RemoteDevice btDevice, DeviceClass arg1) {
        String name;
        try {
            name = btDevice.getFriendlyName(false);
        } catch (Exception e) {
            name = btDevice.getBluetoothAddress();
        }
         
        System.out.println("device found: " + name);
         
    }
 
    @Override
    public void inquiryCompleted(int arg0) {
        synchronized(lock){
            lock.notify();
        }
    }
 
    @Override
    public void serviceSearchCompleted(int arg0, int arg1) {
    }
 
    @Override
    public void servicesDiscovered(int arg0, ServiceRecord[] arg1) {
    }
    
    public void searchBlue() throws BluetoothStateException{
    UUID[] uuidSet = new UUID[1];
    uuidSet[0]=new UUID(0x1105); //OBEX Object Push service
    
   int[] attrIDs =  new int[] {
           0x0100 // Service name
   };
    
   LocalDevice localDevice = LocalDevice.getLocalDevice();
   DiscoveryAgent agent = localDevice.getDiscoveryAgent();
    RemoteDevice device = null;
	agent.searchServices(null,uuidSet,device, new MyDiscoveryListener());
        
        
       try {
           synchronized(lock){
               lock.wait();
           }
       }
       catch (InterruptedException e) {
           e.printStackTrace();
           return;
       }
 
}

}}