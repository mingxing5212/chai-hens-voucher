package me.mingxing5212.chaihens.voucher.data.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 优惠券基础类
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
public class VoucherEntity {
    private Long id;
    private String name;
    private Integer type;
    private Integer status;
    private String code;
    private Long merchantId;
    private BigDecimal denomination;
    private String description;
    private String avatar;
    private String color;
    private Long storeId;
    private Integer effectiveDays;
    private BigDecimal minimumConsumption;
    private BigDecimal orderLimit;
    private Long operator;
    private String operatorName;

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

    public Integer getEffectiveDays() {
        return effectiveDays;
    }

    public void setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getMinimumConsumption() {
        return minimumConsumption;
    }

    public void setMinimumConsumption(BigDecimal minimumConsumption) {
        this.minimumConsumption = minimumConsumption;
    }

    public BigDecimal getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(BigDecimal orderLimit) {
        this.orderLimit = orderLimit;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
