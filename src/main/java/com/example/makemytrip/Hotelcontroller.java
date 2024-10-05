package com.example.makemytrip;


import org.springframework.web.bind.annotation.*;

@RestController
public class Hotelcontroller {

    @GetMapping("/hotel")
    public String getData() {
        return "Please book hotel from MMT, 75% discount in North India";
    }

    @PutMapping("/hotel/{hotelID}")

    public String updateHotel(@PathVariable String hotelID, @RequestParam String status ) {
        return "Hotel with ID: " + hotelID + "is now" + status;

    }
}

