
package com.mycompany.access;

import people.Person;


public class Access {

    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.anyHello();
        
        Person person = new Person("Pepito","Pérez", 15);
        person.createFullName();
        System.out.println();person.getFullName();
        System.out.println(person.getAge());
    }
}
