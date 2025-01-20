package net.leonbwchen.smartcrack.business.billboard.entity.mysql;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Seven
 */

public class MPicInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = -619280370415152974L;

    private String picId;

    private String picTime;

    private String picOperator;

    private String picAddress;

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
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

    public MPicInfo() {
    }

    public MPicInfo(String picId, String picTime, String picOperator, String picAddress) {
        this.picId = picId;
        this.picTime = picTime;
        this.picOperator = picOperator;
        this.picAddress = picAddress;
    }
}
