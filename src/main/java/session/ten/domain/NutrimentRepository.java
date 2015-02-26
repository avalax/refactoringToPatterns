package session.ten.domain;


import java.util.List;

public interface NutrimentRepository {
    void save(Nutriment nutriment);

    public List<Nutriment> allNutriments();
}
