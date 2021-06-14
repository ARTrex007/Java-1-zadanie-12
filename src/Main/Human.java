package Main;

import devices.*;
import java.time.LocalDateTime;

public class Human
{

    public String imie, nazwisko, zawod;
    public int wiek;
    public double masa;
    public double cash;

    public Animal animal = null;
    public Phone phone = null;
    public Car car = null;

    private double salary;

    public static int counter=0;

    public Human(String imie, String nazwisko, String zawod, int wiek, double masa, double salary, double cash)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zawod = zawod;
        this.wiek = wiek;
        this.masa = masa;
        this.salary = salary;
        this.cash = cash;

        System.out.println("Utworzono obiekt HUMAN numer: " + counter);
        counter++;
    }

    //Get Set cash
    void Get_Cash()
    {
        System.out.println(imie + " " + nazwisko + " ma gotówki: " + cash);
    }
    void Set_Cash(double cash)
    {
            System.out.println("Nowa ilość gotówki: " + cash);
            this.cash = cash;
    }

    //Get Set Car
    void Get_Car()
    {
        if(car != null)
            System.out.println(imie + " " + nazwisko + " posiada samochód: " + car.model);
        else
            System.out.println(imie + " " + nazwisko + " nie posiada samochodu!");
    }
    void Set_Car(Car samochod)
    {
        System.out.println(imie + " " + nazwisko + " Ma nowy samochód: " + samochod.model);
        this.car = samochod;
    }

    //Get Set Animal
    void Get_Animal()
    {
        if(animal != null)
            System.out.println(imie + " " + nazwisko + " posiada zwierzę: " + animal.imie);
        else
            System.out.println(imie + " " + nazwisko + " nie posiada zwierzęcia!");
    }
    void Set_Animal(Animal animal)
    {
        System.out.println(imie + " " + nazwisko + " ma nowe zwierzę: " + animal.imie);
        this.animal = animal;
    }

    //Get Set Phone
    void Get_Phone()
    {
        if(phone != null)
            System.out.println(imie + " " + nazwisko + " posiada telefon: " + phone.model);
        else
            System.out.println(imie + " " + nazwisko + " nie posiada telefonu!");
    }
    void Set_Phone(Phone phone)
    {
        System.out.println(imie + " " + nazwisko + " ma nowy telefon: " + phone.model);
        this.phone = phone;
    }
}
