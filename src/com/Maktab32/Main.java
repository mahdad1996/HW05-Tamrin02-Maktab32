package com.Maktab32;

import javax.swing.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    ArrayList<Person>people = new ArrayList<>();

    public Main(){
        addPerson();
        //sort by age:
        Collections.sort(people,new SortByAge());
        for (Person p:people) {
            System.out.println(p.toString());
        }
        //end sort
        //sort by lenght of name
        Collections.sort(people,new SortByLastName());
        for (Person p1:people){
            System.out.println(p1.getLastName());

        }
        //end sort
        //list of people which live in tehran - zone < 5 implemented normal
        System.out.println("normal implement : ");
        List<Person> result = new ArrayList<>();
        for(Person p2:people){
            if(p2.getAddress().getCity().equals("Tehran") && p2.getAddress().getZone()<5){
                result.add(p2);
            }
        }
        System.out.println(result.toString());

        //list of people which live in tehran - zone < 5 implemented by predicates
        System.out.println("implemented by Predicates : ");
        Predicate<Person> personPredicate = s->s.getAddress().getCity().equals("Tehran") && s.getAddress().getZone()<5;
        for (Person p3:people) {
          boolean validate = personPredicate.test(p3);
          if(validate==true) System.out.println(p3.toString());
        }

        //list of people which live in tehran - zone < 5 implemented by streams
        System.out.println("implemented by streams : ");
        people.stream().filter(personPredicate).forEach(System.out::println);




    }
    public static void main(String[] args) {

        new Main();

    }

    public void addPerson(){
        Address adr = new Address("alley","street",5,"city","127210");
        Person p = new Person("seth","baxter",23 ,adr);
        people.add(p);
        Address adr1 = new Address("alley1","street1",5,"city1","1272101");
        Person p1 = new Person("john","morgan",34 ,adr1);
        people.add(p1);
        Address adr2 = new Address("alley","street",4,"city3","12721033");
        Person p2 = new Person("adam","nergal",45 ,adr2);
        people.add(p2);
        Address adr3 = new Address("alley3","street3",3,"city","127210");
        Person p3 = new Person("mahdad","aioby",24 ,adr3);
        people.add(p3);
        Address adr4 = new Address("alley4","street4",2,"Tehran","127218880");
        Person p4 = new Person("carach","angren",37 ,adr4);
        people.add(p4);

    }
}
