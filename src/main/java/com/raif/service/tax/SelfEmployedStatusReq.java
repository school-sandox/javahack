package com.raif.service.tax;

/**
 * Статус самозанятого (запрос).
 */
public class SelfEmployedStatusReq {

    /** ИНН налогоплательщика. */
    public String inn;

    /** Дата, для которой будет осуществлена проверка статуса самозанятого. */
    public String requestDate;

    public SelfEmployedStatusReq(String inn, String requestDate) {
        this.inn = inn;
        this.requestDate = requestDate;
    }
}
