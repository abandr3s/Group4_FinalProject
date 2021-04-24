/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is the Crew Class
 * @author Group 4 
 *
 */
public class Crew implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Crew";
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
     * This is the Room Access Update method - It is used to update information about voyage, passenger and access to rooms
     */
	public void room_access_updates() {
		// TODO Auto-generated method stub
       System.out.println("Room Access Update");		
	}
	
}
