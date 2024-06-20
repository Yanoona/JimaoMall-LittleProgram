package pers.yan.jimao.system.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
* 菜单和权限规则表
* @TableName menu_rule
*/
public class MenuRule implements Serializable {

    /**
    * ID
    */
    @NotNull(message="[ID]不能为空")
    private Integer id;
    /**
    * 上级菜单
    */
    @NotNull(message="[上级菜单]不能为空")
    private Integer pid;
    /**
    * 类型:menu_dir=菜单目录,menu=菜单项,button=页面按钮
    */
    @NotNull(message="[类型:menu_dir=菜单目录,menu=菜单项,button=页面按钮]不能为空")
    private Object type;
    /**
    * 标题
    */
    @NotBlank(message="[标题]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String title;
    /**
    * 规则名称
    */
    @NotBlank(message="[规则名称]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;
    /**
    * 路由路径
    */
    @NotBlank(message="[路由路径]不能为空")
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String path;
    /**
    * 图标
    */
    @NotBlank(message="[图标]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String icon;
    /**
    * 菜单类型:tab=选项卡,link=链接,iframe=Iframe
    */
    private Object menuType;
    /**
    * Url
    */
    @NotBlank(message="[Url]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @Length(max= 255,message="编码长度不能超过255")
    private String url;
    /**
    * 组件路径
    */
    @NotBlank(message="[组件路径]不能为空")
    @Size(max= 100,message="编码长度不能超过100")
    @Length(max= 100,message="编码长度不能超过100")
    private String component;
    /**
    * 缓存:0=关闭,1=开启
    */
    @NotNull(message="[缓存:0=关闭,1=开启]不能为空")
    private Integer keepalive;
    /**
    * 扩展属性:none=无,add_rules_only=只添加为路由,add_menu_only=只添加为菜单
    */
    @NotNull(message="[扩展属性:none=无,add_rules_only=只添加为路由,add_menu_only=只添加为菜单]不能为空")
    private Object extend;
    /**
    * 备注
    */
    @NotBlank(message="[备注]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @Length(max= 255,message="编码长度不能超过255")
    private String remark;
    /**
    * 权重(排序)
    */
    @NotNull(message="[权重(排序)]不能为空")
    private Integer weigh;
    /**
    * 状态:0=禁用,1=启用
    */
    @NotNull(message="[状态:0=禁用,1=启用]不能为空")
    private Integer status;
    /**
    * 更新时间
    */
    private Integer updatetime;
    /**
    * 创建时间
    */
    private Integer createtime;
    /**
    * 权限认证标识
    */
    @NotBlank(message="[权限认证标识]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @Length(max= 50,message="编码长度不能超过50")
    private String authorityIdentify;
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
    * 上级菜单
    */
    private void setPid(Integer pid){
    this.pid = pid;
    }

    /**
    * 类型:menu_dir=菜单目录,menu=菜单项,button=页面按钮
    */
    private void setType(Object type){
    this.type = type;
    }

    /**
    * 标题
    */
    private void setTitle(String title){
    this.title = title;
    }

    /**
    * 规则名称
    */
    private void setName(String name){
    this.name = name;
    }

    /**
    * 路由路径
    */
    private void setPath(String path){
    this.path = path;
    }

    /**
    * 图标
    */
    private void setIcon(String icon){
    this.icon = icon;
    }

    /**
    * 菜单类型:tab=选项卡,link=链接,iframe=Iframe
    */
    private void setMenuType(Object menuType){
    this.menuType = menuType;
    }

    /**
    * Url
    */
    private void setUrl(String url){
    this.url = url;
    }

    /**
    * 组件路径
    */
    private void setComponent(String component){
    this.component = component;
    }

    /**
    * 缓存:0=关闭,1=开启
    */
    private void setKeepalive(Integer keepalive){
    this.keepalive = keepalive;
    }

    /**
    * 扩展属性:none=无,add_rules_only=只添加为路由,add_menu_only=只添加为菜单
    */
    private void setExtend(Object extend){
    this.extend = extend;
    }

    /**
    * 备注
    */
    private void setRemark(String remark){
    this.remark = remark;
    }

    /**
    * 权重(排序)
    */
    private void setWeigh(Integer weigh){
    this.weigh = weigh;
    }

    /**
    * 状态:0=禁用,1=启用
    */
    private void setStatus(Integer status){
    this.status = status;
    }

    /**
    * 更新时间
    */
    private void setUpdatetime(Integer updatetime){
    this.updatetime = updatetime;
    }

    /**
    * 创建时间
    */
    private void setCreatetime(Integer createtime){
    this.createtime = createtime;
    }

    /**
    * 权限认证标识
    */
    private void setAuthorityIdentify(String authorityIdentify){
    this.authorityIdentify = authorityIdentify;
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
    * 上级菜单
    */
    private Integer getPid(){
    return this.pid;
    }

    /**
    * 类型:menu_dir=菜单目录,menu=菜单项,button=页面按钮
    */
    private Object getType(){
    return this.type;
    }

    /**
    * 标题
    */
    private String getTitle(){
    return this.title;
    }

    /**
    * 规则名称
    */
    private String getName(){
    return this.name;
    }

    /**
    * 路由路径
    */
    private String getPath(){
    return this.path;
    }

    /**
    * 图标
    */
    private String getIcon(){
    return this.icon;
    }

    /**
    * 菜单类型:tab=选项卡,link=链接,iframe=Iframe
    */
    private Object getMenuType(){
    return this.menuType;
    }

    /**
    * Url
    */
    private String getUrl(){
    return this.url;
    }

    /**
    * 组件路径
    */
    private String getComponent(){
    return this.component;
    }

    /**
    * 缓存:0=关闭,1=开启
    */
    private Integer getKeepalive(){
    return this.keepalive;
    }

    /**
    * 扩展属性:none=无,add_rules_only=只添加为路由,add_menu_only=只添加为菜单
    */
    private Object getExtend(){
    return this.extend;
    }

    /**
    * 备注
    */
    private String getRemark(){
    return this.remark;
    }

    /**
    * 权重(排序)
    */
    private Integer getWeigh(){
    return this.weigh;
    }

    /**
    * 状态:0=禁用,1=启用
    */
    private Integer getStatus(){
    return this.status;
    }

    /**
    * 更新时间
    */
    private Integer getUpdatetime(){
    return this.updatetime;
    }

    /**
    * 创建时间
    */
    private Integer getCreatetime(){
    return this.createtime;
    }

    /**
    * 权限认证标识
    */
    private String getAuthorityIdentify(){
    return this.authorityIdentify;
    }

    /**
    * 逻辑删除
    */
    private Integer getIsDelete(){
    return this.isDelete;
    }

}
