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
public class Room_door implements SelfCheckCapable {
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
