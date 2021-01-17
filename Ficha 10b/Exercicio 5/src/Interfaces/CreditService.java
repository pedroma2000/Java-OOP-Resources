package Interfaces;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public interface CreditService {
    public double getAnnualRate();
    public void setAnnualRate(double r);
    public double computeMonthlyPayment( double ammount, int months);
}
