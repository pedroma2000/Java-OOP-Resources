/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2;

import java.util.Arrays;

/**
 *
 * @author Pedro Machado "pedroma2000"
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user1 = new User();
        //User user2 = new User();
        /*
        double soma = 0;
        double soma2 = 0;
        double media = 0;
        double media2 = 0;
        int indices = 0;
        int indices2 = 0;
         */
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.name = new char[]{'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[]{'b', 'm', 'o', '@', 'e', 's', 't', 'g',
            'f', '.', 'i', 'p', 'p', '.', 'p', 't'};

        user1.E.setCarValues(100.99, 0);
        user1.E.setCarValues(200.99, 2);
        user1.E.setCarValues(140.99, 3);
        user1.E.setCarValues(101.50, 6);
        user1.E.setNumber1(4);
//        user1.E.carValues[0] = 100.99;
//        user1.E.carValues[2] = 200.99;
//        user1.E.carValues[3] = 140.99;
//        user1.E.carValues[6] = 101.50;
//        user1.E.number1 = 4;

        user1.E.setFoodValues(10, 0);
        user1.E.setFoodValues(20, 1);
        user1.E.setFoodValues(30, 2);
        user1.E.setFoodValues(40, 3);
        user1.E.setNumber2(4);
//        user1.E.foodValues[0] = 10;
//        user1.E.foodValues[1] = 20;
//        user1.E.foodValues[2] = 30;
//        user1.E.foodValues[3] = 40;
//        user1.E.number2 = 4;

        char[] carro = new char[]{'M', 'e', 'r', 'c', 'e', 'd', 'e', 's'};
        //char[] carro2 = new char[]{'B', 'M', 'W'};

        user1.E.setDescriptionCar(carro);
        //user2.E.setDescriptionCar(carro2); //tem de tirar o estatico pro carro ser diferente

        /*
        for (int i = 0;
                i < user1.E.carValues.length;
                i++) {
            if (user1.E.carValues[i] != 0.0) {
                soma += user1.E.carValues[i];
                indices++;
            }
        }

        media = soma / indices;

        for (int i = 0;
                i < user1.E.foodValues.length;
                i++) {
            if (user1.E.foodValues[i] != 0.0) {
                soma2 += user1.E.foodValues[i];
                indices2++;
            }
        }
        media2 = soma2 / indices2;
         */
        user1.E.costCar();

        System.out.println(
                "-------------User 1------------");
        System.out.print(
                "ID :");
        System.out.println(user1.id);

        System.out.print(
                "Name:");
        System.out.println(user1.name);

        System.out.print(
                "Email:");
        System.out.println(user1.email);

        System.out.println(
                " ");
        System.out.print(
                "Expense number: ");
        System.out.println(user1.E.getNumber1());

        System.out.print(
                "Car Values :");
        System.out.println(Arrays.toString(user1.E.getCarValues()));
        System.out.print(
                "Car Description: ");
        System.out.println(user1.E.getDescriptionCar());

        System.out.print(
                "Total Despesas carro: ");
        System.out.println(user1.E.getSoma());

        System.out.print(
                "Media Despesas carro: ");
        System.out.println(user1.E.getMedia());

        user1.E.costFood();

        System.out.println(
                " ");
        System.out.print(
                "Expense number: ");
        System.out.println(user1.E.getNumber2());

        System.out.print(
                "Food Values :");
        System.out.println(Arrays.toString(user1.E.getFoodValues()));
        System.out.print(
                "Food Description: ");
        System.out.println(user1.E.getDescriptionFood());

        System.out.print(
                "Total Despesas comida: ");
        System.out.println(user1.E.getSoma());

        System.out.print(
                "Media Despesas comida: ");
        System.out.println(user1.E.getMedia());

//        System.out.println("-------------User 2------------");
//        System.out.print("Car Description: ");
//        System.out.println(user2.E.descriptionCar);
    }

}
