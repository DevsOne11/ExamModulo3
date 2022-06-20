package repository.auth;


import criteria.UserCriteria;
import domains.auth.User;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import repository.GenericCRUDRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UserRepository implements GenericCRUDRepository<User, UserCriteria, Long> {

    private static UserRepository instance;
    private static final List<User> users = load();


    private static List<User> load() {
        // TODO: 6/15/2022 load data from file here
        return new ArrayList<>();
    }


    @Override
    public void create(User entity) {
        entity.setId(System.currentTimeMillis());
        entity.setCreatedAt(LocalDateTime.now());
        users.add(entity);
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Optional<List<User>> findAll(UserCriteria criteria) {
        return Optional.of(users);
    }


    public static UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public Optional<User> findByUsername(String userName) {
        return users.stream()
                .filter(user -> user.getUserName().equalsIgnoreCase(userName))
                .findFirst();
    }
}
