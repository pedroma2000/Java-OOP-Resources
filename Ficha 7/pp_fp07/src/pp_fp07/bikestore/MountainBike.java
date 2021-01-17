package pp_fp07.bikestore;

import pp_fp07.enums.BikeTools;
import pp_fp07.enums.BrakeType;
import pp_fp07.enums.Material;
import pp_fp07.enums.MountainBikeSuspension;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma Bicicleta de montanha
 * </p>
 */
public class MountainBike extends Bicycle {

    private final int MAXTOOLS = 10;
    private int counttools = 0;

    /**
     * Número de luzes
     */
    private int numberOfLights;
    /**
     * Tipo de suspensão
     */
    private MountainBikeSuspension suspension;
    /**
     * Utensílios existentes neste tipo de bicicleta
     */
    private BikeTools[] bikeTools;

    /**
     * Método construtor para a criação de uma instância de
     * {@link MountainBike bicicleta de montanha} sem utensílios.
     *
     * @param numberOfLights Número de luzes
     * @param suspension Tipo de suspensão
     * @param id Identificador da bicicleta
     * @param numberOfGears Número de velocidades
     * @param mainColor Cor da bicicleta
     * @param weelSize Diâmetro das rodas
     * @param brakes {@link BrakeType tipo de travões} da bicicleta
     * @param material {@link Material tipo de material} da bicicleta
     * @param price Preço da bicicleta
     * @param guarantee Anos de garantia
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension,
            int id, int numberOfGears, String mainColor, float weelSize,
            BrakeType brakes, Material material, float price, int guarantee) {

        super(id, numberOfGears, mainColor, weelSize, brakes, material,
                price, guarantee);

        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
        bikeTools = new BikeTools[MAXTOOLS];
    }

    /**
     * Metodo de adicionar ferramentas ao array de bikeTools
     * conta tambem a posição que foi guardada com um counter
     * @param tool
     */
    public void addtool(BikeTools tool) {
        int i = 0;
        /// counter 
        // biketools[counter]
        // counter++
        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == null) {
                bikeTools[i] = tool;
                counttools++;
                break;
            }
        }
    }

    /**
     * metodo de editar tools, vaia aposiçao da tool antiga e da replace por uma
     * nova a escolha
     * @param tool
     * @param newtool
     */
    public void edittool(BikeTools tool, BikeTools newtool) {
        int i = 0;

        for (; i < MAXTOOLS; i++) {
            if (bikeTools[i] == tool) {
                bikeTools[i] = newtool;
                break;
            }
        }

    }

    /**
     * Metodo de remover tools
     * verifica se ha tools iguais a inserida no metodo, se houver ignora, se nao
     * houver, guarda pro array novo as diferentes
     * @param tool
     */
    public void removetool(BikeTools tool) {
        // 4-3 counter --
        int i = 0;
        BikeTools[] newtools = new BikeTools[bikeTools.length];

        for (int k = 0; i < MAXTOOLS; i++) {

            if (bikeTools[i] == tool) {
                counttools--;
                continue;
            }

            newtools[k++] = bikeTools[i];
        }
        bikeTools = newtools;
    }

    /**
     * printar tools
     * @return
     */
    public String printtools() {

        String tools = "";
        for (int i = 0; i < counttools; i++) {
            tools += bikeTools[i] + "\n";
        }

        return tools;
    }
    
    /**
     * printar bike
     */
    public void printBike(){
        System.out.println("-----------------//////---------");
        System.out.print("ID : ");
        System.out.println(super.getId());
        System.out.print("Number of Gears: ");
        System.out.println(super.getNumberOfGears());
        System.out.print("Cor : ");
        System.out.println(super.getMainColor());
        System.out.print("Weel Size : ");
        System.out.println(super.getWeelSize());
        System.out.print("Brakes : ");
        System.out.println(super.getBrakes());
        System.out.print("Material : ");
        System.out.println(super.getMaterial());
        System.out.print("Price : ");
        System.out.println(super.getPrice());
        System.out.print("Guarantee : ");
        System.out.println(super.getGuaranteeYears());
        System.out.print("Number of lights : ");
        System.out.println(numberOfLights);
        System.out.print("Suspension : ");
        System.out.println(suspension);
        System.out.println("-------------Tools : ");
        System.out.println(printtools());
        
    }

}
