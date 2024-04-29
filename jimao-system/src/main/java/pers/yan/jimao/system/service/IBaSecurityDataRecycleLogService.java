package pers.yan.jimao.system.service;

import com.mybatisflex.core.service.IService;
import pers.yan.jimao.system.entity.BaSecurityDataRecycleLog;

import java.util.List;

/**
 * {@code @Name:} IBaSecurityDataRecycleLogService
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2024/4/29 - 周一
 */
public interface IBaSecurityDataRecycleLogService extends IService<BaSecurityDataRecycleLog> {

    List<BaSecurityDataRecycleLog> findList(BaSecurityDataRecycleLog baSecurityDataRecycleLog);
}
