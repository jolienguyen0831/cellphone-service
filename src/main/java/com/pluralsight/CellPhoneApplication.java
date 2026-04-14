package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        createCellPhone(input, cellPhone1);
        createCellPhone(input, cellPhone2);

        displayCellPhone(cellPhone1);
        displayCellPhone(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber(), cellPhone2.getOwner());
        cellPhone2.dial(cellPhone1.getPhoneNumber(), cellPhone1.getOwner());
    }

    private static void createCellPhone(Scanner input, CellPhone cellPhone1) {
        System.out.print("What is the serial number? ");
        String cellSerial = input.nextLine();

        System.out.print("What model is the phone? ");
        String cellModel = input.nextLine();

        System.out.print("Who is the carrier? ");
        String cellCarrier = input.nextLine();

        System.out.print("What is the phone number? ");
        String cellPhoneNumber = input.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String cellOwner = input.nextLine();

        cellPhone1.setSerialNumber(cellSerial);
        cellPhone1.setModel(cellModel);
        cellPhone1.setCarrier(cellCarrier);
        cellPhone1.setPhoneNumber(cellPhoneNumber);
        cellPhone1.setOwner(cellOwner);
    }
    private static void displayCellPhone(CellPhone cellPhone1) {
        System.out.printf("%n%s uses %s with the serial %s of %s carrier%n",
                cellPhone1.getOwner(),
                cellPhone1.getModel(),
                cellPhone1.getSerialNumber(),
                cellPhone1.getCarrier());
        System.out.printf("The phone number is %s%n", cellPhone1.getPhoneNumber());
    }
}
