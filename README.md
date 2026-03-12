# java-filmorate
Template repository for Filmorate project.

## Database schema
![Схема базы данных](docs/filmorate-db.svg)

## Примеры запросов:
### Получение пользователя по id:

SELECT *<br> 
FROM users<br>
WHERE id = 1;

### Получение популярных фильмов:

SELECT f.*, COUNT(l.user_id) AS likes_count<br>
FROM films f<br>
LEFT JOIN likes l ON f.id = l.film_id<br>
GROUP BY f.id<br>
ORDER BY likes_count DESC<br>
LIMIT 10;

### Получение друзей пользователя:

SELECT u.*<br>
FROM users u<br>
JOIN friendship f ON u.id = f.friend_id<br>
WHERE f.user_id = 1<br>
AND f.status = 'CONFIRMED';

### Получение общих друзей:

SELECT u.*<br>
FROM users u<br>
JOIN friendship f1 ON u.id = f1.friend_id<br>
JOIN friendship f2 ON u.id = f2.friend_id<br>
WHERE f1.user_id = 1<br>
AND f2.user_id = 2<br>
AND f1.status = 'CONFIRMED'<br>
AND f2.status = 'CONFIRMED';