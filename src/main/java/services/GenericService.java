package services;

import criteria.GenericCriteria;
import lombok.NonNull;
import vo.GenericVO;
import vo.response.Data;
import vo.response.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface GenericService<
        Vo extends GenericVO,
        C extends GenericCriteria,
        ID extends Serializable> {

    ResponseEntity<Data<Vo>> findById(@NonNull ID id);

    ResponseEntity<Data<List<Vo>>> findAll(@NonNull C criteria);
}
