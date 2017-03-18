class PoliceOfficer {
    private String name, badgeNumber;
    private int minutesParked, minutesPurchased;

    public PoliceOfficer(String name, String badgeNumber, ParkedCar parkedCar, ParkingMeter parkingMeter) {

        this.name = name;
        this.badgeNumber = badgeNumber;
        this.minutesParked = parkedCar.getMinutesParked();
        this.minutesPurchased = parkingMeter.getMinutesPurchased();
    }

    public String getName() {
        return this.name;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public ParkingTicket parkingTicket(ParkedCar parkedCar, ParkingMeter parkingMeter) {
        ParkingTicket ticket = null;
        this.minutesParked = parkedCar.getMinutesParked();
        this.minutesPurchased = parkingMeter.getMinutesPurchased();
        if (minutesParked > minutesPurchased) {
            return ticket = new ParkingTicket(parkedCar, parkingMeter, this);
        }

        return ticket;
    }
}
