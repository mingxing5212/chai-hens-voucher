package me.mingxing5212.chaihens.voucher.service;

import me.mingxing5212.chaihens.voucher.data.VoucherMapper;
import me.mingxing5212.chaihens.voucher.data.domain.Voucher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * voucherService
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
@Service
public class VoucherService {
    @Autowired
    private VoucherMapper voucherMapper;

    public Voucher getvoucher(Long voucherId){
        return voucherMapper.findById(voucherId);
    }
}
