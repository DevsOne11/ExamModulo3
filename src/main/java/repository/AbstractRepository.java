package repository;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import mappers.BaseMapper;

public abstract class AbstractRepository<
        R extends Repository,
        M extends BaseMapper> {

    protected final R repository;
    protected final M mapper;
    protected final Gson gson;

    protected AbstractRepository(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .setDateFormat("YYYY-MM-dd HH:mm:ss")
                .create();
    }
}
