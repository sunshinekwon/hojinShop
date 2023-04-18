package com.shop.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SwaggerDto {

    @ApiModelProperty(value = "개발자이름", dataType = "string", required = true)
    private String name;

    @ApiModelProperty(value = "개발자 나이")
    private String age;


}
