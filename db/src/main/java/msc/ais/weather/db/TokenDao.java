package msc.ais.weather.db;

import msc.ais.weather.model.db.Token;

import java.util.Optional;

/**
 * @author Konstantinos Raptis [kraptis at unipi.gr] on 29/1/2021.
 */
public interface TokenDao {

    int insertToken(Token token);

    Optional<Token> findTokenById(String id);

    Optional<Token> findTokenByUserCredentials(String email, char[] password);

    int deleteTokenById(String id);

}
