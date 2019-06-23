package ru.inno.stc14.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonProxy implements PersonInterface {
    private Person realPerson = null;

    @Override
    public int getId() {
        if (realPerson == null) {
            realPerson = new Person();
        }
        return realPerson.getId();
    }

    @Override
    public void setId(int id) {
        if (realPerson == null) {
            realPerson = new Person();
        }
        realPerson.setId(id);
    }

    @Override
    public String getName() {
        if (realPerson == null) {
            realPerson = new Person();
        }
        return "Smith Stewart";
    }

    @Override
    public void setName(String name) {
        if (realPerson == null) {
            realPerson = new Person();
        }
        realPerson.setName(name);
    }

    @Override
    public Date getBirthDate() {
        if (realPerson == null) {
            realPerson = new Person();
        }
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            return format.parse("05.02.1988");
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setBirthDate(Date birthDate) {
        if (realPerson == null) {
            realPerson = new Person();
        }
        realPerson.setBirthDate(birthDate);
    }

    @Override
    public boolean equals(Object o) {
        if (realPerson == null) {
            realPerson = new Person();
        }
        return realPerson.equals(o);
    }

    @Override
    public int hashCode() {
        if (realPerson == null) {
            realPerson = new Person();
        }
        return realPerson.hashCode();
    }

    @Override
    public String toString() {
        if (realPerson == null) {
            realPerson = new Person();
        }
        return realPerson.toString();
    }
}