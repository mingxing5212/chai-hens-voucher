package me.mingxing5212.chaihens.voucher.service;

import me.mingxing5212.chaihens.voucher.data.VoucherMapper;
import me.mingxing5212.chaihens.voucher.data.entity.VoucherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 优惠券相关实现类
 *
 * @author Mingxing Li
 * @date 5/2/16
 */
@Service
public class VoucherDefinitionService {

    @Autowired
    protected VoucherMapper voucherMapper;

    public Long addVoucher(VoucherEntity voucherEntity){
        return voucherMapper.addVoucher(voucherEntity);
    }
}
