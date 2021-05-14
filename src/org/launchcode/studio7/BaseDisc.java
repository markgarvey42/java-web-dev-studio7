package org.launchcode.studio7;

public abstract class BaseDisc {


    private String name;
    private int storageCapacity;
    private int usedCapacity;
    private String discType;
    private int spinRate;

    public BaseDisc(String name, int storageCapacity, int usedCapacity, String discType, int spinRate) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.usedCapacity = usedCapacity;
        this.discType = discType;
        this.spinRate = spinRate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }
    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }
    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }

    public String getDiscType() {
        return discType;
    }
    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public int getSpinRate() {
        return spinRate;
    }
    public void setSpinRate(int spinRate) {
        this.spinRate = spinRate;
    }


}
