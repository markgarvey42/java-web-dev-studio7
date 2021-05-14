package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("CD-1", 1000, 500, "CD", 1600);
        DVD dvd = new DVD("DVD-1", 500, 250, "DVD", 500);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

    }
}
