package repository;


import criteria.GenericCriteria;
import domains.BaseEntity;

import java.io.Serializable;

public interface GenericCRUDRepository<
        E extends BaseEntity,
        C extends GenericCriteria,
        ID extends Serializable
        > extends GenericRepository<E, C, ID> {

    void create(E entity);

    void update(E entity);

    void deleteByID(ID id);
}
