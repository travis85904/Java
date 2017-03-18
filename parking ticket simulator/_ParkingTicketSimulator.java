class _ParkingTicketSimulator {
    private static ParkedCar parkedCar = new ParkedCar("Ford", "Expedition", "Red", "AUH1118", 180);
    private static ParkingMeter parkingMeter = new ParkingMeter(60);
    private static PoliceOfficer policeOfficer = new PoliceOfficer("Jim Gordon", "44692-017", parkedCar, parkingMeter);

    public static void main(String[] args) {
        policeOfficer.parkingTicket(parkedCar, parkingMeter).printTicket();
    }
}
//test