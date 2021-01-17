package ex5;


/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Company {
    private String name;
    private int vatNumber;

    /**
     * Default company constructor
     */
    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        this.name = val;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int val) {
        this.vatNumber = val;
    }

    @Override
    public String toString(){
        String text = "";
        text += "Company name: " + name + "\n";
        text += "Company vatNumber: " + vatNumber + "\n";
        return text;
    }






}