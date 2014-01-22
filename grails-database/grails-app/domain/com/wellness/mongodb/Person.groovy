package com.wellness.mongodb

class Person {
	
	static mapWith = "mongo"

    String firstName;
    String lastName;

    static hasMany = [addresses: Address]

    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
    }
	
	String toString(){ return "${firstName} ${lastName}"}
}
