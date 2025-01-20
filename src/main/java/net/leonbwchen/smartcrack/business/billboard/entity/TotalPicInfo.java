package net.leonbwchen.smartcrack.business.billboard.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.leonbwchen.smartcrack.business.billboard.entity.mongo.PicInfo;
import net.leonbwchen.smartcrack.business.billboard.entity.mysql.MPicInfo;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Seven
 */
public class TotalPicInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = -7344453209565747299L;

    private String id;
    @JsonProperty("pic_id")
    private String picId;
    @JsonProperty("pic_src")
    private String picSrc;
    @JsonProperty("pic_time")
    private String picTime;
    @JsonProperty("pic_operator")
    private String picOperator;
    @JsonProperty("pic_address")
    private String picAddress;

    public TotalPicInfo() {
    }

    public TotalPicInfo(PicInfo picInfo, MPicInfo mPicInfo){
        this.id = picInfo.getId();
        this.picId = mPicInfo.getPicId();
        this.picSrc = picInfo.getPicSrc();
        this.picTime = mPicInfo.getPicTime();
        this.picAddress = mPicInfo.getPicAddress();
        this.picOperator = mPicInfo.getPicOperator();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getPicSrc() {
        return picSrc;
    }

    public void setPicSrc(String picSrc) {
        this.picSrc = picSrc;
    }

    public String getPicTime() {
        return picTime;
    }

    public void setPicTime(String picTime) {
        this.picTime = picTime;
    }

    public String getPicOperator() {
        return picOperator;
    }

    public void setPicOperator(String picOperator) {
        this.picOperator = picOperator;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }
}
