package main.domain.model;

public class Address {

    /** The current street address */
    private String streetAddress;

    /** The current postal code */
    private String postalCode;

    /** The current home city */
    private String city;

    /** The current home country */
    private Country country;

    /** The birth town, home municipality */
    private String homeMunicipality;

    public Address (final String streetAddress, final String postalCode,
                    final String city, final Country country, final String homeMunicipality) {
        this.setStreetAddress(streetAddress);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setCountry(country);
        this.setHomeMunicipality(homeMunicipality);
    }


    public String getStreetAddress() {
        return streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public String getHomeMunicipality() {
        return homeMunicipality;
    }

    private void setStreetAddress(final String streetAddress) {
        if (streetAddress == null || streetAddress.isEmpty()) {
            throw new IllegalArgumentException("Street address must have a value");
        }
        this.streetAddress = streetAddress;
    }

    private void setPostalCode(final String postalCode) {
        if (postalCode == null || postalCode.isEmpty()) {
            throw new IllegalArgumentException("Postal code must have a value");
        }
        this.postalCode = postalCode;
    }

    private void setCity(final String city) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City must have a value");
        }
        this.city = city;
    }

    private void setCountry(Country country) {
        if (country == null) {
            throw new IllegalArgumentException("Country must have a value");
        }
        this.country = country;
    }

    private void setHomeMunicipality(final String homeMunicipality) {
        if (homeMunicipality == null || homeMunicipality.isEmpty()) {
            throw new IllegalArgumentException("Home municipality must have a value");
        }
        this.homeMunicipality = homeMunicipality;
    }
}
