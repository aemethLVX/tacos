package tacos.models;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import static jakarta.persistence.GenerationType.IDENTITY;

import lombok.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "ingredients")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    @NonNull
    private String name;

    @Enumerated(EnumType.STRING)
    @NonNull
    private Type type;

    public Ingredient() {

    }

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
