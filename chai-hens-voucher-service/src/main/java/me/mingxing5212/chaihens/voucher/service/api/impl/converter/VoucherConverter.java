package me.mingxing5212.chaihens.voucher.service.api.impl.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import me.mingxing5212.chaihens.domain.Store;
import me.mingxing5212.chaihens.domain.Voucher;
import me.mingxing5212.chaihens.domain.VoucherStatus;
import me.mingxing5212.chaihens.voucher.data.entity.VoucherEntity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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
    public static VoucherEntity convertToVoucherEntity(Voucher voucher){
        VoucherEntity voucherEntity = new VoucherEntity();
        voucherEntity.setId(voucher.getId());
        voucherEntity.setName(voucher.getName());
        voucherEntity.setCode(voucher.getCode());
        if(voucher.getStore() != null) {
            voucherEntity.setStoreId(voucher.getStore().getId());
        }
        if(voucher.getType() != null)
            voucherEntity.setType(voucher.getType().getCode());
        if(voucher.getStatus() != null)
            voucherEntity.setStatus(voucher.getStatus().getCode());
        voucherEntity.setDescription(voucher.getDescription());
        voucherEntity.setColor(voucher.getColor());
        voucherEntity.setAvatar(voucher.getAvatar());
        voucherEntity.setDenomination(voucher.getDenomination());
        voucherEntity.setMinimumConsumption(voucher.getMinimumConsumption());
        voucherEntity.setOrderLimit(voucher.getOrderLimit());
        voucherEntity.setEffectiveDays(voucher.getEffectiveDays());
        voucherEntity.setOperatorName(voucher.getOperatorName());
        return voucherEntity;
    }

    public static Voucher convertToVoucher(VoucherEntity voucherEntity){
        Voucher voucher = new Voucher();
        voucher.setId(voucherEntity.getId());
        voucher.setName(voucherEntity.getName());
        voucher.setAvatar(voucherEntity.getAvatar());
        voucher.setColor(voucherEntity.getColor());
        voucher.setDenomination(voucherEntity.getDenomination());
        voucher.setMinimumConsumption(voucherEntity.getMinimumConsumption());
        voucher.setDescription(voucherEntity.getDescription());
        voucher.setEffectiveDays(voucherEntity.getEffectiveDays());
        voucher.setOrderLimit(voucherEntity.getOrderLimit());
        voucher.setCode(voucherEntity.getCode());
        voucher.setOperatorName(voucherEntity.getOperatorName());
        //voucher.setMerchant(voucherEntity.getMerchantId());
        //voucher.setStatus(VoucherStatus.voucherEntity.getStatus());
        //voucher.setType(voucherEntity.getType());
        return voucher;
    }

    /**
     * DTO类型转换器
     * @param voucherEntityList
     * @return
     */
    public static List<Voucher> convertToVoucherList(List<VoucherEntity> voucherEntityList){
        if(voucherEntityList == null || voucherEntityList.isEmpty()){
            return new ArrayList<Voucher>();
        }
        List<Voucher> vouchers = new ArrayList<Voucher>();
        for (VoucherEntity voucherEntity : voucherEntityList){
            vouchers.add(convertToVoucher(voucherEntity));
        }
        return vouchers;
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
            return null;
        }
    }
}
