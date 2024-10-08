package com.example.back_app.dataSource;

import com.example.back_app.model.CityModel;

import java.util.ArrayList;
import java.util.List;

public class CityDataSource {
    public static final List<CityModel> cities = new ArrayList<CityModel>() {{
        add(new CityModel(1, "New York", 789.4));
        add(new CityModel(2, "Los Angeles", 503.0));
        add(new CityModel(3, "Chicago", 227.3));
        add(new CityModel(4, "Houston", 599.6));
        add(new CityModel(5, "Phoenix", 517.6));
        add(new CityModel(6, "Philadelphia", 142.7));
        add(new CityModel(7, "San Antonio", 465.4));
        add(new CityModel(8, "San Diego", 372.4));
        add(new CityModel(9, "Dallas", 343.3));
        add(new CityModel(10, "San Jose", 180.5));
    }};
}
