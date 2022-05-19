package com.bmx.kucun.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @Author: code generator
 * @Date: 2022/5/16
 */
@Data
@TableName("mall_cloud_store")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "云店修改记录")
public class CloudStore extends Model<CloudStore> {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    @ApiModelProperty(value="主键Id")
    private Integer id;
    /**
     * 关联id
     */
    @ApiModelProperty(value="关联id")
    private Integer mallOrderId;
    /**
     * 云店id
     */
    @ApiModelProperty(value="云店id")
    private String cloudStoreId;
    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;
    /**
     * 租户id
     */
    @ApiModelProperty(value="租户id",hidden=true)
    private Integer tenantId;
}
