package com.bottleh.blogcode.common.audit;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public class Audit {

    @CreatedDate
    @Column(name = "SYS_REG_DTM", updatable = false)
    private LocalDateTime sysRegDtm;

    @CreatedBy
    @Column(name = "SYS_REGR_ID")
    private String sysRegrId;

    @LastModifiedDate
    @Column(name = "SYS_MDFY_DTM")
    private LocalDateTime sysMdfyDtm;

    @LastModifiedBy
    @Column(name = "SYS_MDFYR_ID")
    private String sysMdfyrId;
}
