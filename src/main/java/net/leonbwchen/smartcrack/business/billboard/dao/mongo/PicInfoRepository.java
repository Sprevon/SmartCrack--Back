package net.leonbwchen.smartcrack.business.billboard.dao.mongo;

import net.leonbwchen.smartcrack.business.billboard.entity.mongo.PicInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.lang.reflect.Array;
import java.util.List;

/**
 * @author Seven
 */
public interface PicInfoRepository extends MongoRepository<PicInfo, String> {
    /**
     * 通过图片ID查找单个图片
     * @param picId
     * @return
     */
    PicInfo findPicInfoByPicId(String picId);

    /**
     * 根据图片ID查找所有图片
     * @param picId
     * @return
     */
    List<PicInfo> findAllByPicIdIs(String picId);
}
