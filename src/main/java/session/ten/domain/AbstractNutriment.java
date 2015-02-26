package session.ten.domain;

import java.util.ArrayList;

public abstract class AbstractNutriment implements Nutriment {

    protected Long id;
	protected ArrayList<Nutriment> nutriments;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

	public ArrayList<Nutriment> getNutriments() {
		return nutriments;
	}

	public void addNutriment(Nutriment nutriment) {
		nutriments.add(nutriment);
	}

	public void removeNutriment(Nutriment nutriment) {
		nutriments.remove(nutriment);
	}

	public void clear() {
		nutriments.clear();
	}

	public int size() {
		return nutriments.size();
	}

	public int getKcal() {
		int kcal = 0;
		for (Nutriment nutriment : nutriments) {
			kcal += nutriment.getKcal();
		}
		return kcal;
	}

	public double getFat() {
		double fat = 0;
		for (Nutriment nutriment : nutriments) {
			fat += nutriment.getFat();
		}
		return fat;
	}

	public double getCarbohydrates() {
		double carbohydrates = 0;
		for (Nutriment nutriment : nutriments) {
			carbohydrates += nutriment.getCarbohydrates();
		}
		return carbohydrates;
	}

	public double getProtein() {
		double protein = 0;
		for (Nutriment nutriment : nutriments) {
			protein += nutriment.getProtein();
		}
		return protein;
	}

	public double getSalt() {
		double salt = 0;
		for (Nutriment nutriment : nutriments) {
			salt += nutriment.getSalt();
		}
		return salt;
	}
}
