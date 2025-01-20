package net.leonbwchen.smartcrack.business.billboard.entity.mongo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author Seven
 */
@Data
@Document(collection = "pic_info")
public class PicInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 7369084794711030207L;
    @Id
    private String id;
    @Field("pic_id")
    private String picId;
    @Field("pic_src")
    private String picSrc;

    public PicInfo() {
    }

    public PicInfo( String picId, String picSrc) {
        this.picId = picId;
        this.picSrc = picSrc;
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
}
