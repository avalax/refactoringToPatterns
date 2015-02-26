package session.ten.application;

import org.junit.Before;
import org.junit.Test;
import session.ten.domain.Ingredient;
import session.ten.domain.Meal;
import session.ten.domain.Nutriment;
import session.ten.domain.NutrimentRepository;
import session.ten.port.adapter.FakeNutrimentRepository;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MealManagerApplicationServiceTest {
    private NutrimentRepository nutrimentRepository;
    private MealManagerApplicationService mealManagerApplicationService;

    private int kcalOfNutriments() {
        int kcal = 0;
        for (Nutriment nutriment : nutrimentRepository.allNutriments()) {
            kcal += nutriment.getKcal();
        }
        return kcal;
    }

    private String nameOfFirstNutriments() {
        return nutrimentRepository.allNutriments().get(0).getName();
    }

    @Before
    public void setUp() throws Exception {
        nutrimentRepository = new FakeNutrimentRepository();
        mealManagerApplicationService = new MealManagerApplicationService(nutrimentRepository);
    }

    @Test
    public void testAddMeal() throws Exception {
        Meal meal = new Meal("Wiener Schnizel");
        meal.addNutriment(new Ingredient("Pommes", 500));
        meal.addNutriment(new Ingredient("Schnitzel", 400));
        meal.addNutriment(new Ingredient("Majo", 80));

        mealManagerApplicationService.addNutriment(meal);

        assertThat(kcalOfNutriments(), equalTo(980));
        assertThat(nameOfFirstNutriments(), equalTo("Wiener Schnizel"));
    }

    @Test
    public void testAddNutriment() throws Exception {
        Nutriment nutriment = new Ingredient("Keks", 150);

        mealManagerApplicationService.addNutriment(nutriment);

        assertThat(kcalOfNutriments(), equalTo(150));
    }
}