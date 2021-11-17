package com.canozyigit.springdatajpaprojections.projection;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode
public class PersonDto {
    private String firstName;
    private String lastName;


}
