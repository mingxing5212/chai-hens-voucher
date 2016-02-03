package me.mingxing5212.chaihens.voucher.data.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 优惠券基础类
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
public class Voucher {
    private Long id;
    private String name;
    private Integer type;
    private Integer status;
    private BigDecimal denomination;
    private String description;
    private String avatar;
    private String color;
    private Timestamp effectiveStartTime;
    private Timestamp effectiveEndTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getDenomination() {
        return denomination;
    }

    public void setDenomination(BigDecimal denomination) {
        this.denomination = denomination;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Timestamp getEffectiveStartTime() {
        return effectiveStartTime;
    }

    public void setEffectiveStartTime(Timestamp effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
    }

    public Timestamp getEffectiveEndTime() {
        return effectiveEndTime;
    }

    public void setEffectiveEndTime(Timestamp effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
    }
}
