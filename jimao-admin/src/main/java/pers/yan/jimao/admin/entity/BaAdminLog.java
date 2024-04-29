package pers.yan.jimao.admin.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
* 管理员日志表
* @TableName ba_admin_log
*/
@Data
@Accessors(chain = true)
@EqualsAndHashCode
@Table("ba_admin_log")
public class BaAdminLog implements Serializable {

    /**
    * ID
    */
    @Id(keyType = KeyType.Auto)
    @NotNull(message="[ID]不能为空")
    private Integer id;
    /**
    * 管理员ID
    */
    @NotNull(message="[管理员ID]不能为空")
    private Integer adminId;
    /**
    * 管理员用户名
    */
    @Size(max= 30,message="编码长度不能超过30")
    @Length(max= 30,message="编码长度不能超过30")
    private String username;
    /**
    * 操作Url
    */
    @Size(max= 1500,message="编码长度不能超过1500")
    @Length(max= 1500,message="编码长度不能超过1,500")
    private String url;
    /**
    * 日志标题
    */
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String title;
    /**
    * 请求数据
    */
    @NotNull(message="[请求数据]不能为空")
    @Size(max= -1,message="编码长度不能超过-1")
    @Length(max= -1,message="编码长度不能超过-1")
    private String data;
    /**
    * IP
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String ip;
    /**
    * User-Agent
    */
    @Size(max= 255,message="编码长度不能超过255")
    @Length(max= 255,message="编码长度不能超过255")
    private String useragent;
    /**
    * 操作时间
    */
    private Long createtime;

}
