package services;

import criteria.GenericCriteria;
import lombok.NonNull;
import vo.BaseVO;
import vo.GenericVO;
import vo.response.Data;
import vo.response.ResponseEntity;

import java.io.Serializable;

public interface GenericCRUDService<
        VO extends GenericVO,
        CVO extends BaseVO,
        UVO extends GenericVO,
        C extends GenericCriteria,
        ID extends Serializable> extends GenericService<VO, C, ID> {
    ResponseEntity<Data<ID>> create(@NonNull CVO dto);

    ResponseEntity<Data<Void>> delete(@NonNull ID id);

    ResponseEntity<Data<Void>> update(@NonNull UVO dto);

}
