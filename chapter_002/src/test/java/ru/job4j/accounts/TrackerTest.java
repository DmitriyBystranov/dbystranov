package ru.job4j.accounts;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
/**
	Add Test.
*/
	@Test
	public void whenItemADDEDToTheRegistry() {
		Item item = new Item();
		Tracker tracker = new Tracker();
		Item expected = tracker.add(item);
		Item result = item;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenItemUPDATEDToTheRegistry() {
		
	}
	
	@Test
	public void whenItemDELETEDToTheRegistry();
		Tracker tracker = new Tracker();
		Item item = new Item();
		tracker.add(item);
		tracker.delete(item);
		expected = tracker.findById(item.getId());
		result = null;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenYouWantWotchingALLItems() {
		Item[] item = new Item[] {new Item(), new Item(), new Item(), new Item()};
		Tracker tracker = new Tracker();
		expected = tracker.getAll();
		result = item;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenYouNeedFindItemByNAME() {
		Tracker tracker = new Tracker();
		Item[] item = new Item[] {new Item(), new Item(), new Item(), new Item()};
		expected = tracker.findByName();
	}
	
	@Test
	public void whenYouNeedFindItemByID() {
		Random RN = new Random();
		Tracker tracker = new Tracker();
		String id = String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
		expected = tracker.findById(id);
	}
}
