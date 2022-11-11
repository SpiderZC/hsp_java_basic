package interface_;

import interface_.UsbInterface;

public class Camera implements UsbInterface {

	@Override
	public void start() {
        System.out.println("Camera start!!!");
	}

	@Override
	public void stop() {
        System.out.println("Camera stop!!!");
	}

}
