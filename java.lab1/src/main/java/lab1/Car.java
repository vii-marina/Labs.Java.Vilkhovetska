package lab1;
import java.time.LocalDate;
import java.util.Objects;


public class Car {
    private final String brand;
    private final String vin;
    private final String plateNumber;
    private final LocalDate releaseDate;
    private final int mileage;
    protected double pricePerDay;

    // @Constructor
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.vin = builder.vin;
        this.plateNumber = builder.plateNumber;
        this.releaseDate = builder.releaseDate;
        this.mileage = builder.mileage;
        this.pricePerDay = builder.pricePerDay;
    }

    // @Getter
    public String getBrand() {
        return brand;
    }

    public String getVin() {
        return vin;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", vin='" + vin + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", releaseDate=" + releaseDate +
                ", mileage=" + mileage +
                ", pricePerDay=" + pricePerDay +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return mileage == car.mileage &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(vin, car.vin) &&
                Objects.equals(plateNumber, car.plateNumber) &&
                Objects.equals(releaseDate, car.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, vin, plateNumber, releaseDate, mileage);
    }

    /**
     * @Builder class for Car.
     */
    public static class Builder {
        private String brand;
        private String vin;
        private String plateNumber;
        private LocalDate releaseDate;
        private int mileage;

        protected double pricePerDay;

        // Сеттери для кожного поля в Builder'і
        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setVin(String vin) {
            this.vin = vin;
            return this;
        }

        public Builder setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }

        public Builder setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setMileage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        public Builder setPricePerDay(double v) {
            this.pricePerDay = v;
            return this;
        }

        // Метод build для створення об'єкта Car
        public Car build() {
            return new Car(this);
        }


    }
}
