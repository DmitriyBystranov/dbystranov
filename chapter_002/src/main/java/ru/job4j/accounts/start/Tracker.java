package ru.job4j.accounts.start;

import models.Item;
import java.util.Random;
/**
	* Class ArrayDuplicate (Решение задачи Инкапсуляция).
	* @author Bystranov
	* @since 09.07.2017
	* @version 1.0
*/
public class Tracker {
	
	private Item[] items = new Item[100]; // Массив всех заявок.
	private byte position = 0; // Номер заявки (Каким номером по счёту идёт заявка).
	private final Random RN = new Random();
/**
	* Method add Добавляет зайвку в реестр (массив) заявок.
	* @param item - В этот параметр вписываем созданную заявку для внесеня её в реестр.
	* @return item - Возвращает внесённую в реестр заявку.
*/
	public Item add(Item item) {
		item.setId(generatedId()); // Параметр - метод генерирующий id номер заявки.
		this.items[position++] = item; // "Энной" ячейке массива присваиваем созданную заявку.
		return item; // Возвращаем эту заявку.
	}
/**
	* Method add Удаляет заявку из реестра.
	* @param item - В этот параметр вписываем заявку, которую хотим удалить.
*/	
	public void update(Item item) {
		for(int i = 0; i != position; i++) { // Пробегаем по всем заявкам
			if(items[i].getId().equals(item.getId())) { // Находим ту самую, сравнив id вписанной заявки с найденой в реестре.
				items[i] = item; // Заменяем.
				break;
			}
		}
	}
/**
	* Method add Удаляет заявку из реестра.
	* @param item - В этот параметр вписываем заявку, которую хотим удалить.
*/	
	public void delete(Item item) {
		for(int i = 0; i != position; i++) { // Пробегаем по всем заявкам
			if(items[i].getId().equals(item.getId())) { // Находим ту самую, сравнив id вписанной заявки с найденой в реестре.
				System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1); // Перекрываем заявку другими ячейками с правой стороны.
				this.items[position] = null; // Последнюю заявку делаем "пустой".
				position--;
				break;
			}
		}
	}
/**
	* Method getAll Выводит весь массив заявок, кроме "пустых" ячеек.
	* @return copyArray - Возвращает копию массива со всеми заявками.
*/
	public Item[] getAll() {
		Item[] copyArray = new Item[position]; // Создаём копию массива заявок.
		for(int i = 0; i != position; i++) { // Закидываем туда все ячейки.
			copyArray[i] = this.items[i];
		}
		return copyArray; // Возвращаем заполненый массив всеми существующими заявками.
	}
/**
	* Method findByName Производит поиск заявок по имени.
	* @param key - В этот параметр вписываем заявку, которую хотим найти.
	* @return result - Возвращает найденую заявку.
*/	
	public Item findByName(String key) {
		Item result = null;
		for(Item item : items) {
			if(item.getName().equals(key)) {
				result = item;
				break;
			}
		}
		return result;
	}
/**
	* Method findById Производит поиск заявок по id.
	* @param key - В этот параметр вписываем заявку, которую хотим найти.
	* @return result - Возвращает найденую заявку.
*/
	public Item findById(String id) {
		Item result = null; // Создаём копию найденой заявки.
		for(Item item : items) {  // Пробегаем по всему реестру.
			if(item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
/**
	* Method generatedId Производит генерацию id кода для заявки.
*/	
	public String generatedId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
	}
}