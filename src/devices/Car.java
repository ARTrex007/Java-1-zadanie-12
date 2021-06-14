package devices;

import Main.Human;
import Main.Salleable;

public class Car extends Device implements Salleable
{
    public enum marki
    {
        Ford, Mitsubishi, Opel, Peugeot
    }
    public String rejestracja;
    public int ilosc_drzwi, pojemnosc;
    public double wartosc;
    private boolean on;

    private int id;
    public static int counter=0;

    public Car(String producer, String model, int year_of_production,String rejestracja, int ilosc_drzwi, int pojemnosc, double wartosc)
    {
        super(producer, model, year_of_production);
        this.rejestracja = rejestracja;
        this.ilosc_drzwi = ilosc_drzwi;
        this.pojemnosc = pojemnosc;
        this.wartosc = wartosc;

        System.out.println("Utworzono obiekt CAR numer: " + counter);
        id = counter;
        counter++;
    }

    @Override
    public String toString()
    {
        return super.toString()+" "+rejestracja+" "+ilosc_drzwi+" "+pojemnosc+" "+wartosc;

    }

    @Override
    public void Turn_On()
    {
        if(on != true)
        {
            on = true;
            System.out.println("Silnik uruchomiony");
        }
        else
            System.out.println("Silnik już chodzi!");
    }

    @Override
    public void Sell(Human seller, Human buyer, double price)
    {
        if(seller.car != null && seller.car.id == id)
        {
            if (buyer.cash > price)
            {
                System.out.println("Samochód \"" + seller.car.model + "\" został odkupiony od " + seller.imie + " przez " + buyer.imie + " za " + price);
                buyer.car = seller.car;
                seller.car = null;
                buyer.cash -= price;
                seller.cash += price;
            } else
                System.out.println("Kupujący nie ma wystarczająco dużo gotówki!");
        }
        else
            System.out.println("Sprzedający nie posiada tego samochodu!");
    }

    void Czy_Marka(marki f)
    {
        switch(f)
        {
            case Ford:
            {
                if(this.producer == "Ford")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Mitsubishi:
            {
                if(this.producer == "Mitsubishi")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Opel:
            {
                if(this.producer == "Opel")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            case Peugeot:
            {
                if(this.producer == "Peugeot")
                    System.out.println("Tak, podany samochód to " + f);
                else
                    System.out.println("Nie, podany samochód to nie " + f);
                break;
            }

            default:
                {
                System.out.println("Nie ma takiej marki w bazie");
                break;
            }
        }
    }
}
