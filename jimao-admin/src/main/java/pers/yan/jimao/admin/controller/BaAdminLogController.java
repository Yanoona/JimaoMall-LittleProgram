package pers.yan.jimao.admin.controller;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pers.yan.jimao.admin.entity.BaAdminLog;
import pers.yan.jimao.admin.service.IBaAdminLogService;

import java.util.List;

/**
 * {@code @Name:} BaAdminLogController
 * {@code @Description: }
 * {@code @Author:} by yanjieping
 * {@code @CreateDate:} 2024/4/28 - 周日
 */
@RestController
@RequestMapping("baAdminLog")
@RequiredArgsConstructor
public class BaAdminLogController {

    private final IBaAdminLogService iBaAdminLogService;

    @PostMapping
    public void insert(@NotNull BaAdminLog baAdminLog) {
        iBaAdminLogService.save(baAdminLog);
    }

    @PutMapping
    public void update(@NotNull BaAdminLog baAdminLog) {
        iBaAdminLogService.update(baAdminLog);
    }

    @DeleteMapping
    public void delete(Long id) {
        iBaAdminLogService.delete(id);
    }

    @GetMapping("list")
    public List<BaAdminLog> list(@NotNull BaAdminLog baAdminLog) {
        return iBaAdminLogService.findAll(baAdminLog);
    }

    @GetMapping("findId/{id}")
    public BaAdminLog findById(@NotNull @PathVariable("id") Long id) {
        return iBaAdminLogService.findOne(id);
    }
}
