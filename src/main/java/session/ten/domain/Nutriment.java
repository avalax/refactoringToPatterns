package session.ten.domain;

import java.io.Serializable;

public interface Nutriment extends Serializable {
    /**
     * primary key of the record
     * @return The primary key
     */
    public Long getId();

    /**
     * Gets or sets the kcal.
     *
     * @return The kcal.
     */
    public int getKcal();

    /**
     * Gets or sets the fat.
     *
     * @return The fat.
     */
    public double getFat();

    /**
     * Gets or sets the carbohydrates.
     *
     * @return The carbohydrates.
     */
    public double getCarbohydrates();

    /**
     * Gets or sets the protein.
     *
     * @return The protein.
     */
    public double getProtein();

    /**
     * Gets or sets the salt.
     *
     * @return The salt.
     */
    public double getSalt();

    public String getName();
}