package peteDevillish.RidesharingDemo.Users;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping({"/users"})
public class UsersController {

    private List<User> users = new ArrayList<>();
    public UsersController() {
        this.users.add(new User("Żywiec", "Bielsko-Biała"));
        this.users.add(new User("Andrychów", "Kraków"));
        this.users.add(new Driver("Jabłonka", "Bielsko-Białą", "Bicycle", 1));


    }
    @RequestMapping(value = "/all", method = {RequestMethod.GET})
    public List<User> getAll(){
        return this.users;
    }

    @RequestMapping(value ="/from/{from}", method = {RequestMethod.GET})
    public List<User> getSameFrom(@PathVariable String from){
        return users.stream().filter(x -> x.getFrom().equals(from)).collect(Collectors.toList());

    }

    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public List<User> create(@RequestBody User user){
        this.users.add(user);
        return this.users;
    }

    }

