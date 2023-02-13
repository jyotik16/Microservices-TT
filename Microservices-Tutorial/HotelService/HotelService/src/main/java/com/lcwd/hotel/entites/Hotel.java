package com.lcwd.hotel.entites;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("hotels")
public class Hotel {

    @Id
    private  String id;
    private  String name;
    private  String location;
    private  String about;


}
