package com.kelompok3.rentcar.providers;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kelompok3.rentcar.models.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserProvider {
    static ObjectMapper mapper = new ObjectMapper();
    
    
    protected static List<User> getDataUser(){
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        String currentDir = s+"/src/main/java/com/kelompok3/rentcar/providers/";
        File dataUserJson = new File(currentDir+"data/user.json");
        List<User> data = new ArrayList<>();
        try {
            List<? extends Map<String, Object>> dataUser = mapper.readValue(dataUserJson, new TypeReference<List<? extends Map<String, Object>>>(){});
            for(int i = 0; i < dataUser.size(); i++){
                User user = new User(
                        (int) dataUser.get(i).get("id"), 
                        (String) dataUser.get(i).get("nama"), 
                        (String) dataUser.get(i).get("username"),
                        (String) dataUser.get(i).get("password"),
                        (int) dataUser.get(i).get("type")
                );
                data.add(user);
            }
        } catch (IOException ex) {
            Logger.getLogger(UserProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    protected static User getDataUserById(int id){
        List<User> dataUser = getDataUser();
        Object result = new Object();
        for(int i = 0; i < dataUser.size(); i++){
            User user = dataUser.get(i);
            if(user.id() == id){
                result = user;
            }
        }
        return (User) result;
    }

    protected static User getDataUserByUsername(String userName){
        List<User> dataUser = getDataUser();
        User result = new User();
        for(int i = 0; i < dataUser.size(); i++){
            User user = dataUser.get(i);
            if(user.username().equals(userName)){
                result = user;
            }
        }
        return result;
    }
}
