package com.raif.service;

import com.raif.service.abstraction.IFileUpload;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.InputStream;

/**
 * Сервис для загрузки изображений.
 */
@Service
public class FileUploadService implements IFileUpload {


    /**
     * Сохраняет поток данных в БД.
     *
     * @param is Поток байтов.
     * @return True, если поток сохранён. Иначе false.
     */
    @Override
    @Transactional
    public boolean save(InputStream is, User user) {
        // TODO: 14/09/2019 допилить
        return true;
    }
}
