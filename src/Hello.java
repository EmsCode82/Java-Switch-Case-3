
public class Hello {
	public static void main(String[] args) {
		String name = "Editor";

		switch (name.toLowerCase()) {
		case "author":
			System.out.println("Eric");
			break;
		case "team":
			System.out.println("Team Java");
			break;
		case "editor":
			System.out.println("God");
			break;
		default:
			System.out.println("Invalid entry");
			break;

		}

	}
}
