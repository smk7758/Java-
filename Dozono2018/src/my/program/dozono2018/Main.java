package my.program.dozono2018;

public class Main {
	private String name = "Dozono";
	int number = 10;

	public static void main(String[] args) {
		new Main().method();
	}

	public void method() {
		System.out.println(getName());

		if (isTen()) {
			System.out.println("The number is 10!");
		} else {
			System.out.println("The number is NOT 10...");
		}
	}

	public boolean isTen() {
		switch (name) {
			case "Dozono":
				return true;
			case "Yamada":
				return false;
			default:
				return false;
		}
	}

	public String getName() {
		return name;
	}

	// public ... 他のパッケージからでも見える
	// private ... 存在するクラスのなかからでしか見えない(他のクラスから見られない)
	// protected ... 同じパッケージ内のみから見える
}
