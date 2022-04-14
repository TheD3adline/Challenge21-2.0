package com.company;

public class Main {

    public static void main(String[] args) {

        Heater heater = new Heater();

        try {
            heater.changeLevel();
        } catch(TooLowException e) {
            System.out.println(e.getMessage());
        } catch(TooHighException e) {
            System.out.println(e.getMessage());
        }
    }
}
