package me.mingxing5212.chaihens.voucher.service.api.impl.converter;

import me.mingxing5212.chaihens.domain.Voucher;
import me.mingxing5212.chaihens.voucher.data.entity.VoucherEntity;

import java.sql.Timestamp;

/**
 * 优惠券转换器
 *
 * @author Mingxing Li
 * @date 5/2/16
 */
public class VoucherConverter {

    /**
     * 域类型转换器
     * @param voucher
     * @return
     */
    public static VoucherEntity convertVoucherEntity(Voucher voucher){
        VoucherEntity voucherEntity = new VoucherEntity();
        voucherEntity.setId(voucher.getId());
        voucherEntity.setName(voucher.getName());
        voucherEntity.setType(voucher.getType().getCode());
        voucherEntity.setStatus(voucher.getStatus().getCode());
        voucherEntity.setDescription(voucher.getDescription());
        voucherEntity.setColor(voucher.getColor());
        voucherEntity.setAvatar(voucher.getAvatar());
        voucherEntity.setDenomination(voucher.getDenomination());
        voucherEntity.setEffectiveStartTime(new Timestamp(voucher.getEffectiveStartTime()));
        voucherEntity.setEffectiveEndTime(new Timestamp(voucher.getEffectiveEndTime()));
        return voucherEntity;
    }
}
