package constructor_project.constructor_default;

public class ConstructorDefault {

	int productId;
	String productName;
	int productQuantity;

	public ConstructorDefault() {
		System.out.println("productId : " + productId);
		System.out.println("productName : " + productName);
		System.out.println("productQuantity : " + productQuantity);

		System.out.println("This is zero argumented constructor.");
	}

	// constructor with fields.
	public ConstructorDefault(int productId, String productName, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}

	// method
	public static int ConstructorDefault() {
		System.out.println("This is zero argumented method.");
		return 0;
	}

	public ConstructorDefault(int x) {
		ConstructorDefault cd = new ConstructorDefault();
		cd.display();
		System.out.println("This is one argumented constructor with value : " + x);
	}

	public ConstructorDefault(String message) {
		System.out.println("This is String argumented constructor with message : " + message);
	}

	public ConstructorDefault(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two number is : " + sum);
	}

	public void display() {
		System.out.println("Hello, Iam from ConstructorDefault-> display() method.....");
	}

	public static void main(String[] args) {

		// first creating the objects for each constructor of class.
		// just creating an instance of class.
		new ConstructorDefault();

		new ConstructorDefault(879645, "Ram box", 13);

		new ConstructorDefault(56);
		new ConstructorDefault("Hello");
		new ConstructorDefault("Hiii");
		new ConstructorDefault(40, 100);

		ConstructorDefault cd = new ConstructorDefault();
		cd.display();

//		cd.ConstructorDefault();

	}
}
