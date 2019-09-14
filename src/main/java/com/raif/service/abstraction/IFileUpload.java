package com.raif.service.abstraction;

import com.raif.service.User;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Интерфейс для загрузки файлов.
 */
public interface IFileUpload {

    /**
     * Сохраняет поток данных в БД.
     *
     * @param is Поток байтов.
     * @param user Пользователь.
     * @return True, если поток сохранён. Иначе false.
     */
    boolean save(InputStream is, User user);
}
