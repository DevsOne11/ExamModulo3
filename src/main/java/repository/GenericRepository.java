package repository;


import criteria.GenericCriteria;
import domains.BaseEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface GenericRepository<
        E extends BaseEntity,
        C extends GenericCriteria,
        ID extends Serializable> extends Repository {

    /**
     *
     * @param id entity id
     * @return Optional of Entity
     */
    Optional<E> findById(ID id);

    Optional<List<E>> findAll(C criteria);
}
