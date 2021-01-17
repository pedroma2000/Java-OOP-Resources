package bikes;

import ObjectManagement.ContainerOfObjects;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class BikeManagement extends ContainerOfObjects {

    private final int MAXBIKES = 20;
    private Bicycle[] bikelist = new Bicycle[MAXBIKES];
    private int count = 0;

    /**
     *
     * @param bike
     */
    public void addbike(Bicycle bike) {
        if (count < MAXBIKES) {
            bikelist[count] = bike;
            count += 1;
        } else {
            System.out.println("MAX Bikes");
        }
    } //ou pode percorrer o array e adicionar pra la



    /**
     *print bikelist
     *
     * @return
     */
    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += "Bike " + (i + 1) + " : " + "\n" + bikelist[i].toString() + "\n";
        }
        return text;
    }

    /*
    public static void printList(BikeManagement list){

        Bicycle.PrintBikeList(list);

    }
    */
}
