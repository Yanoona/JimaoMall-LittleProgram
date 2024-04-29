package pers.yan.jimao.admin.service.impl;

import com.mybatisflex.core.query.QueryChain;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pers.yan.jimao.admin.entity.BaAdminLog;
import pers.yan.jimao.admin.mapper.BaAdminLogMapper;
import pers.yan.jimao.admin.service.IBaAdminLogService;

import java.util.List;
import java.util.Optional;

import static pers.yan.jimao.admin.entity.table.BaAdminLogTableDef.BA_ADMIN_LOG;

/**
 * {@code @Name:} BaAdminLogServiceImpl
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2024/4/28 - 周日
 */
@Service("baAdminLogService")
@RequiredArgsConstructor
public class BaAdminLogServiceImpl extends ServiceImpl<BaAdminLogMapper, BaAdminLog> implements IBaAdminLogService {

    @Override
    public List<BaAdminLog> findAll(BaAdminLog baAdminLog) {
        QueryChain<BaAdminLog> queryChain = QueryChain.of(mapper)
                .select();

        Optional.ofNullable(baAdminLog.getAdminId()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.ADMIN_ID.eq(value)));
        Optional.ofNullable(baAdminLog.getId()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.ID.eq(value)));
        Optional.ofNullable(baAdminLog.getIp()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.IP.eq(value)));
        Optional.ofNullable(baAdminLog.getCreatetime()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.CREATETIME.eq(value)));
        Optional.ofNullable(baAdminLog.getData()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.DATA.like(value)));
        Optional.ofNullable(baAdminLog.getTitle()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.TITLE.eq(value)));
        Optional.ofNullable(baAdminLog.getUrl()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.URL.eq(value)));
        Optional.ofNullable(baAdminLog.getUseragent()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.USERAGENT.eq(value)));
        Optional.ofNullable(baAdminLog.getUsername()).ifPresent(value -> queryChain.where(BA_ADMIN_LOG.USERNAME.like(value)));

        return queryChain.list();
    }

    @Override
    public BaAdminLog findOne(Long id) {
        if (Optional.ofNullable(id).orElse(0L) == 0) {
            return null;
        }
        return QueryChain.of(mapper).select().where(BA_ADMIN_LOG.ID.eq(id)).one();
    }

    @Override
    public boolean save(BaAdminLog baAdminLog) {
        return mapper.insert(baAdminLog) > 0;
    }

    @Override
    public void delete(Long id) {
        mapper.deleteById(id);
    }

    @Override
    public void update(BaAdminLog baAdminLog) {
        mapper.update(baAdminLog);
    }
}
