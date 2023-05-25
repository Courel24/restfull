package com.example.demo.controller.dto;

import com.example.demo.entity.Booking;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private int id;
    private int client_id;
    private int pet_id;
    private String date;

    public static BookingDTO fromModel(Booking booking){
        return new BookingDTO(booking.getId(), booking.getClient().getDocument(), booking.getPet().getId(), booking.getDate());
    }
}
