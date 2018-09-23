package com.github.smk7758.test_2018_09_21_Enum;

;

public class Main {
	public static void main(String[] args) {
		new Main().processer(0);
		new Main().classifyFoods(Foods.MUSHROOM);
	}

	// enum Foods {
	// MUSHROOM, VEGITABLE, FRUITS;
	// }

	enum Foods {
		MUSHROOM("きのこ", 0), VEGITABLE("やさい", 1), FRUITS("かじつ", 2);

		final String NAME;
		final int ID;

		private Foods(String name, int id) {
			this.NAME = name;
			this.ID = id;
		}

		public String getName() {
			return NAME;
		}
	}

	public void processer(int number) {
		final int MUSHROOM = 0, VEGITABLE = 1, FRUITS = 2;

		switch (number) {
			case MUSHROOM:
				System.out.println("きのこ");
				break;
			case VEGITABLE:
				System.out.println("やさい");
				break;
			case FRUITS:
				System.out.println("かじつ");
				break;
			default:
				System.out.println("は?");
		}
	}

	public void classifyFoods(Foods food) {
		System.out.println(Foods.FRUITS.NAME);
		switch (food) {
			case MUSHROOM:
				System.out.println(Foods.MUSHROOM.getName());
				break;
			case VEGITABLE:
				System.out.println(Foods.VEGITABLE.getName());
				break;
			case FRUITS:
				System.out.println(Foods.FRUITS.getName());
				break;
			default:
				System.out.println("は?");
		}
	}
}
