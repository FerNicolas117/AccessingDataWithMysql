package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

/**
 * <Integter> especifica que la clave primaria de la entidad <User> es de tipo
 * Integer
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
