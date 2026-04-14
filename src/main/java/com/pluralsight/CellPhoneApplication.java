package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CellPhone cellPhone = new CellPhone();
        System.out.print("What is the serial number? ");
        int cellSerial = input.nextInt();
        cellPhone.setSerialNumber(cellSerial);
        input.nextLine();
        System.out.print("What model is the phone? ");
        String cellModel = input.nextLine();
        cellPhone.setModel(cellModel);
        System.out.print("Who is the carrier? ");
        String cellCarrier = input.nextLine();
        cellPhone.setCarrier(cellCarrier);
        System.out.print("What is the phone number? ");
        String cellPhoneNumber = input.nextLine();
        cellPhone.setPhoneNumber(cellPhoneNumber);
        System.out.print("Who is the owner of the phone? ");
        String cellOwner = input.nextLine();
        cellPhone.setOwner(cellOwner);

        System.out.printf("%s uses %s with the serial %d of %s carrier%n",
                cellPhone.getOwner(),
                cellPhone.getModel(),
                cellPhone.getSerialNumber(),
                cellPhone.getCarrier());
        System.out.printf("The phone number is %s%n", cellPhone.getPhoneNumber());
    }
}
