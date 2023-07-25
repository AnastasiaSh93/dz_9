package org.example;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected Person partner;
    protected String maidenName;

        public Person(String firstName, String lastName, int age, Person partner, String maidenName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.partner = partner;
            this.maidenName = maidenName;

        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        abstract boolean isRetired();
        abstract void registeredPartner(Person partner);
        abstract void deregisterPartnership(boolean backLastname);


    }

