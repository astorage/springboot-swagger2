package com.example.swaggerdemo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@ApiModel(description = "标签查询DTO", value = "标签查询DTO")
public class TagQueryDTO{

    @ApiModelProperty(value = "标签编号", notes = "标签编号", required = true)
    private Long id;

    @ApiModelProperty(value = "标签内容", required = true)
    private String content;

    @ApiModelProperty(notes = "标签编码", required = true)
    private String code;

    @ApiModelProperty(notes = "标签类型", required = true)
    private int tagType;

    @ApiModelProperty(notes = "标签排序顺序", required = true)
    private Short sortNum;


}
