class ParkedCar {
    private String make, model, color, licensePlate;
    private int minutesParked;

    public ParkedCar(String make, String model, String color, String licensePlate, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlate = licensePlate;
        this.minutesParked = minutesParked;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public int getMinutesParked() {
        return this.minutesParked;
    }
}
