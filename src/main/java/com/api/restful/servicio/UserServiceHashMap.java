package com.api.restful.servicio;

import com.api.restful.data.User;
import com.api.restful.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class UserServiceHashMap implements UserService
{
    private final HashMap<String,User> userHashMap = new HashMap<>();

    @Override
    public User create(User user) {

        long id = userHashMap.size()+1;
       userHashMap.get (user);
        return user;
    }

    @Override
    public User findById(String id) {
        return userHashMap.getOrDefault(id, null);
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public boolean deleteById(String id)  {
        if(userHashMap.containsKey(id))
        {
            userHashMap.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public User updateGrade(User user, String userId) {
        return null;
    }




}
