package net.leonbwchen.smartcrack.business.billboard.dao.mysql;

import net.leonbwchen.smartcrack.business.billboard.entity.mysql.MPicInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Seven
 */
@Mapper
public interface PicInfoMapper {

    /**
     * 插入图片信息
     * @param mPicInfo
     */
    void insertPic(MPicInfo mPicInfo);

    /**
     * 根据图片Id查找信息
     * @param picId
     */
    MPicInfo selectPicByPicId(String picId);


}
