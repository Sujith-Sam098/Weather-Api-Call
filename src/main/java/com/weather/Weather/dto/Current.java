package com.weather.Weather.dto;

public record Current(String time,
                      int interval,
                      double temperature) {
}
