package com.serein.bdai.web;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

/**
 * ClassName:InfoController
 * Package:com.serein.bdai.web
 * Description:
 *
 * @Date:2022/8/23 20:32
 * @Author:wangqiang
 */
@RestController
@RequestMapping("/info")
public class InfoController {
    @RequestMapping(value = "/detail", produces = "application/json; charset=utf-8")
    public String getInfoDetail() throws IOException {
        String jsonStr = FileUtils.readFileToString(new File("src/main/resources/data/infoDetail.json"));
        System.out.println("渐渐SB");
        return jsonStr;
    }
}
