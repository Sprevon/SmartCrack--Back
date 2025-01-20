package net.leonbwchen.smartcrack;

import net.leonbwchen.smartcrack.business.billboard.dao.mongo.PicInfoRepository;
import net.leonbwchen.smartcrack.business.billboard.entity.mongo.PicInfo;
import net.leonbwchen.smartcrack.business.billboard.service.PicInfoService;
import net.leonbwchen.smartcrack.utils.ImageUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmartCrackApplicationTests {
    @Autowired
    private PicInfoService picInfoService;
    @Autowired
    private PicInfoRepository picInfoRepository;

    @Test
    void contextLoads() {

    }

    @Test
    void testBase64(){
        String fileName = "D:\\浙工大\\F毕业设计\\智能裂痕检测系统\\服务器端\\SmartCrack\\SmartCrack\\src\\main\\resources\\static\\pic\\1.jpg";
        String base64 = ImageUtil.convertImageToBase64Str(fileName);
        System.out.println(base64);
    }

}
