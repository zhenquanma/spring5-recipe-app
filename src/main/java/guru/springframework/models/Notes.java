package guru.springframework.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes extends BaseEntity {

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
