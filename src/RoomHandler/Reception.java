package RoomHandler;

import Room.Room;
import java.util.ArrayList;


public class Reception {
    ArrayList<Room> totalRooms;
    ArrayList<Booking> listOfBooking;

    public Reception(){
        this.totalRooms = new ArrayList<>();
        this.listOfBooking = new ArrayList<>();
    }

    public boolean checkAvailability(BookingQuery form){
        boolean isValidate = true;
        int amountOfRooms = 0;
        for ( Room room : totalRooms
             ) {
            if(form.characteristics.validateForm(room)) {
                amountOfRooms += 1;
            }
        }

        for (Booking booking: listOfBooking
             ) {
            if(booking.bookingPeriod.intersects(form.bookingPeriod) && form.characteristics.validateForm(booking.characteristic)){
                amountOfRooms -= 1;
            }
        }


        /*for (Room room : totalRooms
             ) {
            if(room.characteristic == form.characteristic)
                amountOfRooms += 1;
        }

        for (Booking booking: listOfBooking
             ) {
            if(booking.bookingPeriod.equals(form.searchPeriod)){
                amountOfRooms -= 1;
            }
        }*/

        if(amountOfRooms < form.amount){
            isValidate = false;
        }
        return isValidate;
    }



    public void reserve(BookingQuery form){
        /*if (checkAvailability(form)){
            Client customer = new Client("Vasya", "9379992");
            listOfBooking.add(new Booking(form.characteristic,form.searchPeriod,customer));
        }*/
    }

}

