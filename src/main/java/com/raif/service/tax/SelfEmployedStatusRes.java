package com.raif.service.tax;

/**
 * Статус самозанятого (ответ).
 */
public class SelfEmployedStatusRes {

    /** True, если пользователь зарегистрирован в налоговой системе, как самозанятый. */
    boolean status;

    /** Информативное сообщение. */
    String message;
}
