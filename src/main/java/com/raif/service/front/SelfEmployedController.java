package com.raif.service.front;

import com.raif.service.tax.SelfEmployedStatusReq;
import com.raif.service.tax.SelfEmployedStatusRes;
import com.raif.service.tax.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Контроллер для взаимодействия с фронтом.
 */
@RestController
@RequestMapping(value = "/selfemployed")
public class SelfEmployedController {

    @Autowired
    private TaxService taxService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Boolean saveData(@RequestParam(value = "inn") String inn) {
        System.out.println(inn);
//        System.out.println(userInfo.getInn());
        SelfEmployedStatusReq request = new SelfEmployedStatusReq(inn, "2019-01-11");
        System.out.println(new Date().toString());
        SelfEmployedStatusRes response = taxService.checkStatus(request);
        System.out.println(response.getMessage());
        return response.getStatus();
    }
}
