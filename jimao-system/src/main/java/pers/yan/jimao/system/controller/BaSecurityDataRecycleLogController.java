package pers.yan.jimao.system.controller;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.yan.jimao.system.entity.BaSecurityDataRecycleLog;
import pers.yan.jimao.system.service.IBaSecurityDataRecycleLogService;

import java.util.List;

/**
 * {@code @Name:} BaSecurityDataRecycleLogController
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2024/4/29 - 周一
 */
@RestController
@RequestMapping("baSecurityDataRecycleLog")
@RequiredArgsConstructor
public class BaSecurityDataRecycleLogController {

    private final IBaSecurityDataRecycleLogService iBaSecurityDataRecycleLogService;

    @GetMapping
    public List<BaSecurityDataRecycleLog> findList(@NotNull BaSecurityDataRecycleLog baSecurityDataRecycleLog) {
        return iBaSecurityDataRecycleLogService.findList(baSecurityDataRecycleLog);
    }
}
