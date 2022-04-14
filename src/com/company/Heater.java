package com.company;

import java.util.Scanner;

public class Heater {

    private int level;
    Scanner sc = new Scanner(System.in);

    public Heater() {
        this.level = 0;
    }

    public void changeLevel() throws TooLowException, TooHighException {
        System.out.println("Please enter new heater setting (0, 1, 2, 3, 4, 5): ");
        this.level = sc.nextInt();
        if(this.level < 0) {
            this.level = 0;
            throw new TooLowException("0 is the lowest possible setting of this heater! Heater set to level " + this.level);
        } else if(this.level > 5) {
            this.level = 5;
            throw new TooHighException("5 is the highest possible setting of this heater! Heater set to level " + this.level);
        }
        System.out.println("Heating level successfully changed to " + this.level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
