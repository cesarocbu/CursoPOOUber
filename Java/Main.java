package Java;
class Main {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		Car car = new Car("ASK2232", new Account("Cesar Ochoa", "AAS191"));
		car.passenger = 3;
		car.printCarData();

		Car car2 = new Car("SDS3838", new Account("Miguel Sosol", "232323"));
		car2.passenger = 4;
		car2.printCarData();

	}

}
