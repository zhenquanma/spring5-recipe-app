package guru.springframework.converters;

import guru.springframework.commands.IngredientCommand;
import guru.springframework.models.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {
    @Override
    public IngredientCommand convert(Ingredient source) {
        return null;
    }
}
