package me.mingxing5212.chaihens.voucher.service.impl;

import me.mingxing5212.chaihens.domain.Voucher;
import me.mingxing5212.chaihens.exception.ServiceException;
import me.mingxing5212.chaihens.voucher.api.IVoucherDefinitionService;
import me.mingxing5212.chaihens.voucher.data.VoucherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 优惠券定义
 *
 * @author Mingxing Li
 * @date 29/1/16
 */
@Service
public class VoucherDefinitionServiceImpl implements IVoucherDefinitionService {

    @Autowired
    private VoucherMapper voucherMapper;

    public void createVoucher(Voucher voucher) throws ServiceException {
        voucherMapper.findById(1l);
    }
}
