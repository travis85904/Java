public class ParkingTicket {
    private String make, model, color, licensePlate;
    private String officerName, officerBadgeNumber;
    private int minutesParked, minutesPurchased;

    public ParkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter, PoliceOfficer policeOfficer) {
        this.make = parkedCar.getMake();
        this.model = parkedCar.getModel();
        this.color = parkedCar.getColor();
        this.licensePlate = parkedCar.getLicensePlate();
        this.minutesParked = parkedCar.getMinutesParked();

        this.minutesPurchased = parkingMeter.getMinutesPurchased();

        this.officerName = policeOfficer.getName();
        this.officerBadgeNumber = policeOfficer.getBadgeNumber();
    }

    private double getFine() {
        if (minutesParked - minutesPurchased >= -60) {
            return 25;
        } else if (minutesParked - minutesPurchased < -60) {
            return ((((minutesParked - minutesPurchased) - 60) / 60) * 10) + 25;
        } else {
            return 0;
        }
    }

    public void printTicket() {
        System.out.println("Make: " + make + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + " \n" +
                "License Plate: " + licensePlate + "\n" +
                "Officer: " + officerName + "\n" +
                "Officer Badge: " + officerBadgeNumber + "\n" +
                "Fine Amount: $" + getFine());
    }
}
