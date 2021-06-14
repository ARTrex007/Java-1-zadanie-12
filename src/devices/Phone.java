package devices;

import Main.Human;
import Main.Salleable;

public class Phone extends Device implements Salleable
{
    public String sys_oper;
    private boolean on = false;

    private int id;
    public static int counter=0;

    public Phone(String producer, String model, int year_of_production, String sys_oper)
    {
        super(producer, model, year_of_production);
        this.sys_oper = sys_oper;

        System.out.println("Utworzono obiekt PHONE numer: " + counter);
        id = counter;
        counter++;
    }

    @Override
    public String toString()
    {
        return super.toString()+" "+sys_oper;
    }

    @Override
    public void Turn_On()
    {
        if(on != true)
        {
            on = true;
            System.out.println("Telefon został włączony");
        }
        else
            System.out.println("Telefon już jest włączony!");
    }

    @Override
    public void Sell(Human seller, Human buyer, double price)
    {
        if(seller.phone != null &&  seller.phone.id == id)
        {
            if (buyer.cash > price)
            {
                System.out.println("Telefon \"" + seller.phone.model + "\" został odkupiony od " + seller.imie + " przez " + buyer.imie + " za " + price);
                buyer.phone = seller.phone;
                seller.phone = null;
                buyer.cash -= price;
                seller.cash += price;
            } else
                System.out.println("Kupujący nie ma wystarczająco dużo gotówki!");
        }
        else
            System.out.println("Sprzedający nie posiada tego telefonu!");
    }
}
