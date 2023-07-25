package org.example;

public class Woman extends Person {
    public Woman(String firstName, String lastName, int age, Person partner, String maidenName) {
        super(firstName, lastName, age, partner, maidenName);
        this.maidenName = lastName;
    }

    @Override
    boolean isRetired() {
        return age >= 60;
    }

    @Override
    void registeredPartner(Person partner) {
        if(partner instanceof Man) {
            this.partner = partner;
            partner.partner = this;
            this.lastName = partner.lastName;
        }

    }

    @Override
    void deregisterPartnership(boolean backLastname) {
        if(backLastname) {
            this.lastName = maidenName;
        }
        partner.partner = null;
        this.partner = null;
    }


}

