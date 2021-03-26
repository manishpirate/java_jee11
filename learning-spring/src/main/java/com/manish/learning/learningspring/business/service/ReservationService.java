package com.manish.learning.learningspring.business.service;

import com.manish.learning.learningspring.business.domain.RoomReservation;
import com.manish.learning.learningspring.data.entity.Guest;
import com.manish.learning.learningspring.data.entity.Reservation;
import com.manish.learning.learningspring.data.entity.Room;
import com.manish.learning.learningspring.data.repository.GuestRepository;
import com.manish.learning.learningspring.data.repository.ReservationRepository;
import com.manish.learning.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {

    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationsForDate(Date date){
        Iterable<Room> rooms=this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getRoomId());
            roomReservation.setRoomName(room.getRoomName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getRoomId(), roomReservation);
        });
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach( reservation -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomId());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation.getGuestId()).get();
            roomReservation.setFirstName(guest.getFirstName());
            roomReservation.setLastName(guest.getLastName());
            roomReservation.setGuestId(guest.getGuest_id());
        });
        List<RoomReservation> roomReservations = new ArrayList<>();
        for(Long id : roomReservationMap.keySet()){
            roomReservations.add(roomReservationMap.get(id));
        }
        return roomReservations;
    }

    public List<Guest> getHotelsGuests(){
        Iterable<Guest> guests = this.guestRepository.findAll();
        List<Guest> guestList = new ArrayList<>();
        guests.forEach(guest -> guestList.add(guest));
        guestList.sort(new Comparator<Guest>() {
            @Override
            public int compare(Guest o1, Guest o2) {
                if(o1.getLastName().equals(o2.getLastName())){
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }else{
                    return o1.getLastName().compareTo(o2.getLastName());
                }
            }
        });
        return guestList;
    }
}
