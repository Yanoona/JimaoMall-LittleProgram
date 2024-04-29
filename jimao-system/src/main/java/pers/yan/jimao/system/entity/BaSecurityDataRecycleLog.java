package pers.yan.jimao.system.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
* 数据回收记录表
* @TableName ba_security_data_recycle_log
*/
@Data
@ToString
@EqualsAndHashCode
@Table("ba_security_data_recycle_log")
public class BaSecurityDataRecycleLog implements Serializable {

    /**
    * ID
    */
    @Id(keyType = KeyType.Auto)
    @NotNull(message="[ID]不能为空")
    private Integer id;
    /**
    * 操作管理员
    */
    @NotNull(message="[操作管理员]不能为空")
    private Integer adminId;
    /**
    * 回收规则ID
    */
    @NotNull(message="[回收规则ID]不能为空")
    private Integer recycleId;
    /**
    * 回收的数据
    */
    @Size(max= -1,message="编码长度不能超过-1")
    @Length(max= -1,message="编码长度不能超过-1")
    private String data;
    /**
    * 数据表
    */
    @NotBlank(message="[数据表]不能为空")
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String dataTable;
    /**
    * 数据表主键
    */
    @NotBlank(message="[数据表主键]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String primaryKey;
    /**
    * 是否已还原:0=否,1=是
    */
    @NotNull(message="[是否已还原:0=否,1=是]不能为空")
    private Integer isRestore;
    /**
    * 操作者IP
    */
    @NotBlank(message="[操作者IP]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String ip;
    /**
    * User Agent
    */
    @NotBlank(message="[User Agent]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @Length(max= 255,message="编码长度不能超过255")
    private String useragent;
    /**
    * 删除时间
    */
    private Integer createtime;
}
