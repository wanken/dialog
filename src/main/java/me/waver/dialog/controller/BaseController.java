package me.waver.dialog.controller;

import cn.hutool.core.util.IdUtil;
import me.waver.dialog.common.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 09:04
 */
@RestController
@RequestMapping("/")
public class BaseController {

    @GetMapping("uuid")
    public Result getUuid(Integer count) {

        if (count == null) {
            return Result.ok("生成成功", IdUtil.fastSimpleUUID());
        } else if (count > 0) {
            List<String> uuidList = new ArrayList<>(count);
            for (int i = 0; i < count; i++) {
                uuidList.add(IdUtil.fastSimpleUUID());
            }
            return Result.ok("生成成功", uuidList);
        }
        return Result.fail("生成失败");
    }

    /**
     * 时间转换接口
     * @param time  时间字符串
     * @return Result
     */
    @GetMapping("/time")
    public Result getMillionTime(String time) {
        String[] split = time.split(":");
        long timeNum = 0L;
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                timeNum = Long.parseLong(split[0]) * 60 * 1000;
            }
            if (i == 1) {
                String[] strings = split[i].split("\\.");
                timeNum+= Long.parseLong(strings[0])*1000 + Long.parseLong(strings[1])*10;
            }

        }
        return Result.ok(timeNum);
    }
}
