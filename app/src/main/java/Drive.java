
public class Drive {

    private String time_from;
    private String time_to;
    private String from;
    private String destination;
    private String price;
    private String rd6;
    private String animal;


    public Drive(String time_from, String time_to, String from, String destination, String price, String rd6, String animal)
    {
        this.destination=destination;
        this.time_to=time_to;
        this.time_from=time_from;
        this.from=from;
        this.price=price;
        this.rd6=rd6;
        this.animal=animal;
    }

    public String get_time_from()
    {
        return this.time_from;
    }

    public String get_time_to()
    {
        return this.time_to;
    }

    public String get_from()
    {
        return this.from;
    }

    public String get_price()
    {
        return this.price;
    }

    public String get_rd6()
    {
        return this.rd6;
    }

    public String get_destination()
    {
        return this.destination;
    }

    public String get_animal()
    {
        return this.animal;
    }












}
