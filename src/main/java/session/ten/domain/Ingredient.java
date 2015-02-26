package session.ten.domain;

public class Ingredient implements Nutriment {
	private Long id;
    private double gramm;
	private int kcal;
	private double fat;
	private double carbohydrates;
	private double protein;
	private double salt;
	private String name;

	public Ingredient(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
		this.gramm = 100;
		this.fat = 0;
		this.carbohydrates = 0;
		this.protein = 0;
		this.salt = 0;
	}

	public Ingredient(String name, int kcal, double gramm, double fat, double carbohydrates, double protein, double salt) {
		this(name, kcal);
        this.gramm = gramm;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
		this.protein = protein;
		this.salt = salt;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

    @Override
	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

    @Override
	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

    @Override
	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getSalt() {
		return salt;
	}

	public void setSalt(double salt) {
		this.salt = salt;
	}

    @Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGramm() {
		return gramm;
	}

	public void setGramm(double gramm) {
		this.gramm = gramm;
	}
}
