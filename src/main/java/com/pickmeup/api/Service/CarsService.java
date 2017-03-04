package com.pickmeup.api.Service;

import com.pickmeup.api.dao.CarsDao;
import com.pickmeup.api.model.Cars;
import java.util.Map;



/**
 * Created by Govind on 3/3/2017.
 */
public class CarsService {

    /**
     * Created by Renz on 3/2/17.
     */

        CarsDao dao= new CarsDao();

        public Cars registerCar(Map<String, String> params)

        {
            if (params == null || params.isEmpty())
            {
                throw new IllegalArgumentException();
            }

            int carId = (int) (Math.random() * 1000);

            params.put("carId", String.valueOf(carId));
            Cars car = dao.registerCar(params);

            return car;
        }
    }

