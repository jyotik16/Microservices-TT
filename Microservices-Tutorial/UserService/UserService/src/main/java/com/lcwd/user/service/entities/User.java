package com.lcwd.user.service.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("micro_users")
public class User {

    @Id
    private String userId;

    private String name;

    private String email;

    private String about;

    private List<Rating> ratings=new ArrayList<>();


}
