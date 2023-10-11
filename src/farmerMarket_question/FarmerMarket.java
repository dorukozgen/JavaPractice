package farmerMarket_question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FarmerMarket {

    public static void main(String[] args) {
        double cucumber = 2 ;
        double apple = 1.20 ;
        double courgette = 3.10 ;
        double tomato = 4.19 ;
        double aubergine = 3.5 ;
        double orange = 1.25 ;

        ArrayList<String> boughtList = new ArrayList<>();

        System.out.println("***** Welcome To Our Farmers' Market *****");
        System.out.println("Please choose from our list of fresh vegetables and fruits \n" + " Price List\n"+
                "Cucumber £2, Apple £1.20, Courgette £3.10, Tomato £4.19, Aubergine £3.5, Orange £1.25");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many kilos of cucumbers : ");
        double cucumberKg = scanner.nextDouble();
        if (cucumberKg > 0) boughtList.add(cucumberKg + " kilos cucumber");

        System.out.println("How many kilos of apples : ");
        double appleKg = scanner.nextDouble();
        if (appleKg > 0) boughtList.add(appleKg + " kilos apple");

        System.out.println("How many kilos of courgettes : ");
        double courgetteKg = scanner.nextDouble();
        if (courgetteKg > 0) boughtList.add(courgetteKg + " kilos caurgette");

        System.out.println("How many kilos of tomatoes : ");
        double tomatoKg = scanner.nextDouble();
        if (tomatoKg > 0) boughtList.add(tomatoKg + " kilos tomato");

        System.out.println("How many kilos of aubergines : ");
        double aubergineKg = scanner.nextDouble();
        if (aubergineKg > 0) boughtList.add(aubergineKg + " kilos aubergine " + (aubergineKg*aubergine) + "£");


        System.out.println("How many kilos of oranges : ");
        double orangeKg = scanner.nextDouble();
        if (orangeKg > 0) boughtList.add(orangeKg + " kilos orange");

        double totalPrice = (cucumber*cucumberKg) + (apple*appleKg) + (courgette*courgetteKg) +
                (tomato*tomatoKg) + (aubergine*aubergineKg) + (orange*orangeKg);


        System.out.println("Receipt : £" + totalPrice);

        System.out.println("Bought list:");
        for (String each : boughtList) {
            System.out.println(each);
        }

    }
}
