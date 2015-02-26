package session.ten.application;

import session.ten.domain.Ingredient;
import session.ten.domain.Nutriment;
import session.ten.domain.NutrimentRepository;

import java.util.List;

public class MealManagerApplicationService {
    private NutrimentRepository nutrimentRepository;

    public MealManagerApplicationService(NutrimentRepository nutrimentRepository) {
        this.nutrimentRepository = nutrimentRepository;
    }

    public void addMeal(String name,List<Nutriment> nutriments) {
        Ingredient meal = new Ingredient(name, 0);
        for (Nutriment nutriment : nutriments) {
            meal.setKcal(meal.getKcal() + nutriment.getKcal());
        }
        addNutriment(meal);
    }

    public void addNutriment(Nutriment nutriment) {
        nutrimentRepository.save(nutriment);
    }

}
