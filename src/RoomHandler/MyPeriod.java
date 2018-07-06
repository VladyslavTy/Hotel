package RoomHandler;

import java.time.LocalDate;

public class MyPeriod {
    LocalDate startDate;
    LocalDate finishDate;

    public MyPeriod(LocalDate startDate, LocalDate finishDate){
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public boolean intersects(MyPeriod period){
        boolean isValidate = false;
        if(period.startDate.isAfter(this.startDate) && period.startDate.isBefore(this.finishDate) ||
                period.finishDate.isBefore(this.startDate) && period.finishDate.isAfter(this.finishDate)){
            isValidate = true;
        }

        return isValidate;
    }

}
