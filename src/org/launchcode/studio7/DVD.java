package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc   {

    // TODO: Implement your custom interface.

    public DVD(String name, int storageCapacity, int usedCapacity, String discType, int spinRate) {
        super(name, storageCapacity, usedCapacity, discType, spinRate);
    }

    @Override
    public void readData() {
        System.out.println("\n***** " +getName()+ " *****");
        System.out.println("Storage Capacity: " + getStorageCapacity());
        System.out.println("Used Capacity: " + getUsedCapacity());
    }

    @Override
    public void spinDisc() {
        System.out.println(getName() + " spinning at " +getSpinRate()+ " RPM \n");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
