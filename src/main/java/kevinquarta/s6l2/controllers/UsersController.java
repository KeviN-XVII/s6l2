package kevinquarta.s6l2.controllers;


import kevinquarta.s6l2.entities.User;
import kevinquarta.s6l2.payloads.UserPayload;
import kevinquarta.s6l2.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }


//1 GET /users ritorna lista di autori
    @GetMapping
    public List<User> findAll() {
        return usersService.findAll();
    }


//2 GET /users/123 ritorna una singolo autore
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable long userId) {
        return usersService.getUserById(userId);
    }

//3 POST /users crea un nuovo autore
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody UserPayload payload) {
        return this.usersService.saveUser(payload);
    }

//4 PUT /users/123 modifica lo specifico autore
    @PutMapping("/{userId}")
    public User  updateUser(@PathVariable long userId, @RequestBody UserPayload payload) {
        return this.usersService.updateUser(userId, payload);
    }

//5 DELETE /users/123 elimina uno specifico autore
    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable long userId) {
        this.usersService.deleteUser(userId);
    }

}
