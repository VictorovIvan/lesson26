package ru.inno.stc14.service;

import ru.inno.stc14.entity.PersonProxy;

import java.util.Date;
import java.util.List;

public interface PersonService {

    List<PersonProxy> getList();

    boolean addPerson(String name, String birth);

    PersonProxy authorizationPerson = new PersonProxy();

    Date safeParseDate(String birthStr);
}
