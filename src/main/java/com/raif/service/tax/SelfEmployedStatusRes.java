package com.raif.service.tax;

/**
 * Статус самозанятого (ответ).
 */
public class SelfEmployedStatusRes {

    /** True, если пользователь зарегистрирован в налоговой системе, как самозанятый. */
    private Boolean status;

    /** Информативное сообщение. */
    private String message;


    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Status: " + this.status + "\nMessage: " + this.message;
    }
}
