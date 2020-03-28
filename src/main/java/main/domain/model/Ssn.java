package main.domain.model;

public class Ssn {

    private String ssn;

    public Ssn(final String ssn) {
        this.setSsn(ssn);
    }

    public String getSsn() {
        return ssn;
    }

    private void setSsn(String ssn) {
        if(!isValid(ssn) || ssn == null || ssn.isEmpty()) {
            throw new IllegalArgumentException("Ssn must be valid and have a value");
        }
        this.ssn = ssn;
    }

    private boolean isValid (final String ssn) {
        // Check for validity
        return true;
    }
}