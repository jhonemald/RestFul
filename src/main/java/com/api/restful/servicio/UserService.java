package com.api.restful.servicio;

import com.api.restful.data.User;

import java.util.List;

public interface UserService
{
    User create (User user );

    User findById( String id );

    List<User> all();

   void deleteById(String id );

    User updateGrade( User user, String userId );


}
