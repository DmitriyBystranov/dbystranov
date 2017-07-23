package ru.job4j.accounts;

import org.junit.Test;
import ru.job4j.accounts.models.Item;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
/**
	add test.
*/
// Пишем тест на простейшие setter-getter.
	@Test
	public void whenStartMethodSetId() {
		Item item = new Item(); // Создаём объект, на котором будем прерять методы.
		String id = "3892"; // Создаём переменную для settera.
		item.setId(id); // Запускаем setter.
		assertThat(item.getId(), is(id)); // Скравниваем внесённое значение в setter с выдачей gettera.
	}
	
	@Test
	public void whenStartMethodSetName() {
		Item item = new Item();
		String name = "Utilities";
		item.setName(name);
		assertThat(item.getName(), is(name));
	}
}