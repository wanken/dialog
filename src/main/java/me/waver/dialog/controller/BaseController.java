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
    private Result getUuid(Integer count) {

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
}
