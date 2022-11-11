package interface_;

public class Computer {
    public void connect(UsbInterface usbInterface) {
        usbInterface.start();
        usbInterface.stop();
    }
}
