package ru.job4j.search;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Dmitriy","Bystranov","038573","Samara"));
        List<Person> persons = phones.find("Dmitriy");
        assertThat(persons.iterator().next().getSurname(), is("Bystranov"));
    }
}
