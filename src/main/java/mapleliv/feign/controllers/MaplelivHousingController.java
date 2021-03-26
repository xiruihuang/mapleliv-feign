package mapleliv.feign.controllers;

import mapleliv.feign.services.MaplelivHousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaplelivHousingController {

    @Autowired
    MaplelivHousingService maplelivHousingService;
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return maplelivHousingService.sayHiFromClientOne(name);
    }
}
