package Main;

import devices.*;

public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Mitsubishi", "Lancer VII", 2004,"GKE 122RW", 4, 2000, 15000);
        Phone phone1 = new Phone("Xiaomi", "Redmi", 2017, "Android 8.0");
        Animal animal1 = new Animal("Ryszard", "Kot", false, 4);
        Human human1 = new Human("Jan", "Nowak", "Nauczyciel", 43, 75, 3500, 800);
        Human human2 = new Human("Piotr", "King", "Spawacz", 35, 70, 6000, 50000);

        human1.Set_Animal(animal1);
        human2.Set_Phone((phone1));
        human1.Set_Car((car1));

        human1.Get_Cash();
        human1.Get_Animal();
        human1.Get_Car();
        human1.Get_Phone();

        human2.Get_Cash();
        human2.Get_Animal();
        human2.Get_Car();
        human2.Get_Phone();

        animal1.Sell(human2, human1, 200);
        animal1.Sell(human1, human2, 200);

        human1.Get_Cash();
        human1.Get_Animal();
        human2.Get_Cash();
        human2.Get_Animal();

        phone1.Sell(human2, human1, 1100);
        phone1.Sell(human2, human1, 900);

        human1.Get_Cash();
        human1.Get_Phone();
        human2.Get_Cash();
        human2.Get_Phone();

        car1.Sell(human1, human2, 10000);
        car1.Sell(human1, human2, 10000);

        human1.Get_Cash();
        human1.Get_Car();
        human2.Get_Cash();
        human2.Get_Car();
    }
}