package msc.ais.weather.service;

import msc.ais.weather.model.db.City;

import java.util.Optional;

/**
 * @author Konstantinos Raptis [kraptis at unipi.gr] on 1/2/2021.
 */
public interface GeocodingService {

    Optional<City> getCityByName(String name);

    Optional<City> getCityByCurrentLocation();

    Optional<City> getCityByIP(String ip);

}
