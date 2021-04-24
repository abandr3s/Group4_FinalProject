package edu.fiu.Project4;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

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

	public void flash_amber() {
		// TODO Auto-generated method stub
		System.out.println("LED Flashes Amber");
	}

	public void flash_green() {
		// TODO Auto-generated method stub
		System.out.println("LED Flashes Green");
	}

}
