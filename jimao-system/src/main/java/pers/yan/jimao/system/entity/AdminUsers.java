package pers.yan.jimao.system.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
* 管理员表
* @TableName admin_users
*/
public class AdminUsers implements Serializable {

    /**
    * ID
    */
    @NotNull(message="[ID]不能为空")
    private Integer id;
    /**
    * 用户名
    */
    @Size(max= 20,message="编码长度不能超过20")
    @Length(max= 20,message="编码长度不能超过20")
    private String username;
    /**
    * 昵称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String nickname;
    /**
    * 头像
    */
    @Size(max= 1000,message="编码长度不能超过1000")
    @Length(max= 1000,message="编码长度不能超过1,000")
    private String avatar;
    /**
    * 邮箱
    */
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String email;
    /**
    * 手机
    */
    @Size(max= 11,message="编码长度不能超过11")
    @Length(max= 11,message="编码长度不能超过11")
    private String mobile;
    /**
    * 登录失败次数
    */
    @NotNull(message="[登录失败次数]不能为空")
    private Integer loginfailure;
    /**
    * 登录时间
    */
    private Long lastlogintime;
    /**
    * 登录IP
    */
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String lastloginip;
    /**
    * 密码
    */
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String password;
    /**
    * 密码盐
    */
    @Size(max= 30,message="编码长度不能超过30")
    @Length(max= 30,message="编码长度不能超过30")
    private String salt;
    /**
    * 签名
    */
    @NotBlank(message="[签名]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @Length(max= 255,message="编码长度不能超过255")
    private String motto;
    /**
    * 创建时间
    */
    private Long createtime;
    /**
    * 更新时间
    */
    private Long updatetime;
    /**
    * 状态:0=禁用,1=启用
    */
    @NotNull(message="[状态:0=禁用,1=启用]不能为空")
    private Integer status;
    /**
    * 逻辑删除
    */
    @NotNull(message="[逻辑删除]不能为空")
    private Integer isDelete;

    /**
    * ID
    */
    private void setId(Integer id){
    this.id = id;
    }

    /**
    * 用户名
    */
    private void setUsername(String username){
    this.username = username;
    }

    /**
    * 昵称
    */
    private void setNickname(String nickname){
    this.nickname = nickname;
    }

    /**
    * 头像
    */
    private void setAvatar(String avatar){
    this.avatar = avatar;
    }

    /**
    * 邮箱
    */
    private void setEmail(String email){
    this.email = email;
    }

    /**
    * 手机
    */
    private void setMobile(String mobile){
    this.mobile = mobile;
    }

    /**
    * 登录失败次数
    */
    private void setLoginfailure(Integer loginfailure){
    this.loginfailure = loginfailure;
    }

    /**
    * 登录时间
    */
    private void setLastlogintime(Long lastlogintime){
    this.lastlogintime = lastlogintime;
    }

    /**
    * 登录IP
    */
    private void setLastloginip(String lastloginip){
    this.lastloginip = lastloginip;
    }

    /**
    * 密码
    */
    private void setPassword(String password){
    this.password = password;
    }

    /**
    * 密码盐
    */
    private void setSalt(String salt){
    this.salt = salt;
    }

    /**
    * 签名
    */
    private void setMotto(String motto){
    this.motto = motto;
    }

    /**
    * 创建时间
    */
    private void setCreatetime(Long createtime){
    this.createtime = createtime;
    }

    /**
    * 更新时间
    */
    private void setUpdatetime(Long updatetime){
    this.updatetime = updatetime;
    }

    /**
    * 状态:0=禁用,1=启用
    */
    private void setStatus(Integer status){
    this.status = status;
    }

    /**
    * 逻辑删除
    */
    private void setIsDelete(Integer isDelete){
    this.isDelete = isDelete;
    }


    /**
    * ID
    */
    private Integer getId(){
    return this.id;
    }

    /**
    * 用户名
    */
    private String getUsername(){
    return this.username;
    }

    /**
    * 昵称
    */
    private String getNickname(){
    return this.nickname;
    }

    /**
    * 头像
    */
    private String getAvatar(){
    return this.avatar;
    }

    /**
    * 邮箱
    */
    private String getEmail(){
    return this.email;
    }

    /**
    * 手机
    */
    private String getMobile(){
    return this.mobile;
    }

    /**
    * 登录失败次数
    */
    private Integer getLoginfailure(){
    return this.loginfailure;
    }

    /**
    * 登录时间
    */
    private Long getLastlogintime(){
    return this.lastlogintime;
    }

    /**
    * 登录IP
    */
    private String getLastloginip(){
    return this.lastloginip;
    }

    /**
    * 密码
    */
    private String getPassword(){
    return this.password;
    }

    /**
    * 密码盐
    */
    private String getSalt(){
    return this.salt;
    }

    /**
    * 签名
    */
    private String getMotto(){
    return this.motto;
    }

    /**
    * 创建时间
    */
    private Long getCreatetime(){
    return this.createtime;
    }

    /**
    * 更新时间
    */
    private Long getUpdatetime(){
    return this.updatetime;
    }

    /**
    * 状态:0=禁用,1=启用
    */
    private Integer getStatus(){
    return this.status;
    }

    /**
    * 逻辑删除
    */
    private Integer getIsDelete(){
    return this.isDelete;
    }

}
