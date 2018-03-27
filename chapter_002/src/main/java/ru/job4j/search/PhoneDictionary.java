package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();


    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержит key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедших пользователей.
     */
    public List<Person> find(String key) {
        String allInformationOfPerson = null;
        boolean agreement = false;

        List<Person> result = new ArrayList<>();
        for(Person person : persons) {
            allInformationOfPerson = person.getName() + person.getSurname() + person.getPhone() + person.getAddress();
            agreement = allInformationOfPerson.contains(key);
            if(agreement) {
                result.add(person);
            }
        }
        return result;
    }
}
