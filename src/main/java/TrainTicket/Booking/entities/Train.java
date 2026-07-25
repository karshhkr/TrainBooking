package TrainTicket.Booking.entities;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String trainNo;

    private String trainName;
    private String destination;
    private Date dateOfTravel;


    private List<List<Integer>>seats;
private Map<String, Time> stationTimes;

private List <String> stations;
 }
