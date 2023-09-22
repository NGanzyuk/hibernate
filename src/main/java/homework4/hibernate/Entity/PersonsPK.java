package homework4.hibernate.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class PersonsPK implements Serializable {
    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Surname;

    @Column(nullable = false)
    private int Age;
}
