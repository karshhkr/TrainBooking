package TrainTicket.Booking.Service;

import TrainTicket.Booking.entities.User;
import TrainTicket.Booking.util.UserServiceUtil;
import com.fasterxml.jackson.core.type.TypeReference;//use tum isliye kar rahe ho kyuki JSON file mein ek single user nahi, balki users ki list hai.
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private  ObjectMapper objectMapper = new ObjectMapper();
//   Jackson library ka core class hai jo JSON aur Java objects ke beech conversion karta hai

    private static final String USERS_PATH="...\\\\localDb\\\\users.json";



    public UserBookingService(User user1)throws IOException // constructor
    {
        this.user = user1;
        File user = new File(USERS_PATH);
        userList= objectMapper.readValue(user, new TypeReference<List<User>>() {});
         //Type reference :- hume single obj banana nhi Hume List of user chahiye toh Jackson Helper class mein List? kiska nhi pata tohhum runtime mein user daal rhe hai jab Desriealize ho rha hai






    }
public Boolean loginUser(){
    Optional <User> foundUser=userList.stream().filter(user1 -> { //global User list  mein jo login kr raha hai user find kro
        return user1.getName().equals(user.getName())&& UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword()); //user ne jo naam diya hai wo filter hua same hai
    })

            return
}

}
