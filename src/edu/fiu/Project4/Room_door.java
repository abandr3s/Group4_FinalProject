/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is the Room Door Class 
 * @author Group 4
 *
 */

public class Room_door implements SelfCheckCapable {
	
	/*Attributes*/
	int power_source;
	int LED;
	int prox_sensor;
	int door_motor;
	int RFID_reader;
	int RFID_antenna;
	int WiFi_antenna;
	int BLE_antenna;
	int lock_timer;	
	
    /* Associations and Compositions*/ 
	Ship myship;
	LED myled;
	Prox_sensor mysensor;
	
	/*Constructor*/
	public Room_door() {
		myship = new Ship();
		myled = new LED();
		mysensor = new Prox_sensor();
	}
	
	/******************** Class Methods *******************************/
	/**
	 * This is the Sense Presence Method - It is used to detect proximity sensor check  
	 */
	public void sense_presence() {
		// TODO - implement Room_Door.sense_presence
	    return null;  
	}

	/**
	 * This is the unlock class - It is used to activate the motor to unlock the door   
	 */
	public void unlock() {
		// TODO - implement Room_Door.unlock
		return null;
	}
	
	/**
	 * This is the lock class - It is used to activate the motor to lock the door   
	 */
	public void lock() {
		// TODO - implement Room_Door.lock
		return null;
	}
	
	/**
	 * This is the read RFID Method -   
	 */
	public void read_RFID() {
		// TODO - implement Room_Door.read_RFID
		return null;
	}

	/**
	 * This is the Flash LED Method  
	 */
	
	public void flash_LED(int RGB) {
		// TODO - implement Room_Door.flash_LED
		return null;
	}


	public void solid_LED(int RGB) {
		// TODO - implement Room_Door.solid_LED
		return null;
	}

	public void start_lock_timer() {
		// TODO - implement Room_Door.start_lock_timer
		return null;
	}
	/******************** Class Methods *******************************/
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Room Door";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.05);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.checkComponents(this);
	}

}
