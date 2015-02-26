package session.ten.application;

import session.ten.domain.Nutriment;
import session.ten.domain.NutrimentRepository;

public class MealManagerApplicationService {
    private NutrimentRepository nutrimentRepository;

    public MealManagerApplicationService(NutrimentRepository nutrimentRepository) {
        this.nutrimentRepository = nutrimentRepository;
    }

    public void addNutriment(Nutriment nutriment) {
        nutrimentRepository.save(nutriment);
    }

}
