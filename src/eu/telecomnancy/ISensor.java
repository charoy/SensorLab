package eu.telecomnancy;

/**
 *
 * @author charoy
 */
public interface ISensor {
    public double getValue() throws SensorNotActivated;
    public void onOff();
    public boolean getStatus();
}
