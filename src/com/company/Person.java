package com.company;

public class Person {
    private String name;
    private String lastname;
    private Adress adress;

    public Person(String name, String lastname, Adress adress){
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Adress getAdress() {
        return adress;
    }

    @Override
    public String toString(){
        return "Имя: " + name + " Фамилия: " + lastname + " " + getAdress();
    }


}
