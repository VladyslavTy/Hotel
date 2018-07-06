package RoomHandler;

import java.time.LocalDate;

public class BookingPeriod {
    LocalDate startDate;
    LocalDate finishDate;

    public BookingPeriod(LocalDate startDate, LocalDate finishDate){
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public boolean intersects(BookingPeriod period){
        boolean isValidate = false;
        if(period.startDate.isAfter(this.startDate) && period.startDate.isBefore(this.finishDate) ||
                period.finishDate.isBefore(this.startDate) && period.finishDate.isAfter(this.finishDate)){
            isValidate = true;
        }

        return isValidate;
    }

}
