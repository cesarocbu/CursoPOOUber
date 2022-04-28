package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printCarData(){
        System.out.println("Placa: " + license + ", Conductor: " + driver.name + " Passengers: " + passenger);
    }
}
