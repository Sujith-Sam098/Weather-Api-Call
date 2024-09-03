package com.weather.Weather.controller;

import com.weather.Weather.dto.SearchByLongAndLat;
import com.weather.Weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class Controller {
    private final WeatherService weatherService;

    @GetMapping("/search")
    public ResponseEntity<SearchByLongAndLat> search(@RequestParam("lat")float lat, @RequestParam("long")float longi)
    {
        return ResponseEntity.ok(weatherService.longAndLat(lat,longi));
    }
}
