/**
 * 
 */
package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is the Tracelet Class
 * @author Group 4
 *
 */
public class Tracelet implements SelfCheckCapable {
	
	
	/******************** Class Methods *******************************/
	
	 
	void store_data() {
		// TODO - implement Tracelet.store_data
		return null;
	}

	void send_data() {
		// TODO - implement Tracelet.send_data
		return null;
	}

	void receive_data() {
		// TODO - implement Tracelet.receive_data
		return null;
	}

	void sound_alarm() {
		// TODO - implement Tracelet.sound_alarm
		return null;
	}

	void alarm_off() {
		// TODO - implement Tracelet.alarm_off
		return null;
	}

	
	void light_LED(int RGB) {
		// TODO - implement Tracelet.light_LED
		return null;
	}

	void prox_check() {
		// TODO - implement Tracelet.prox_check
		return null;
	}

	void start_15_minute_timer() {
		// TODO - implement Tracelet.start_15_minute_timer
		return null;
	}

	void ID_booking_no() {
		// TODO - implement Tracelet.ID_booking_no
		return null;
	}

	void alert_off() {
		// TODO - implement Tracelet.alert_off
		return null;
	}

	void overwrite_event_count() {
		// TODO - implement Tracelet.overwrite_event_count
		return null;
	}	
	/******************** Class Methods *******************************/


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Tracelet";
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
