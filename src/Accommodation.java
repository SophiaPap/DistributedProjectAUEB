import java.util.Date;
import java.util.List;

public class Accommodation
{
    private List<String> reservations;
    private int id;
    private String accName;
    private int guests;
    private String location;
    private int price;
    private int totalRating;
    private int noOfReviews;
    private String photo;
    private Date dtFrom;
    private Date dtTo;

    public Accommodation(String accName, int guests, String location, int price)
    {
        this.accName = accName;
        this.guests = guests;
        this.location = location;
        this.price = price;
        this.totalRating = 0;
        this.noOfReviews = 0;
    }
    public int getId(){
        return id;
    }
    public String getAccName()
    {
        return accName;
    }

    public int getGuests()
    {
        return guests;
    }

    public String getLocation()
    {
        return location;
    }

    public int getPrice()
    {
        return price;
    }

    public float getRating()
    {
        if (noOfReviews == 0)
            return 0;
        return (float)totalRating/(float)noOfReviews;
    }

    public int getNoOfReviews()
    {
        return noOfReviews;
    }

    public String getPhoto()
    {
        return photo;
    }

    public Date getDtFrom()
    {
        return dtFrom;
    }

    public Date getDtTo()
    {
        return dtTo;
    }

    public void setAccName(String accName)
    {
        this.accName = accName;
    }

    public void setGuests(int guests)
    {
        this.guests = guests;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void addRating(int stars)
    {
        this.totalRating += stars;
        this.noOfReviews++;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public void setDates(Date dtFrom, Date dtTo)
    {
        this.dtFrom = dtFrom;
        this.dtTo = dtTo;
    }

    //tha prepei na exw mia methodo pou tha kanei add reservation klhsh apo renter

    public void showReservations(){
        System.out.println("The "+accName+" is reserved in these days");
        for(String reservation : reservations)
            System.out.println(reservation);
    }


}