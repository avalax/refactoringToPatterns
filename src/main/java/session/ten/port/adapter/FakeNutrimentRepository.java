package session.ten.port.adapter;

import session.ten.domain.Nutriment;
import session.ten.domain.NutrimentRepository;

import java.util.ArrayList;
import java.util.List;

public class FakeNutrimentRepository implements NutrimentRepository {
    private final ArrayList<Nutriment> nutriments;

    public FakeNutrimentRepository() {
        nutriments = new ArrayList<Nutriment>();
    }

    @Override
    public void save(Nutriment nutriment) {
        nutriments.add(nutriment);
    }

    @Override
    public List<Nutriment> allNutriments() {
        return nutriments;
    }
}
