package com.springBoot.demo.controller;

import com.springBoot.demo.dto.MessageInfoDTO;
import com.springBoot.demo.dto.ResultDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Lombok练习接口")
@Slf4j
public class LombokController {

    @ApiOperation(value = "Lombok注解练习接口")
    @ApiImplicitParam(name = "messageInfoDTO", value = "Lombok练习接口入参DTO", dataType = "MessageInfoDTO", required = true)
    @PostMapping("lombok/getdto")
    public ResultDTO getDto (@RequestBody MessageInfoDTO messageInfoDTO) {
        log.info(messageInfoDTO.toString());
        return new ResultDTO("1", "ok");
    }
}
