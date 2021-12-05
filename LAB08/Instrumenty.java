import java.time.LocalDate;
abstract class Instrument{
String producent;
LocalDate rokProdukcji;
public Instrument(String producent,LocalDate rokProdukcji)
{
    this.producent = producent;
    this.rokProdukcji = rokProdukcji;
}

public String getProducent()
{return producent;}

public LocalDate getrokProdukcji()
{return rokProdukcji;}

public abstract String dzwiek();

public boolean equals(Instrument other)
{
return producent.equals(other.producent) && rokProdukcji.equals(other.rokProdukcji);
}
public String toString()
{
    return "[producent: " + producent + ", rok produkcji: " + rokProdukcji + "]";
}
}

abstract class Flet extends Instrument
{
    public String dzwiek(){return " Flet ";};
    public Flet(String producent,LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }
        

}


abstract class Fortepian extends Instrument
{
    public String dzwiek(){return " Fortepian ";};
    public Fortepian(String producent,LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }
        

}

abstract class Skrzypce extends Instrument
{
    public String dzwiek(){return " Skrzypce ";};
    public Skrzypce(String producent,LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }
        

}