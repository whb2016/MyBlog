package com.site.blog.my.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by 13 on 2019/5/24.
 */
@Component
public class Constants {
    @Value("${upload.dir}")
    private String fileUploadDic;

    public String getFileUploadDic() {
        return fileUploadDic;
    }

    public void setFileUploadDic(String fileUploadDic) {
        this.fileUploadDic = fileUploadDic;
    }
}
