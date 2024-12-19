package com.omcodes.practice;

import com.omcodes.practice.model.Booking;
import com.omcodes.practice.model.Driver;
import com.omcodes.practice.model.Passenger;
import com.omcodes.practice.model.Vehicle;

import java.util.Scanner;

public class CabBookingManagement {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        CabBookingManagement cbm = new CabBookingManagement();
        int choice;

        do {
            System.out.println("\n--- Cab Booking Management System ---");
            System.out.println("1. Create Passenger");
            System.out.println("2. Create Driver");
            System.out.println("3. Create Vehicle");
            System.out.println("4. Create Booking");
            System.out.println("0. Exit");
            System.out.println("Select an option:");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                Passenger passenger = cbm.createPassenger();
                System.out.println("Passenger created: " + passenger);
            }
            if (choice == 2) {
                Driver driver = cbm.createDriver();
                System.out.println("Driver created: " + driver);
            }
            if (choice == 3) {
                Vehicle vehicle = cbm.createVehicle();
                System.out.println("Vehicle created: " + vehicle);
            }
            if (choice == 4) {
                Booking booking = cbm.createBooking();
                System.out.println("Booking created: " + booking);
            }

        } while (choice != 0);

        System.out.println("Thank you for using the system!");
    }

    private Passenger createPassenger() {
        System.out.println("Enter Passenger Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        Passenger passenger = new Passenger();
        return passenger;
    }

    private Driver createDriver() {
        System.out.println("Enter Driver Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        System.out.print("License Number: ");
        String license = sc.nextLine();
        Driver driver = new Driver();
        return driver;
    }

    private Vehicle createVehicle() {
        System.out.println("Enter Vehicle Details:");
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Registration Number: ");
        String regNumber = sc.nextLine();
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Seat Capacity: ");
        int seats = Integer.parseInt(sc.nextLine());
        System.out.print("Per Km Rate: ");
        double rate = Double.parseDouble(sc.nextLine());
        Vehicle vehicle = new Vehicle();
        return vehicle;
    }

    private Booking createBooking() {
        System.out.println("Enter Booking Details:");
        System.out.print("Passenger Name: ");
        String passengerName = sc.nextLine();
        System.out.print("Driver Name: ");
        String driverName = sc.nextLine();
        System.out.print("Vehicle Model: ");
        String vehicleModel = sc.nextLine();
        System.out.print("Pickup Location: ");
        String pickup = sc.nextLine();
        System.out.print("Drop Location: ");
        String drop = sc.nextLine();
        System.out.print("Distance (in km): ");
        double distance = Double.parseDouble(sc.nextLine());
        Booking booking = new Booking();
        return booking;
    }
}
