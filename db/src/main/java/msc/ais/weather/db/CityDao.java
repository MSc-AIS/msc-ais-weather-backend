package msc.ais.weather.db;

import msc.ais.weather.model.db.City;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * @author Konstantinos Raptis [kraptis at unipi.gr] on 29/1/2021.
 */
public interface CityDao {

    int insertCity(City city);

    List<City> findByUserId(int id);

    List<City> findByUserTokenId(String tokenId);

    Optional<City> findByCityName(String name);

    OptionalInt findCityIdByNameOrAlias(String nameOrAlias);
}
