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
		Tracker tracker = new Tracker();
		Item item = new Item();
		tracker.add(item);
		tracker.delete(item);
		Item expected = tracker.findById(item.getId());
		Item result = null;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenYouWantWotchingALLItems() {
		Tracker tracker = new Tracker();
		Item gaz = new Item();
		Item light = new Item();
		Item water = new Item();
		Item[] item = {gaz, light, water};
		tracker.add(gaz);
		tracker.add(light);
		tracker.add(water);
		Item[] expected = tracker.getAll();
		Item[] result = item;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenYouNeedFindItemByNAME() {
		Tracker tracker = new Tracker();
		Item gaz = new Item();
		Item light = new Item();
		Item water = new Item();
		gaz.setName("GAZ");
		light.setName("light");
		water.setName("water");
		tracker.add(gaz);
		tracker.add(light);
		tracker.add(water);
		//Item[] item = new Item[] {new Item(), new Item(), new Item(), new Item()};
		Item expected = tracker.findByName("light");
		Item result = light;
		assertThat(result, is(expected));
	}
	
	@Test	
	public void whenYouNeedFindItemByID() {
		Tracker tracker = new Tracker();
		Item gaz = new Item();
		Item light = new Item();
		Item water = new Item();
		tracker.add(gaz);
		tracker.add(light);
		tracker.add(water);
		Item expected = tracker.findById(gaz.getId());
		Item result = gaz;
		assertThat(result, is(expected));
	}
}
