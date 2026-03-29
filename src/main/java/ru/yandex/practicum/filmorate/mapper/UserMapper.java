package ru.yandex.practicum.filmorate.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.filmorate.dto.UpdateUserRequest;
import ru.yandex.practicum.filmorate.model.User;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class UserMapper {
    public static UpdateUserRequest mapToUpdateUserRequest(User user) {
        UpdateUserRequest request = new UpdateUserRequest();
        request.setName(user.getName());
        request.setEmail(user.getEmail());
        request.setLogin(user.getLogin());
        request.setBirthday(user.getBirthday());
        return request;
    }

    public static User updateUserFields(User user, UpdateUserRequest request) {
        if (request.hasEmail()) {
            user.setEmail(request.getEmail());
        }
        if (request.hasLogin()) {
            user.setLogin(request.getLogin());
        }
        if (request.hasBirthday()) {
            user.setBirthday(request.getBirthday());
        }
        if (request.hasName()) {
            user.setName(request.getName());
        }
        return user;
    }
}
