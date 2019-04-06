package com.chunjies.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chunjies.comm.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 大虫
 * @since 2019-04-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("e_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("NAME")
    private String name;

    @TableField("PWD")
    private String pwd;


}
