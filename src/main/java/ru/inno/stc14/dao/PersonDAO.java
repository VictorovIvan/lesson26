package ru.inno.stc14.dao;

import ru.inno.stc14.entity.PersonProxy;

import java.util.List;

public interface PersonDAO {

    List<PersonProxy> getList();

    boolean addPerson(PersonProxy person);
}
