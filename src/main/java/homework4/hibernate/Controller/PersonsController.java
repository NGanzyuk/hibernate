package homework4.hibernate.Controller;

import homework4.hibernate.Entity.Persons;
import homework4.hibernate.Service.PersonsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonsController {
    private final PersonsService personsService;

    public PersonsController(PersonsService personsService) {
        this.personsService = personsService;
    }

    @GetMapping("/persons/by-city")
    public List<Persons> getPersons(@RequestParam("City_Of_Living") String city) {
        return personsService.getPersonsByCity(city);
    }
}
