package com.example.travelbyplane.Mapper;

import com.example.travelbyplane.Dto.FlightDto;
import com.example.travelbyplane.Model.Airport;
import com.example.travelbyplane.Model.Flight;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T23:02:57+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class FlightMapperImpl implements FlightMapper {

    @Override
    public FlightDto mapToDto(Flight flight) {
        if ( flight == null ) {
            return null;
        }

        FlightDto flightDto = new FlightDto();

        flightDto.setDepartureAirport( flightDepartureAirportName( flight ) );
        flightDto.setArrivalAirport( flightArrivalAirportName( flight ) );
        flightDto.setId( flight.getId() );
        flightDto.setDepartureDate( flight.getDepartureDate() );
        flightDto.setArrivalDate( flight.getArrivalDate() );
        flightDto.setDepartureTime( flight.getDepartureTime() );
        flightDto.setArrivalTime( flight.getArrivalTime() );
        flightDto.setTime( flight.getTime() );

        return flightDto;
    }

    @Override
    public Flight mapToEntity(FlightDto flightDto) {
        if ( flightDto == null ) {
            return null;
        }

        Flight flight = new Flight();

        flight.setDepartureAirport( flightDtoToAirport( flightDto ) );
        flight.setArrivalAirport( flightDtoToAirport1( flightDto ) );
        flight.setId( flightDto.getId() );
        flight.setDepartureDate( flightDto.getDepartureDate() );
        flight.setArrivalDate( flightDto.getArrivalDate() );
        flight.setDepartureTime( flightDto.getDepartureTime() );
        flight.setArrivalTime( flightDto.getArrivalTime() );
        flight.setTime( flightDto.getTime() );

        return flight;
    }

    private String flightDepartureAirportName(Flight flight) {
        if ( flight == null ) {
            return null;
        }
        Airport departureAirport = flight.getDepartureAirport();
        if ( departureAirport == null ) {
            return null;
        }
        String name = departureAirport.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String flightArrivalAirportName(Flight flight) {
        if ( flight == null ) {
            return null;
        }
        Airport arrivalAirport = flight.getArrivalAirport();
        if ( arrivalAirport == null ) {
            return null;
        }
        String name = arrivalAirport.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    protected Airport flightDtoToAirport(FlightDto flightDto) {
        if ( flightDto == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setName( flightDto.getDepartureAirport() );

        return airport;
    }

    protected Airport flightDtoToAirport1(FlightDto flightDto) {
        if ( flightDto == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setName( flightDto.getArrivalAirport() );

        return airport;
    }
}
