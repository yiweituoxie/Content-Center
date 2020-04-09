package com.waitfor.contentcenter.controller.content;

import com.waitfor.contentcenter.domain.dto.content.ShareAuditDTO;
import com.waitfor.contentcenter.domain.entity.content.Share;
import com.waitfor.contentcenter.service.content.ShareService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/shares")
public class ShareAdminController {
    private ShareService shareService;
    @PutMapping("/audit/{id}")
    public Share auditById(@PathVariable Integer id, @RequestBody ShareAuditDTO auditDTO){
        // TODO 认证、 授权
        return this.shareService.auditById(id,auditDTO);
    }
}
