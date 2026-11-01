class ParkingSystem {
    private int bigSlot;
    private int mediumSlot;
    private int smallSlot;

    public ParkingSystem(int big, int medium, int small) {
        this.bigSlot = big;
        this.mediumSlot = medium;
        this.smallSlot = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1) {
            if (this.bigSlot == 0) {
                return false;
            } else {
                this.bigSlot -= 1;
                return true;
            }
        } else if (carType == 2) {
            if (this.mediumSlot == 0) {
                return false;
            } else {
                this.mediumSlot -= 1;
                return true;
            }
        } else if (carType == 3) {
            if (this.smallSlot == 0) {
                return false;
            } else {
                this.smallSlot -= 1;
                return true;
            }
        } else {
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */