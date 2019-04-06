package com.chunjies.comm;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
@Data
public class BaseEntity implements Serializable {
    @TableId("ID")
    private Long id;
}
