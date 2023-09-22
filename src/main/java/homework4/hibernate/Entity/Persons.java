package homework4.hibernate.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Persons")
@NoArgsConstructor
@AllArgsConstructor
public class Persons {
    @EmbeddedId
    private PersonsPK personPrimaryKey;

    @Column(nullable = false)
    private String Phone_Number;

    @Column(nullable = false)
    private String City_Of_Living;

}
