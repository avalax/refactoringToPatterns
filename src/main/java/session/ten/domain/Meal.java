package session.ten.domain;

import java.util.ArrayList;

public class Meal extends AbstractNutriment {
	private String name = null;

	public Meal() {
		 this("new meal");
	}

	public Meal(String name) {
        nutriments = new ArrayList<Nutriment>();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}