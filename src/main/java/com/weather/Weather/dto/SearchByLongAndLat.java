package com.weather.Weather.dto;

public record SearchByLongAndLat(double latitude,
                                 double longitude,
                                 double generationtimeMs,
                                 int utcOffsetSeconds,
                                 String timezone,
                                 String timezoneAbbreviation,
                                 double elevation,
                                 CurrentUnits currentUnits,
                                 Current current) {
}
