package hu.sebestyenphoto.spring101;

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }
    public HotelBooking(){}

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNbOfNights() {
        return nbOfNights;
    }
}
