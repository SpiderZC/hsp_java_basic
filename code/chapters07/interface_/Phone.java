package interface_;

import interface_.UsbInterface;

public class Phone implements UsbInterface {

	@Override
	public void start() {
        System.out.println("phone start!!!");
	}

	@Override
	public void stop() {
        System.out.println("phone stop!!!");
	}

}
