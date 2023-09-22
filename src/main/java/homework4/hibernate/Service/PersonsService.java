package homework4.hibernate.Service;

import homework4.hibernate.Entity.Persons;
import homework4.hibernate.Repository.PersonsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {
    private final PersonsRepository personsRepository;

    public PersonsService(PersonsRepository personsRepository) {
        this.personsRepository = personsRepository;
    }

    public List<Persons> getPersonsByCity(String city) {
        return personsRepository.getPersonsByCity(city);
    }

    public List<Persons> getPersonsByAge(int Age) {
        return personsRepository.getPersonsByAge(Age);
    }

    public List<Persons> getPersonsByNameSurname(String Name, String Surname) {
        return personsRepository.getPersonsByNameSurname(Name, Surname);
    }
}