package com.raif.service.front;

import com.raif.service.tax.SelfEmployedStatusReq;
import com.raif.service.tax.SelfEmployedStatusRes;
import com.raif.service.tax.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для взаимодействия с фронтом.
 */
@RestController
@RequestMapping(value = "/selfemployed")
public class SelfEmployedController {

    @Autowired
    private TaxService taxService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String checkStatus(@RequestParam(value = "inn") String inn,
                              @RequestParam(value = "data") String data) {
        SelfEmployedStatusReq request = new SelfEmployedStatusReq(inn, data);
        SelfEmployedStatusRes response = taxService.checkStatus(request);
        return response.getMessage();
    }
}
