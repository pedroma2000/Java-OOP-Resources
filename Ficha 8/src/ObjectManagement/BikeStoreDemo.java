package ObjectManagement;

import bikes.Bicycle;
import bikes.BikeManagement;
import bikes.MountainBike;
import bikes.RoadBike;

import java.time.LocalDateTime;

import static enums.BikeTools.*;
import static enums.BrakeType.*;
import static enums.Material.*;
import static enums.MountainBikeSuspension.*;


/**
 *
 * @author Pedro Machado "pedroma2000"
 */

public class BikeStoreDemo {

    public static void main(String[] args) {

        /* testing the class ContainerOf Objects*/
        /* ex1 test
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Object obj4 = new Object();
        Object obj5 = new Object();

        ContainerOfObjects test1 = new ContainerOfObjects();

        test1.addObject(obj1);
        test1.addObject(obj2);
        test1.addObject(obj3);
        test1.addObject(obj4);
        test1.addObject(obj5);

        test1.removeObject(1);
        test1.findObject(obj4);
        test1.setObject(3, obj5);
        test1.addObject(obj4);
        */

        //Bicycle bike1 = new MountainBike(10, SIMPLES,1,5,"blue",2.3f,H,CARBONO,234.5f,3);
        //Bicycle bike2 = new RoadBike(2,3,"RED", 2.3f,P,CARBONO,345.6f,3,"Fita azul", 4.5f);

        MountainBike bike1 = new MountainBike(10, SIMPLES,1,5,"blue",2.3f,H,CARBONO,234.5f,3);
        RoadBike bike2 =  new RoadBike(2,3,"RED", 2.3f,P,CARBONO,345.6f,3,"Fita azul", 4.5f);
        MountainBike bike3 = new MountainBike(5, DUPLA,3,5,"Green",2.3f,P,ALUMINIO,234.5f,4);

        bike1.addtool(BOLSA_SELIM);
        bike1.addtool(BOMBA_PRESSAO);
        bike1.addtool(CONTA_KIL);
        bike2.addobs("Bicicleta tem de ter rodas");
        bike2.addobs("Bicicleta tem de andar");
        bike3.addtool(GARRAFA_AGUA);
        /*
        BikeManagement list = new BikeManagement();
        list.addbike(bike1);
        list.addbike(bike2);
        list.addbike(bike3);
        */

        //ex2 tests
        Bicycle[] list = {bike1, bike2, null};
        BicycleSalesManagement Sale1 = new BicycleSalesManagement(list,1, LocalDateTime.now());

        System.out.println(Sale1.addBicycle(bike3));
        //Bicycle.PrintBikeList(list);
        System.out.println(Sale1.findBike(bike1));
        System.out.println(Sale1.removeBicycle(bike3));
        //Bicycle.PrintBikeList(list);
        System.out.println(Sale1.addBicycle(bike3));
        System.out.println(Sale1.setBike(2,bike1));
        //Bicycle.PrintBikeList(list);
        System.out.println(Sale1.setBike(2,bike3));
        //Bicycle.PrintBikeList(list);
        Sale1.printAllBicycles(list);








    }
}
