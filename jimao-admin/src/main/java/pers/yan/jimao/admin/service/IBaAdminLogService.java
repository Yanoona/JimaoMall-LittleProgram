package pers.yan.jimao.admin.service;

import com.mybatisflex.core.service.IService;
import pers.yan.jimao.admin.entity.BaAdminLog;

import java.util.List;

/**
 * {@code @Name:} IBaAdminLogService
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2024/4/28 - 周日
 */
public interface IBaAdminLogService extends IService<BaAdminLog> {

    List<BaAdminLog> findAll(BaAdminLog baAdminLog);

    BaAdminLog findOne(Long id);

    boolean save(BaAdminLog baAdminLog);

    void delete(Long id);

    void update(BaAdminLog baAdminLog);
}
