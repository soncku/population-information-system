package main.domain.model;

public class Name {

    private String firstName;

    private String middleName;

    private String lastName;

    private String birthLastName;

    public Name(final String firstName, final String middleName, final String lastName,
                final String birthLastName) {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setLastName(lastName);
        this.setBirthLastName(birthLastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthLastName() {
        return birthLastName;
    }

    private void setFirstName(final String firstName) {
        if (firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("First name must have a value");
        }
        this.firstName = firstName;
    }

    private void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    private void setLastName(final String lastName) {
        if (lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name must have a value");
        }
        this.lastName = lastName;
    }

    private void setBirthLastName(final String birthLastName) {
        if (birthLastName == null || birthLastName.isEmpty()) {
            throw new IllegalArgumentException("Birth last name must have a value");
        }
        this.birthLastName = birthLastName;
    }

}
