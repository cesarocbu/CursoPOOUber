package Java;
class Main {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		UberX uberX = new UberX("ASK2232", new Account("Cesar Ochoa", "AAS191"), "Toyota", "Corolla");
		uberX.passenger = 5;
		uberX.printCarData();

		// Car car2 = new Car("SDS3838", new Account("Miguel Sosol", "232323"));
		// car2.passenger = 4;
		// car2.printCarData();

	}

}
