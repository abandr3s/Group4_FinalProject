/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author aband
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

	public void Establish_wifi_connection() {
		// TODO Auto-generated method stub
		System.out.println("Establish WIFI Connection");
		mycrew.room_access_updates();
	}

}
