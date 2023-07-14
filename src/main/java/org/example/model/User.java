package org.example.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private int age;
    private Passport passport;

}
