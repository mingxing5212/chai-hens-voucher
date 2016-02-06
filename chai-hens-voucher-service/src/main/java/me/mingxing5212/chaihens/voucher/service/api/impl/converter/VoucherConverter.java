package me.mingxing5212.chaihens.voucher.service.api.impl.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.mingxing5212.chaihens.domain.Store;
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

    /**
     * 店铺转换器
     * @param store
     * @return
     */
    public static String convertStoreString(Store store){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(store);
        } catch (JsonProcessingException e) {
            return "未知店铺";
        }
    }
}
