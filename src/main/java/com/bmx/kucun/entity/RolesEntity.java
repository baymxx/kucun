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

/**
 * <p>
 *  角色表
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@TableName("roles")
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "角色表")
public class RolesEntity extends Model<RolesEntity> {

    private static final long serialVersionUID = 1L;

    @TableId
    @ApiModelProperty(value="主键Id")
    private Integer id;

    /**
     * 角色名
     */
    @ApiModelProperty(value="角色名")
    private String roleName;


}
