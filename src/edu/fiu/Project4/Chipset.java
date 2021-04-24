/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is the Chipset Class 
 * @author Group 4 
 *
 */
public class Chipset implements SelfCheckCapable {
	
	/** Attributes **/
	String cruise_name;
	int ship_numer;
	int capacity;
	int storage;
	int rooms;
	
	
	/* Compositions */
	AP_Gateway mygateway;
	Room_door myroom;
	LED myled;
	Prox_sensor myproxsensor;
	
	/*Constructors*/
	public Chipset() {
		mygateway = new AP_Gateway();
		myroom = new Room_door();
		myled = new LED();
		myproxsensor = new Prox_sensor();
		 
	}
		
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Chipset";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this,myroom,mygateway,myled,myproxsensor);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chipset mychipset = new Chipset();
		mychipset.runSelfCheck();
		mychipset.reset_voyage(); 
	}

	/**
	 * This is the reset Voyage Method - It is used to clear passenger information and door access after a trip ends. 
	 */
	public void reset_voyage() {
		// TODO Auto-generated method stub
		System.out.println("Reset End Voyage");
		mygateway.Establish_wifi_connection();
		myled.flash_amber();
		room_access_update();
		myled.flash_green();
		myproxsensor.reset_sensor();
		System_check.system_check();
		System.out.println("Ready to Use");
	}
	
	/**
	 *  This is the room access update method - It updates passenger information to have access to the rooms. 
	 */
    public void room_access_update() {
    	System.out.println("Room Access Updated Sucess");
    }
}
