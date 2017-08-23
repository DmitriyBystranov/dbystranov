package ru.job4j.accounts.start;

import ru.job4j.accounts.models.Item;

class DeleteItem implements UserAction {

	private Tracker tracker;
	private Input input;

	public DeleteItem(Tracker tracker, Input input) {
		this.input = input;
		this.tracker = tracker;
	}

	@Override
	public int key() {
		return 3;
	}

	@Override
	public void execute() {
		System.out.println("Item " + tracker.delete(input.ask("Pleas, enter the item's ID you want to be delete: ")) + " is delete.");
	}

	@Override
	public String info() {
		return String.format("%s. %s", this.key(), "Delete item");
	}
}

public class Menu {

	private Input input;
	private Tracker tracker;
 	private UserAction[] actions = new UserAction[6];
 	private int position = 0;

	public Menu(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}

	public void fillActions() {
		this.actions[position++] = this.new AddItem("Add Item", 0);
		this.actions[position++] = this.new ShowItems("Show all items", 1);
		this.actions[position++] = new Menu.EditItem(tracker, input);
		this.actions[position++] = new DeleteItem(tracker, input);
		this.actions[position++] = this.new FindByID("Find items by ID", 4);
		this.actions[position++] = this.new FindByName("Find items by name", 5);
	}


	public void select(int key) {
		this.actions[key].execute();
	}

	public void show() {
		for(UserAction action : this.actions) {
			if(action != null) {
				System.out.println(action.info());
			}
		}
	}

	private class AddItem extends BaseAction {

		AddItem(String name, int key) {
			super(name, key);
		}

		@Override
		public int key() {
			return 0;
		}

		@Override
		public void execute() {
			Item item = tracker.add(new Item());
			item.setName(input.ask("Pleas, enter the item's NAME: "));
			item.setDescription(input.ask("Pleas, enter the item's DESCRIPTION: "));
		}
	}

	private class ShowItems extends BaseAction {

		public ShowItems(String name, int key) {
			super(name, key);
		}

		@Override
		public int key() {
			return 1;
		}

		@Override
		public void execute() {
			tracker.getAll();
			for (Item item3 : tracker.getAll()) {
				System.out.print(item3.toString());
			}
		}

		@Override
		public String info() {
			return String.format("%s. %s", this.key(), "Show all items");
		}
	}

	private static class EditItem implements UserAction {

		private Tracker tracker;
		private Input input;

		public EditItem(Tracker tracker, Input input) {
			this.tracker = tracker;
			this.input = input;
		}

		@Override
		public int key() {
			return 2;
		}

		@Override
		public void execute() {

			Item item = tracker.findById(input.ask("Enter ID: "));
			item.setName(input.ask("Pleas, enter the item's NAME: "));
			item.setDescription(input.ask("Pleas, enter the item's DESCRIPTION: "));
			tracker.edit(item);
		}

		@Override
		public String info() {
			return String.format("%s. %s", this.key(), "Edit item");
		}
	}

	private class FindByID extends BaseAction {

		public FindByID(String name, int key) {
			super(name, key);
		}

		@Override
		public int key() {
			return 4;
		}

		@Override
		public void execute() {
			System.out.println(tracker.findById(input.ask("Pleas, enter the item's ID: ")));
		}

		@Override
		public String info() {
			return String.format("%s. %s", this.key(), "Find item by Id");
		}
	}

	private class FindByName extends BaseAction {

		public FindByName(String name, int key) {
			super(name, key);
		}

		@Override
		public int key() {
			return 5;
		}

		@Override
		public void execute() {
			System.out.println(tracker.findByName(input.ask("Pleas, enter the item's NAME: ")));
		}

		@Override
		public String info() {
			return String.format("%s. %s", this.key(), "Find items by name");
		}
	}
}