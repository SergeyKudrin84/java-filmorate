package ru.yandex.practicum.filmorate.mapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import ru.yandex.practicum.filmorate.dto.UpdateFilmRequest;
import ru.yandex.practicum.filmorate.model.Film;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class FilmMapper {

    public static UpdateFilmRequest mapToUpdateFilmRequest(Film film) {
        UpdateFilmRequest request = new UpdateFilmRequest();
        request.setName(film.getName());
        request.setDescription(film.getDescription());
        request.setDuration(film.getDuration());
        request.setReleaseDate(film.getReleaseDate());
        return request;
    }

    public static Film updateFilmFields(Film film, UpdateFilmRequest request) {
        if (request.hasDescription()) {
            film.setDescription(request.getDescription());
        }
        if (request.hasName()) {
            film.setName(request.getName());
        }
        if (request.hasDuration()) {
            film.setDuration(request.getDuration());
        }
        if (request.hasReleaseDate()) {
            film.setReleaseDate(request.getReleaseDate());
        }
        return film;
    }
}
