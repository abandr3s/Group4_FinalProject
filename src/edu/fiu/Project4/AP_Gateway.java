/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is the AP Gateway Class
 * @author Group 4 
 *
 */
public class AP_Gateway implements SelfCheckCapable {
	
	/* Associations and Compositions*/
	Crew mycrew;
	
	/*Constructor*/
	public AP_Gateway() {
		mycrew = new Crew();		 
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "AP Gateway";
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
    
	/**
	 * This is the Establish WIFI Connection method - It is used to connect the AP Gateway and the the door  
	 */
	public void Establish_wifi_connection() {
		// TODO Auto-generated method stub
		System.out.println("Establish WIFI Connection");
		mycrew.room_access_updates();
	}

}
