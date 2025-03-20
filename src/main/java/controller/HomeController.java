package controller;

public class HomeController {

        public static void main(String[] args) {
            int otMinutes = 150; // Example OT time in minutes
            double otHours = otMinutes / 60.0; // Convert minutes to hours
    
            System.out.println("OT Time in Minutes: " + otMinutes);
            System.out.println("OT Time in Hours: " + String.format("%.2f", otHours));
        }
    }
    

