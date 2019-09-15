package com.raif.service.tax;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Сервис по интеграции с налоговой
 */
@Service
public class TaxService {

    public static final String URL = "https://statusnpd.nalog.ru";
    public static final String CHECK_STATUS_URL = "/api/v1/tracker/taxpayer_status";

    private final RestTemplate restTemplate = new RestTemplate();


    /**
     * Проверяет, зарегистрирован ли пользователь в налоговой системе в качестве самозанятого.
     * @param request Данные необходимые для запроса.
     * @return Подробный статус.
     */
    public SelfEmployedStatusRes checkStatus(SelfEmployedStatusReq request) {

        if (request.getInn().length() != 12 || !isValid(request.getRequestDate())) {
            SelfEmployedStatusRes res = new SelfEmployedStatusRes();
            res.setMessage("неверный формат");
            return res;
        }

        String fullUrl = URL + CHECK_STATUS_URL;
        ResponseEntity<SelfEmployedStatusRes> response = restTemplate.postForEntity(fullUrl, request, SelfEmployedStatusRes.class);
        return response.getBody();
    }


    private boolean isValid(String date) {
        String[] partsData = date.split("-");
        if (partsData.length != 3)
            return false;
        if (partsData[0].length() != 4)
            return false;
        if (partsData[1].length() != 2)
            return false;
        if (partsData[2].length() != 2)
            return false;
        return true;
    }
}
