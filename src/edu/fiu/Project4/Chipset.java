/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Group 4 
 *
 */
public class Chipset implements SelfCheckCapable {
	
	/* Compositions */
	AP_Gateway mygateway;
	Room_door myroom;
	LED myled;
	Prox_sensor myproxsensor;
	
	/*Constructor*/
	public Chipset() {
		mygateway = new AP_Gateway();
		myroom = new Room_door();
		myled = new LED();
		myproxsensor = new Prox_sensor();
		 
	}
	
	/******************** Class Methods *******************************/

	/******************** Class Methods *******************************/
	
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

	private void reset_voyage() {
		// TODO Auto-generated method stub
		System.out.println("Reset End Voyage");
		mygateway.Establish_wifi_connection();
		myled.flash_amber();
		System.out.println("Room Access Updated Sucess");
		myled.flash_green();
		myproxsensor.reset_sensor();
		System_check.system_check();
		System.out.println("Ready to Use");
	}

}
