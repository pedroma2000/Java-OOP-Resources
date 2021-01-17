package ObjectManagement;

import bikes.Bicycle;

import java.time.LocalDateTime;



/**
 *
 * @author Pedro Machado "pedroma2000"
 */
 
public class BicycleSalesManagement extends ContainerOfObjects{

    private int SaleID;
    private LocalDateTime data;
    private double total;


    public BicycleSalesManagement(Bicycle[] objects, int saleID, LocalDateTime data) {
        super(objects);
        SaleID = saleID;
        this.data = data;
    }

    public BicycleSalesManagement(int maxSize, int SaleID, LocalDateTime data){
        super(maxSize);
        this.SaleID = SaleID;
        this.data = data;
    }

    public boolean addBicycle(Bicycle newBike){
        return super.addObject(newBike);
    }

    public Bicycle removeBicycle(Bicycle bike){
        int pos = super.findObject(bike);
        return (Bicycle) super.removeObject(pos);
    }

    public boolean setBike(int pos, Bicycle bike){
        return super.setObject(pos, bike);
    }


    public int findBike(Bicycle bike){
        return super.findObject(bike);
    }

    public void printAllBicycles(Bicycle[] list){
        super.printall(list);
    }

}
