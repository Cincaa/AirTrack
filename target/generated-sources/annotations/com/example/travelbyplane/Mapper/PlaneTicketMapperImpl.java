package com.example.travelbyplane.Mapper;

import com.example.travelbyplane.Dto.PlaneTicketDto;
import com.example.travelbyplane.Model.Airport;
import com.example.travelbyplane.Model.Client;
import com.example.travelbyplane.Model.Flight;
import com.example.travelbyplane.Model.PlaneTicket;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-04T23:02:57+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
@Component
public class PlaneTicketMapperImpl implements PlaneTicketMapper {

    @Override
    public PlaneTicketDto mapToDto(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }

        PlaneTicketDto planeTicketDto = new PlaneTicketDto();

        planeTicketDto.setFirstName( planeTicketClientFirstName( planeTicket ) );
        planeTicketDto.setLastName( planeTicketClientLastName( planeTicket ) );
        planeTicketDto.setPassportNo( planeTicketClientPassportNo( planeTicket ) );
        planeTicketDto.setDepartureDate( planeTicketFlightDepartureDate( planeTicket ) );
        planeTicketDto.setArrivalDate( planeTicketFlightArrivalDate( planeTicket ) );
        planeTicketDto.setDepartureTime( planeTicketFlightDepartureTime( planeTicket ) );
        planeTicketDto.setArrivalTime( planeTicketFlightArrivalTime( planeTicket ) );
        planeTicketDto.setDepartureAirport( planeTicketFlightDepartureAirportName( planeTicket ) );
        planeTicketDto.setArrivalAirport( planeTicketFlightArrivalAirportName( planeTicket ) );
        planeTicketDto.setId( planeTicket.getId() );
        planeTicketDto.setTravelClass( planeTicket.getTravelClass() );
        planeTicketDto.setPrice( planeTicket.getPrice() );

        return planeTicketDto;
    }

    @Override
    public PlaneTicket mapToEntity(PlaneTicketDto planeTicketDto) {
        if ( planeTicketDto == null ) {
            return null;
        }

        PlaneTicket planeTicket = new PlaneTicket();

        planeTicket.setClient( planeTicketDtoToClient( planeTicketDto ) );
        planeTicket.setFlight( planeTicketDtoToFlight( planeTicketDto ) );
        planeTicket.setId( planeTicketDto.getId() );
        planeTicket.setTravelClass( planeTicketDto.getTravelClass() );
        planeTicket.setPrice( planeTicketDto.getPrice() );

        return planeTicket;
    }

    private String planeTicketClientFirstName(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Client client = planeTicket.getClient();
        if ( client == null ) {
            return null;
        }
        String firstName = client.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String planeTicketClientLastName(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Client client = planeTicket.getClient();
        if ( client == null ) {
            return null;
        }
        String lastName = client.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String planeTicketClientPassportNo(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Client client = planeTicket.getClient();
        if ( client == null ) {
            return null;
        }
        String passportNo = client.getPassportNo();
        if ( passportNo == null ) {
            return null;
        }
        return passportNo;
    }

    private String planeTicketFlightDepartureDate(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Flight flight = planeTicket.getFlight();
        if ( flight == null ) {
            return null;
        }
        String departureDate = flight.getDepartureDate();
        if ( departureDate == null ) {
            return null;
        }
        return departureDate;
    }

    private String planeTicketFlightArrivalDate(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Flight flight = planeTicket.getFlight();
        if ( flight == null ) {
            return null;
        }
        String arrivalDate = flight.getArrivalDate();
        if ( arrivalDate == null ) {
            return null;
        }
        return arrivalDate;
    }

    private String planeTicketFlightDepartureTime(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Flight flight = planeTicket.getFlight();
        if ( flight == null ) {
            return null;
        }
        String departureTime = flight.getDepartureTime();
        if ( departureTime == null ) {
            return null;
        }
        return departureTime;
    }

    private String planeTicketFlightArrivalTime(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Flight flight = planeTicket.getFlight();
        if ( flight == null ) {
            return null;
        }
        String arrivalTime = flight.getArrivalTime();
        if ( arrivalTime == null ) {
            return null;
        }
        return arrivalTime;
    }

    private String planeTicketFlightDepartureAirportName(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Flight flight = planeTicket.getFlight();
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

    private String planeTicketFlightArrivalAirportName(PlaneTicket planeTicket) {
        if ( planeTicket == null ) {
            return null;
        }
        Flight flight = planeTicket.getFlight();
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

    protected Client planeTicketDtoToClient(PlaneTicketDto planeTicketDto) {
        if ( planeTicketDto == null ) {
            return null;
        }

        Client client = new Client();

        client.setFirstName( planeTicketDto.getFirstName() );
        client.setLastName( planeTicketDto.getLastName() );
        client.setPassportNo( planeTicketDto.getPassportNo() );

        return client;
    }

    protected Airport planeTicketDtoToAirport(PlaneTicketDto planeTicketDto) {
        if ( planeTicketDto == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setName( planeTicketDto.getDepartureAirport() );

        return airport;
    }

    protected Airport planeTicketDtoToAirport1(PlaneTicketDto planeTicketDto) {
        if ( planeTicketDto == null ) {
            return null;
        }

        Airport airport = new Airport();

        airport.setName( planeTicketDto.getArrivalAirport() );

        return airport;
    }

    protected Flight planeTicketDtoToFlight(PlaneTicketDto planeTicketDto) {
        if ( planeTicketDto == null ) {
            return null;
        }

        Flight flight = new Flight();

        flight.setDepartureAirport( planeTicketDtoToAirport( planeTicketDto ) );
        flight.setArrivalAirport( planeTicketDtoToAirport1( planeTicketDto ) );
        flight.setDepartureDate( planeTicketDto.getDepartureDate() );
        flight.setArrivalDate( planeTicketDto.getArrivalDate() );
        flight.setDepartureTime( planeTicketDto.getDepartureTime() );
        flight.setArrivalTime( planeTicketDto.getArrivalTime() );

        return flight;
    }
}
