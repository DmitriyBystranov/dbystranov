package ru.job4j.accounts;
/**
	* Class ArrayDuplicate (Решение задачи Инкапсуляция).
	* @author Bystranov
	* @since 09.07.2017
	* @version 1.0
*/
public class Tracker {
	
	private Item[] items = new Item[100]; // Массив всех заявок.
	private byte position = 0; // Номер заявки (Каким номером по счёту идёт заявка).
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
	
	public void update(Item item) {
		
	}
/**
	* Method add Удаляет заявку из реестра.
	* @param item - В этот параметр вписываем заявку, которую хотим удалить.
*/	
	public void delite(Item item) {
		for(i = 0; i != position; i++) { // Пробегаем по всем заявкам
			if(items[i].getId().equals(item.getId())) { // Находим ту самую, сравнив id вписанной заявки с найденой в реестре.
				for(j = i; j != position; j++) { // Делаем алгоритм перенося найденую заявку в конец массива.
					String temp = null;
					temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
					if(j + 1 == position) { // Если завка в последней ячейке массива,
						items[j + 1] = null;  // То присваиваем ей "пустоту".
					}
				}
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
			if(items[i].equls(null)) { // Кроме пустых.
				continue;
			}
			copyArray[i] = this.items[i];
		}
		return copyArray; // Возвращаем заполненый массив всеми существующими заявками.
	}
/**
	* Method findByName Производит поиск заявок по имени.
	* @param key - В этот параметр вписываем заявку, которую хотим найти.
	* @return result - Возвращает найденую заявку.
*/	
	public item[] findByName(String key) {
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
			if(itme != null && item.getId().equals(id)) {
				result = itme;
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