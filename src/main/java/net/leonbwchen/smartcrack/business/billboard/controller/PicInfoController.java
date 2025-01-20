package net.leonbwchen.smartcrack.business.billboard.controller;

import net.leonbwchen.smartcrack.business.billboard.entity.TotalPicInfo;
import net.leonbwchen.smartcrack.business.billboard.service.PicInfoService;
import net.leonbwchen.smartcrack.utils.HTTPResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Seven
 */
@CrossOrigin
@RestController
@RequestMapping("/sc")
public class PicInfoController {
    @Autowired
    private PicInfoService picInfoService;

    @PostMapping(value = "/queryById")
    public HTTPResult queryById(@RequestBody TotalPicInfo totalPicInfo){
        String picId = totalPicInfo.getPicId();
        return picInfoService.findById(picId);
    }
}
