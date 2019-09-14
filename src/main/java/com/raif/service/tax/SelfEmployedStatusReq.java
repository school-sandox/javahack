package com.raif.service.tax;

/**
 * Статус самозанятого (запрос).
 */
public class SelfEmployedStatusReq {

    /** ИНН налогоплательщика. */
    private String inn;

    /** Дата, для которой будет осуществлена проверка статуса самозанятого. */
    private String requestDate;

    public SelfEmployedStatusReq(String inn, String requestDate) {
        this.inn = inn;
        this.requestDate = requestDate;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getInn() {
        return inn;
    }

    public String getRequestDate() {
        return requestDate;
    }
}
