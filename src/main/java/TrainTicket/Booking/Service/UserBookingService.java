package TrainTicket.Booking.Service;

import TrainTicket.Booking.entities.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private  ObjectMapper objectMapper = new ObjectMapper();
//    Jackson library ka core class hai jo JSON aur Java objects ke beech conversion karta hai

    private static final String USERS_PATH="...\\\\localDb\\\\users.json";



    public UserBookingService(User user1)throws IOException // constructor
    {
        this.user = user1;
        File user = new File(USERS_PATH);
        userList= objectMapper.readValue(user, new TypeReference<List<User>>() {});
         //Type reference :- hume single obj banana nhi Hume List of user chahiye toh Jackson Helper class mein List? kiska nhi pata tohhum runtime mein user daal rhe hai jab Desriealize ho rha hai






    }


}
