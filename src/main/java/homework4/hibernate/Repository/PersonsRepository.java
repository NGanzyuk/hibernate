package homework4.hibernate.Repository;

import homework4.hibernate.Entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonsRepository {
    private final String script = read("src/main/resources/Select.sql");

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @PersistenceContext
    private EntityManager entityManager;

    public List<Persons> getPersonsByCity(String City_Of_Living) {
        var query = entityManager.createQuery(script, Persons.class);
        query.setParameter("City_Of_Living", City_Of_Living);
        return query.getResultList();
    }
}