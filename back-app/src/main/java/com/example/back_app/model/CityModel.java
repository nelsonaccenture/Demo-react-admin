package com.example.back_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityModel {
    private int id;
    private String name;
    private double size;
}
