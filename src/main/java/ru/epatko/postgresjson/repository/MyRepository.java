package ru.epatko.postgresjson.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.epatko.postgresjson.model.MyModel;

@Repository
public interface MyRepository extends CrudRepository<MyModel, Long> {
}
