package main.domain.model;

import java.util.Objects;

public class FamilyMember {

    /** The SSN of the relative */
    private Ssn ssn;

    /** What kind of relation is it between the two persons */
    private Relation relation;

    public FamilyMember (final Ssn ssn, final Relation relation) {
        this.setSsn(ssn);
        this.setRelation(relation);
    }

    public Ssn getSsn() {
        return ssn;
    }

    public Relation getRelation() {
        return relation;
    }

    private void setSsn(final Ssn ssn) {
        Objects.requireNonNull(ssn, "SSN must have a value");
        this.ssn = ssn;
    }

    private void setRelation(Relation relation) {
        Objects.requireNonNull(relation, "Relation must have a value");
        this.relation = relation;
    }
}
