import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Manager{
    
    private List<Accommodation> accommodations;

    public Manager() {
        this.accommodations = new ArrayList<Accommodation>();
    }

    public void addAccom(Accommodation accommodation) {
        accommodations.add(accommodation);
    }

    public void addAvail(int id, Date dateTo, Date datefrom){ //String renter??) {
       for (Accommodation accommodation:accommodations) {
            if (accommodation.getId()==id){ 
                accommodation.setDates(dateTo, datefrom);
                break;
            }
       }
      
    }

    public void showAccomReservs() {
        for (Accommodation accommodation:accommodations) {
            accommodation.showReservations();
        }
    }




}