package com.canozyigit.springdatajpaprojections.projection;


import org.springframework.beans.factory.annotation.Value;

public interface PersonView {
    String getFirstName();//Closed Projections

    String getLastName();//Closed Projections

    AddressView getAddress();//Closed Projections

    @Value("#{target.firstName + ' ' + target.lastName}")//Open Projections
    String getFullName();
}
