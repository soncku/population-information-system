package main.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrivatePerson {

    private Ssn ssn;

    private Name name;

    private Address address;

    private Citizenship citizenship;

    private Language nativeLanguage;

    private Language communicationLanguage;

    private LocalDate birthDate;

    private LocalDate deathDate;

    private List<FamilyMember> familymembers;

    public PrivatePerson(final Ssn ssn, final Name name, final Address address, final Citizenship citizenship,
                         final Language nativeLanguage, final Language communicationLanguage, final LocalDate birthDate,
                         final LocalDate deathDate, final List<FamilyMember> familymembers) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.citizenship = citizenship;
        this.nativeLanguage = nativeLanguage;
        this.communicationLanguage = communicationLanguage;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.familymembers = familymembers;
    }

    public void changeName(final Name name, final String reason) {
        Objects.requireNonNull(name, "Name must have a value");
        this.name = name;
        // reason could be logged or stored
    }

    public void changeAddress(final Address address, final String reason) {
        Objects.requireNonNull(address);
        this.address = address;
        // reason could be logged or stored
    }

    public void changeCitizenship(Citizenship citizenship) {
        Objects.requireNonNull(citizenship);
        this.citizenship = citizenship;
    }

    public void addNativeLanguage(Language nativeLanguage) {
        Objects.requireNonNull(nativeLanguage);
        this.communicationLanguage = nativeLanguage;
    }

    public void changeCommunicationLanguage(Language communicationLanguage) {
        Objects.requireNonNull(communicationLanguage);
        this.communicationLanguage = communicationLanguage;
    }

    public void changeBirthDate(final LocalDate birthDate) {
        Objects.requireNonNull(birthDate);
        this.birthDate = birthDate;
    }

    public void addDeathDate(final LocalDate deathDate) {
        Objects.requireNonNull(deathDate);
        this.deathDate = deathDate;
    }

    public void addFamilyMember(final FamilyMember familyMember) {
        Objects.requireNonNull(familyMember);
        if (familymembers.contains(familyMember)) {
            // LOG or/and do something
        }
        this.familymembers.add(familyMember);
    }

    public void removeFamilyMember(final FamilyMember familyMember) {
        Objects.requireNonNull(familyMember);
        if (!familymembers.contains(familyMember)) {
            // LOG or/and do something
        }
        this.familymembers.remove(familyMember);
    }

    public Name getName() {
        return name;
    }

    public Ssn getSsn() {
        return ssn;
    }

    public Address getAddress() {
        return address;
    }

    public Citizenship getCitizenship() {
        return citizenship;
    }

    public Language getNativeLanguage() {
        return nativeLanguage;
    }

    public Language getCommunicationLanguage() {
        return communicationLanguage;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }
}
