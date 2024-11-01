package lab1;

import java.time.LocalDate;


public class CarRental {
    private Car car;
    private Renter renter;
    private String pickupLocation;
    private String dropoffLocation;
    private LocalDate startDate;
    private LocalDate endDate;

    public void calculateTotalPrice() {
        long rentalDays = startDate.until(endDate).getDays();
        double totalPrice = rentalDays * car.pricePerDay;
    }
}
