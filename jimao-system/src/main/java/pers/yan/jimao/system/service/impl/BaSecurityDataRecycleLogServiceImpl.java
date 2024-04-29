package pers.yan.jimao.system.service.impl;

import com.mybatisflex.core.query.QueryChain;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pers.yan.jimao.system.entity.BaSecurityDataRecycleLog;
import pers.yan.jimao.system.mapper.BaSecurityDataRecycleLogMapper;
import pers.yan.jimao.system.service.IBaSecurityDataRecycleLogService;

import java.util.List;
import java.util.Optional;

import static pers.yan.jimao.system.entity.table.BaSecurityDataRecycleLogTableDef.BA_SECURITY_DATA_RECYCLE_LOG;

/**
 * {@code @Name:} BaSecurityDataRecycleLogServiceImpl
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2024/4/29 - 周一
 */
@Service
@RequiredArgsConstructor
public class BaSecurityDataRecycleLogServiceImpl extends ServiceImpl<BaSecurityDataRecycleLogMapper, BaSecurityDataRecycleLog> implements IBaSecurityDataRecycleLogService {

    @Override
    public List<BaSecurityDataRecycleLog> findList(BaSecurityDataRecycleLog baSecurityDataRecycleLog) {
        QueryChain<BaSecurityDataRecycleLog> queryChain = QueryChain.of(mapper)
                .select();

        Optional.ofNullable(baSecurityDataRecycleLog.getId()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.ID.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getAdminId()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.ADMIN_ID.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getCreatetime()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.CREATETIME.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getData()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.DATA.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getDataTable()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.DATA_TABLE.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getIp()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.IP.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getIsRestore()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.IS_RESTORE.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getPrimaryKey()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.PRIMARY_KEY.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getRecycleId()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.RECYCLE_ID.eq(val))));
        Optional.ofNullable(baSecurityDataRecycleLog.getUseragent()).ifPresent((val -> queryChain.where(BA_SECURITY_DATA_RECYCLE_LOG.USERAGENT.eq(val))));

        return queryChain.list();
    }
}
