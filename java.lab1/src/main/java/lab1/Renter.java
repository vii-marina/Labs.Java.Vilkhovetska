package lab1;

import java.util.Objects;

public record Renter(String lastName, String firstName, String documentId, String drivingLicense) {

    @Override
    public String toString() {
        return "Renter{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", documentId='" + documentId + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Renter renter)) return false;
        return Objects.equals(lastName, renter.lastName) &&
                Objects.equals(firstName, renter.firstName) &&
                Objects.equals(documentId, renter.documentId) &&
                Objects.equals(drivingLicense, renter.drivingLicense);
    }

}
