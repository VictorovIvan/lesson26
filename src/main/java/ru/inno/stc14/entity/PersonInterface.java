package ru.inno.stc14.entity;

import java.util.Date;

public interface PersonInterface {

    int getId();
    void setId(int id);
    String getName();
    void setName(String name);
    Date getBirthDate();
    void setBirthDate(Date birthDate);
    boolean equals(Object o);
    int hashCode();
    String toString();
}
