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

    public static void main(String[] args) {
        new TaxService().checkStatus(new SelfEmployedStatusReq("772323358792", "2019-01-11"));
    }


    /**
     * Проверяет, зарегистрирован ли пользователь в налоговой системе в качестве самозанятого.
     * @param request Данные необходимые для запроса.
     * @return Подробный статус.
     */
    public SelfEmployedStatusRes checkStatus(SelfEmployedStatusReq request) {
        String fullUrl = URL + CHECK_STATUS_URL;
        ResponseEntity<SelfEmployedStatusRes> response = restTemplate.postForEntity(fullUrl, request, SelfEmployedStatusRes.class);
        return response.getBody();
    }
}
