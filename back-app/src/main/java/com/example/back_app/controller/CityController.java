package com.example.back_app.controller;

import com.example.back_app.dataSource.CityDataSource;
import com.example.back_app.model.CityModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/city")
@RequiredArgsConstructor
@Tag(name = "City Resource")
@CrossOrigin(origins = "*")
public class CityController {

    @GetMapping
    @Operation(summary = "Get city list")
    public ResponseEntity<List<CityModel>> getCities() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Range", "city 0-10/10");
        headers.add("Access-Control-Expose-Headers", "Content-Range");
        return ResponseEntity.ok().headers(headers).body(CityDataSource.cities);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get city by id")
    public CityModel getCityById(@PathVariable int id) {
        return CityDataSource.cities.stream().filter(cityModel -> cityModel.getId() == id).findFirst().orElseThrow();
    }

    @PostMapping
    @Operation(summary = "Add new city")
    public CityModel addCity(@RequestBody CityModel cityModelRequest) {
        int id = CityDataSource.cities.get(CityDataSource.cities.size() - 1).getId();
        cityModelRequest.setId(id);
        CityDataSource.cities.add(cityModelRequest);
        return cityModelRequest;
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update city")
    public CityModel updateCity(@PathVariable int id, @RequestBody CityModel cityModelRequest) {
        cityModelRequest.setId(id);
        CityDataSource.cities.removeIf(cityModel -> cityModel.getId() == id);
        CityDataSource.cities.add(cityModelRequest);
        return cityModelRequest;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete city by id")
    public boolean deleteCityById(@PathVariable int id) {
        return CityDataSource.cities.removeIf(cityModel -> cityModel.getId() == id);
    }
}
