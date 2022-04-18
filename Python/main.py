from car import Car

if __name__ == "__main__":
    print("Hola mundo!")
    car = Car()
    car.license = "LSK9292"
    car.driver = "Julio Herrera"
    print(vars(car))

    car2 = Car()
    car2.license = "LS23392"
    car2.driver = "Julio Jiloanes"
    print(vars(car2))