package Instrument;

import java.util.Scanner;

public class InstrumentClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("What instrument you want to buy,Guitar or Piano ?");
        String choose = in.next();

        if(choose.equals("Piano")) {
            System.out.println("Piano name: ");
            String name= in.next();
            System.out.println("Instrument Price: ");
            double price = in.nextDouble();
            System.out.println("Piano Type: ");
            String pianoType = in.next();

            Piano piano1 = new Piano(name, price, pianoType);
            piano1.print();
        } 
        else if (choose.equals("Guitar")) {
            System.out.println("Guitar name: ");
            String name= in.next();
            System.out.println(" Num String: ");
            int numString = in.nextInt();
            System.out.println("Instrument Price: ");
            double price = in.nextDouble();
            System.out.println("True or False: ");
            boolean isElectric = in.nextBoolean();

            Guitar guitar2 = new Guitar(name, price, numString, isElectric);
            guitar2.print();;
        } 
    }
  }


