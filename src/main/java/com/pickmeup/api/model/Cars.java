package com.pickmeup.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


/**
 * Created by Govind on 12/22/2016.
 */
@Entity
@Table(name="cars",schema ="public", catalog = "pickmeup")
public class Cars implements java.io.Serializable {

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public int getCarID() {
        return carId;
    }

    public void setCarID(int carId) {
        this.carId = carId;
    }

    public int getUserId() { return userId;}

    public void setUserId(int userId) { this.userId = userId;}


    @Column(name ="make")
    private String carMake;

    @Column(name ="occupancy")
    private String occupancy;

    @Id
    @Column(name ="car_id")
    private int carId;

    @Id
    @Column(name ="user_id")
    private int userId;
}