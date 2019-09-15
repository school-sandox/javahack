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
    public Boolean saveData(@RequestParam(value = "inn") String inn,
                            @RequestParam(value = "data") String data) {
        if (inn.length() != 12 || checkData(data))
            return false; //неверный формат
        SelfEmployedStatusReq request = new SelfEmployedStatusReq(inn, data);
        SelfEmployedStatusRes response = taxService.checkStatus(request);
        System.out.println(response.getMessage());
        return response.getStatus();
    }

    private Boolean checkData(String data) {
        String[] partsData = data.split("-");
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
