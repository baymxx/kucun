package com.bmx.kucun.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *  店铺表
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@TableName("shops")
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "店铺表")
public class ShopsEntity extends Model<ShopsEntity> {

    private static final long serialVersionUID = 1L;

    @TableId
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
     * 店铺名
     */
    @ApiModelProperty(value="店铺名")
    private String shopName;

    /**
     * 地址
     */
    @ApiModelProperty(value="地址")
    private String addr;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="更新时间")
    private LocalDateTime updateTime;


}
