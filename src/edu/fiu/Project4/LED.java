package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;
/**
 * This is the LED Class 
 * @author Group 4
 */

public class LED implements SelfCheckCapable {
	

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "LED";
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
	 * This is the Flash amber method - It is used to flash door led to amber 
	 */
	public void flash_amber() {
		// TODO Auto-generated method stub
		System.out.println("LED Flashes Amber");
	}
	/**
	 * This is the Flash amber method - It is used to flash door led to green 
	 */

	public void flash_green() {
		// TODO Auto-generated method stub
		System.out.println("LED Flashes Green");
	}

}
