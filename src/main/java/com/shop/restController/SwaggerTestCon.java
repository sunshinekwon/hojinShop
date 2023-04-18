package com.shop.restController;

import com.shop.dto.SwaggerDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swaggerApi")
public class SwaggerTestCon {

    @ApiOperation(value = "개발자 info 리턴",notes = "개발한사람 정보 리턴")
    @ApiResponses({
            @ApiResponse(code = 200, message = "API 정상 작동"),
            @ApiResponse(code = 500, message ="서버 에러")
    })
    @RequestMapping(value = "/devInfo",method = {RequestMethod.GET})
    public ResponseEntity<SwaggerDto> getDevInfo() throws Exception{
        SwaggerDto swaggerDto = new SwaggerDto();
        swaggerDto.setName("권호진");
        swaggerDto.setAge("31");
        return new ResponseEntity<>(swaggerDto, HttpStatus.OK);
    }

}
