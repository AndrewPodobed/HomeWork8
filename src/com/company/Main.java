package com.company;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	Adress adress1 = new Adress("Москва", "Москворечная", 16);
	Adress adress2 = new Adress("Санкт-Петербург", "Ленина", 45);
	Adress adress4 = new Adress("Минск", "Франциска Скорины", 52);
	Adress adress5 = new Adress("Гомель", "Тростенецкая", 13);
	Adress adress6 = new Adress("Шклов", "Велосипедная", 12);

	Person person1 = new Person(null, "Емельяненко",adress1);
	Person person2 = new Person("Максим", null, adress2);
	Person person3 = new Person("Илья", "Швед", null);
	Person person4 = new Person("Екатерина", "Тяпкина",adress4);
	Person person5 = new Person("Федор", "Емельяненко",adress5);
	Person person6 = new Person("Игорь", "Дрозд",adress6);



	List <Person> personList = List.of(person1, person2, person3, person4, person5, person6);


		personList.stream().filter(Objects::nonNull).
                filter(person -> person.name != null).
				filter(person -> person.lastname != null).
                filter(person -> person.adress != null).
                sorted(Comparator.comparing(person -> person.adress.getNumberHome())).
                collect(Collectors.toList()).
                forEach(System.out::println);


    }


}
