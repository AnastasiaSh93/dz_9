package org.example;

public class Man extends Person {
    public Man(String firstName, String lastName, int age, Person partner, String maidenName) {
        super(firstName, lastName, age, partner, maidenName);
    }

    @Override
    boolean isRetired() {
        return age >= 65;
    }

    @Override
    void registeredPartner(Person partner) {
        if(partner instanceof Woman) {
            this.partner = partner;
            partner.partner = this;
            partner.lastName = this.lastName;
        }
    }

    @Override
    void deregisterPartnership(boolean backLastname) {
        if(backLastname && partner instanceof Woman) {
            partner.lastName = ((Woman) partner).maidenName;
        }

    }

}









