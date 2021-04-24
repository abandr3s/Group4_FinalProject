/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is the Prox_sensor Class
 * @author Group 4
 *
 */
public class Prox_sensor implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Proximity Sensor";
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
	 * This is the reset sensor method -  
	 */

	public void reset_sensor() {
		// TODO Auto-generated method stub
		System.out.println("Reset Sensor");
	}

}
