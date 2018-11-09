package File.pr;

public class Hima {

	public static void main(String[] args) {
		new Hima().classifyFoods(Foods.FRUIT);
	}

	enum Foods {
		MASHROOM, VEGITABLE, FRUIT;
	}

	public void classifyFoods(Foods food) {
		switch (food) {
			case MASHROOM:
				System.out.println("キノコ");
				break;

			case VEGITABLE:
				System.out.println("野菜");
				break;

			case FRUIT:
				System.out.println("果実");
				break;
		}

	}
}
