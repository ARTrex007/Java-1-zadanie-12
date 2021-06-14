package devices;

public abstract class Device
{
    public final String producer, model;
    public final int year_of_production;

    public Device(String producer, String model, int year_of_production)
    {
        this.producer = producer;
        this.model = model;
        this.year_of_production = year_of_production;
    }

    public String toString()
    {
        return producer+" "+model+" "+year_of_production;
    }

    public abstract void Turn_On();
}
