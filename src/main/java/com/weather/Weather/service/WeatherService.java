package com.weather.Weather.service;

import com.weather.Weather.dto.SearchByLongAndLat;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class WeatherService {

    private final RestClient restClient;

    public SearchByLongAndLat longAndLat(float lat, float longi )
    {
        return restClient.get()
                .uri("/forecast?latitude={lat}&longitude={longi}&current=temperature",lat,longi)
                .retrieve()
                .body(SearchByLongAndLat.class);
    }
}
