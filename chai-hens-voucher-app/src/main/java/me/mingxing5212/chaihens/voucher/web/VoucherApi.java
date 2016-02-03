package me.mingxing5212.chaihens.voucher.web;

import me.mingxing5212.chaihens.voucher.data.domain.Voucher;
import me.mingxing5212.chaihens.voucher.service.VoucherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取商户信息
 *
 * @author Mingxing Li
 * @date 24/1/16
 */
@RestController
@RequestMapping("/voucher")
public class VoucherApi {
    private Logger logger = LoggerFactory.getLogger(VoucherApi.class);

    @Autowired
    public VoucherService voucherService;

    @RequestMapping(method = RequestMethod.GET)
    public Voucher getVoucher(@RequestParam Long voucherId) {
        logger.info("getVoucher by voucherId:{}", voucherId);
        return voucherService.getVoucher(voucherId);
    }
}
