package com.example.travelbyplane.Mapper;

import com.example.travelbyplane.Dto.AirportDto;
import com.example.travelbyplane.Model.Address;
import com.example.travelbyplane.Model.Airport;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T23:02:57+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class AirportMapperImpl implements AirportMapper {

    @Override
    public AirportDto mapToDto(Airport airport) {
        if ( airport == null ) {
            return null;
        }

        AirportDto airportDto = new AirportDto();

        airportDto.setCountry( airportAddressCountry( airport ) );
        airportDto.setCity( airportAddressCity( airport ) );
        airportDto.setStreet( airportAddressStreet( airport ) );
        airportDto.setNumber( airportAddressNumber( airport ) );
        airportDto.setId( airport.getId() );
        airportDto.setName( airport.getName() );

        return airportDto;
    }

    @Override
    public Airport mapToEntity(AirportDto airportDto) {
        if ( airportDto == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setAddress( airportDtoToAddress( airportDto ) );
        airport.setId( airportDto.getId() );
        airport.setName( airportDto.getName() );

        return airport;
    }

    private String airportAddressCountry(Airport airport) {
        if ( airport == null ) {
            return null;
        }
        Address address = airport.getAddress();
        if ( address == null ) {
            return null;
        }
        String country = address.getCountry();
        if ( country == null ) {
            return null;
        }
        return country;
    }

    private String airportAddressCity(Airport airport) {
        if ( airport == null ) {
            return null;
        }
        Address address = airport.getAddress();
        if ( address == null ) {
            return null;
        }
        String city = address.getCity();
        if ( city == null ) {
            return null;
        }
        return city;
    }

    private String airportAddressStreet(Airport airport) {
        if ( airport == null ) {
            return null;
        }
        Address address = airport.getAddress();
        if ( address == null ) {
            return null;
        }
        String street = address.getStreet();
        if ( street == null ) {
            return null;
        }
        return street;
    }

    private String airportAddressNumber(Airport airport) {
        if ( airport == null ) {
            return null;
        }
        Address address = airport.getAddress();
        if ( address == null ) {
            return null;
        }
        String number = address.getNumber();
        if ( number == null ) {
            return null;
        }
        return number;
    }

    protected Address airportDtoToAddress(AirportDto airportDto) {
        if ( airportDto == null ) {
            return null;
        }

        Address address = new Address();

        address.setCountry( airportDto.getCountry() );
        address.setCity( airportDto.getCity() );
        address.setStreet( airportDto.getStreet() );
        address.setNumber( airportDto.getNumber() );

        return address;
    }
}
