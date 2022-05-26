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
 * 审批表
 * </p>
 *
 * @author yuwen
 * @since 2022-05-26
 */
@TableName("approve")
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "审批表")
public class ApproveEntity extends Model<ApproveEntity> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Integer id;

    /**
     * 调出店铺id
     */
    @ApiModelProperty(value="调出店铺id")
    private Integer outSid;

    /**
     * 调入店铺id
     */
    @ApiModelProperty(value="调入店铺id")
    private Integer inSid;

    /**
     * 申请人id
     */
    @ApiModelProperty(value="申请人id")
    private Integer proposerId;

    /**
     * 审批人id
     */
    @ApiModelProperty(value="审批人id")
    private Integer approveId;

    /**
     * 审批备注
     */
    @ApiModelProperty(value="审批备注")
    private String remake;

    /**
     * 0审批中1通过2拒绝
     */
    @ApiModelProperty(value="0审批中1通过2拒绝")
    private Integer status;

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
