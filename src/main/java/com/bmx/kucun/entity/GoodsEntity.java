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
 * 商品表
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@TableName("goods")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "商品表")
@Data
public class GoodsEntity extends Model<GoodsEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
     * 商品名
     */
    @ApiModelProperty(value="商品名")
    private String name;

    /**
     * 类型
     */
    @ApiModelProperty(value="类型")
    private String type;

    /**
     * 颜色
     */
    @ApiModelProperty(value="颜色")
    private String color;

    /**
     * 重量
     */
    @ApiModelProperty(value="重量")
    private Double weight;

    /**
     * 价格
     */
    @ApiModelProperty(value="价格")
    private String money;

    /**
     * 尺寸
     */
    @ApiModelProperty(value="尺寸")
    private Double size;

    /**
     * 材质
     */
    @ApiModelProperty(value="材质")
    private String texture;

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
