var car = new Car("WWE1212", new Account("Cesar Ochoa", "ISI112"));
car.passenger = 3;
car.printDataCar();

var uberX = new UberX("ALSJA", new Account("Alaks Oasas", "ALKJAA"), "Ford", "Mustang");
uberX.passenger = 3;
uberX.printDataCar();

var user = new User("Cesar Vargas", "HUAT1212", "transportesochoab@gmail.com", "*******");
console.log("***********User************");
user.printDataAccount();
console.log("***********User************");

var driver = new Driver("Jose Villegas", "ASAS9O2", "locochon@gmail.com", "*******");
console.log("***********Driver************");
driver.printDataAccount();
console.log("***********Driver************");



