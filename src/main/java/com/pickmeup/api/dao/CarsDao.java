package com.pickmeup.api.dao;

import com.pickmeup.api.model.Cars;
import com.pickmeup.api.model.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.persistence.Entity;

import java.sql.Date;
import java.util.Map;


/**
 * Created by Govind on 12/22/2016.
 */


public class CarsDao {

    public Cars registerCar(Map <String,String> param)
    {
        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Cars car = new Cars();
        car.setCarMake(param.get("carMake"));
        car.setOccupancy(param.get("occupancy"));
        car.setCarID(Integer.parseInt(param.get("carId")));
        car.setUserId(Integer.parseInt(param.get("userId")));


        try
        {
            session.saveOrUpdate(car);
            session.getTransaction().commit();

        }
        catch(Exception ex)
        {
            session.getTransaction().rollback();
            throw ex;
        }
        finally
        {
            session.close();
        }

        return car;
    }


}
