package guru.springframework.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category extends BaseEntity {

    private String description;

    @ManyToMany(mappedBy = "categories") //on the join table from the other side property
    private Set<Recipe> recipes = new HashSet<>();

}
