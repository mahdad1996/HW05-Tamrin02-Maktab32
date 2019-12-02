package com.Maktab32;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    ArrayList<Person>people = new ArrayList<>();

    public Main(){
        addPerson();
        Collections.sort(people,new SortByAge());
        for (Person p:people) {
            System.out.println(p.toString());
        }
    }
    public static void main(String[] args) {

        new Main();

    }

    public void addPerson(){
        Address adr = new Address("alley","street","5","city","127210");
        Person p = new Person("seth","baxter",23 ,adr);
        people.add(p);
        Address adr1 = new Address("alley1","street1","5","city1","1272101");
        Person p1 = new Person("john","morgan",34 ,adr1);
        people.add(p1);
        Address adr2 = new Address("alley","street","4","city3","12721033");
        Person p2 = new Person("adam","nergal",45 ,adr2);
        people.add(p2);
        Address adr3 = new Address("alley3","street3","4","city","127210");
        Person p3 = new Person("mahdad","aioby",24 ,adr3);
        people.add(p3);
        Address adr4 = new Address("alley4","street4","8","city","127218880");
        Person p4 = new Person("carach","angren",37 ,adr4);
        people.add(p4);

    }
}
