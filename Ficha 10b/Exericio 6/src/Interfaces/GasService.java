package Interfaces;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface GasService {
    
    public double getGasPrice();
    
    public void setGasPrice(double p);
    
    public double getGasTotal(double litres);
}
