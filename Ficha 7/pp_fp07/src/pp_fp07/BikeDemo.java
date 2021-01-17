package pp_fp07;


import pp_fp07.bikestore.BikeManagement;
import pp_fp07.bikestore.MountainBike;
import pp_fp07.bikestore.RoadBike;
import pp_fp07.enums.BikeTools;
import pp_fp07.enums.BrakeType;
import pp_fp07.enums.Material;
import pp_fp07.enums.MountainBikeSuspension;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class BikeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MountainBikeSuspension mm = MountainBikeSuspension.DUPLA;
        //System.out.println(MountainBikeSuspension.MountainBikeSuspensionToString(mm));
        
        MountainBike b = new MountainBike(0, mm, 0, 0, "P", 0, BrakeType.P, Material.CARBONO, 0, 0);
        
        b.addtool(BikeTools.GPS);
        b.addtool(BikeTools.BOMBA_PRESSAO);
        b.addtool(BikeTools.CONTA_KIL);
        
        System.out.println(b.printtools());
        
        b.removetool(BikeTools.GPS);
        
        System.out.println(" ");
        System.out.println(b.printtools());
        
        System.out.println(" ");
        
        
        
        RoadBike b2 = new RoadBike(2, 0, "Blue", 0, BrakeType.P, Material.CARBONO, 0, 0, "Fitacola", 0);
        b2.addobs("Bicicleta tem de ter rodas");
        b2.addobs("Bicicleta tem de andar");
        System.out.println(b2.printobs());
        
        //b2.editmaterial(Material.CARBONO, Material.ALUMINIO);
        //b2.printmat();
        BikeManagement list = new BikeManagement();
        list.addbike(b);
        list.addbike(b2);
        
        System.out.println(list.toString());
        //System.out.println(b.printBike());
        
        //list.printbikelist();
        
    }
    
}
