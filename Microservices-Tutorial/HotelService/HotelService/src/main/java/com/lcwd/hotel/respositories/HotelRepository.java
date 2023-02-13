package com.lcwd.hotel.respositories;

import com.lcwd.hotel.entites.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String> {
}
