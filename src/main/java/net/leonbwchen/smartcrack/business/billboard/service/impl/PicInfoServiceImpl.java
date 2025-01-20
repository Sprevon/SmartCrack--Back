package net.leonbwchen.smartcrack.business.billboard.service.impl;

import net.leonbwchen.smartcrack.business.billboard.dao.mongo.PicInfoRepository;
import net.leonbwchen.smartcrack.business.billboard.dao.mysql.PicInfoMapper;
import net.leonbwchen.smartcrack.business.billboard.entity.TotalPicInfo;
import net.leonbwchen.smartcrack.business.billboard.entity.mongo.PicInfo;
import net.leonbwchen.smartcrack.business.billboard.entity.mysql.MPicInfo;
import net.leonbwchen.smartcrack.business.billboard.service.PicInfoService;
import net.leonbwchen.smartcrack.utils.HTTPResult;
import net.leonbwchen.smartcrack.utils.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Seven
 */
@Service
public class PicInfoServiceImpl implements PicInfoService {
    @Autowired
    private PicInfoRepository picInfoRepository;
    @Autowired
    private PicInfoMapper picInfoMapper;

    /**
     * 根据图片id查找
     *
     * @param id
     * @return
     */
    @Override
    public HTTPResult findById(String id) {
        if (!isExist(id)){
            return HTTPResult.buildFault("图片不存在");
        }
        MPicInfo mPicInfo = picInfoMapper.selectPicByPicId(id);
        PicInfo picInfo = picInfoRepository.findPicInfoByPicId(id);
        TotalPicInfo totalPicInfo = new TotalPicInfo(picInfo, mPicInfo);
        return HTTPResult.buildSuccess(totalPicInfo);
    }

    /**
     * 根据时间查找
     *
     * @param start
     * @param end
     * @return
     */
    @Override
    public HTTPResult findByTimeContain(String start, String end) {
        return null;
    }

    /**
     * 根据开始时间查找
     *
     * @param start
     * @return
     */
    @Override
    public HTTPResult findByTimeAfter(String start) {
        return null;
    }

    /**
     * 根据截止时间查找
     *
     * @param end
     * @return
     */
    @Override
    public HTTPResult findByTimeBefore(String end) {
        return null;
    }

    /**
     * 根据操作员信息查找
     *
     * @param userId
     * @return
     */
    @Override
    public HTTPResult findByOperator(String userId) {
        return null;
    }


    /**
     * 根据拍摄部门查找
     *
     * @param department
     * @return
     */
    @Override
    public HTTPResult findByDepartment(String department) {
        return null;
    }




    public void insertPic(MultipartFile file) {
        String picId = "0000000009";
        if (!this.isEmpty(picId)){
            System.out.println("重复插入！");
            return;
        }
        String fileName = "D:\\浙工大\\F毕业设计\\智能裂痕检测系统\\服务器端\\SmartCrack\\SmartCrack\\src\\main\\resources\\static\\pic\\头像.jpg";
        String fileBase64 = ImageUtil.convertImageToBase64Str(fileName);
        PicInfo picInfo = new PicInfo(picId, fileBase64);
        picInfoRepository.insert(picInfo);
    }

    public void insertMyPicInfo(MPicInfo mPicInfo) {
        picInfoMapper.insertPic(mPicInfo);
    }

    public List<PicInfo> findAllByPicId(String picId) {
        List<PicInfo> picInfoList = new ArrayList<>();
        picInfoList = picInfoRepository.findAllByPicIdIs(picId);
        return picInfoList;
    }

    public boolean isExist(String id) {
        List<PicInfo> picInfoList= this.findAllByPicId(id);
        return picInfoList.size() == 1;
    }

    public boolean isEmpty(String id) {
        List<PicInfo> picInfoList= this.findAllByPicId(id);
        return picInfoList.isEmpty();
    }
}
