package kevinquarta.s6l2.services;


import kevinquarta.s6l2.entities.User;
import kevinquarta.s6l2.exceptions.NotFoundException;
import kevinquarta.s6l2.payloads.UserPayload;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UsersService {

    private List<User> usersDB = new ArrayList<>();

    public List<User> findAll(){
        return this.usersDB;
    }

    public User saveUser(UserPayload payload){
        User newUser = new User(payload.getName(), payload.getSurname(), payload.getEmail(), payload.getDateOfBirth());
        this.usersDB.add(newUser);
        log.info("L'utente" + newUser.getName() + newUser.getSurname() + "è stato salvato correttamente!");
        return newUser;
    }

    public User getUserById(long userId){
        User found = null;
        for (User user : this.usersDB) {
            if (user.getId() == userId) found = user;
        }
        if (found == null) throw new NotFoundException(userId);
        return found;
    }

    public User updateUser(long userId, UserPayload payload){
        User found = null;
        for (User user : this.usersDB) {
            if (user.getId() == userId) {
                found = user;
                found.setName(payload.getName());
                found.setSurname(payload.getSurname());
                found.setEmail(payload.getEmail());
                found.setDateOfBirth(payload.getDateOfBirth());
            }
        }
        if (found == null) throw new NotFoundException(userId);
        return found;
    }

    public void deleteUser(long userId){
        User found = null;
        for (User user : this.usersDB) {
            if (user.getId() == userId) found = user;
        }
        if (found == null) throw new NotFoundException(userId);
        this.usersDB.remove(found);
    }
}
