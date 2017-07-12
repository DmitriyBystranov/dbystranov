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
	public void whenItemDELETEDToTheRegistry() {
		Item item = new Item();
		Tracker tracker = new Tracker();
		 expected = 
		result = 
	}
	
	@Test
	public void whenYouWantWotchingALLItems() {
		
	}
	
	@Test
	public void whenYouNeedFindItemByNAME() {
		
	}
	
	@Test
	public void whenYouNeedFindItemByID() {
		Tracker tracker = new Tracker();
		String id = String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
		expected = tracker.findById(id);
	}
}
