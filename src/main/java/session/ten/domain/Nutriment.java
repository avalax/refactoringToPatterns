package session.ten.domain;

import java.io.Serializable;

public interface Nutriment extends Serializable {

    public Long getId();

    public int getKcal();

    public double getFat();

    public double getCarbohydrates();

    public double getProtein();

    public double getSalt();

    public String getName();
}