package me.mingxing5212.chaihens.voucher.web;

import me.mingxing5212.chaihens.voucher.data.entity.VoucherEntity;
import me.mingxing5212.chaihens.voucher.service.VoucherDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TestController
 *
 * @author Mingxing Li
 * @date 5/2/16
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    protected VoucherDefinitionService voucherDefinitionService;

    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        VoucherEntity voucherEntity = new VoucherEntity();
        voucherEntity.setName("TEST");
        voucherEntity.setColor("#FF00FF");
        voucherEntity.setStatus(1);
        voucherEntity.setType(1);
        voucherEntity.setMerchantId(1l);
        voucherEntity.setDenomination(new BigDecimal(1));
        voucherEntity.setDescription("BALABALA");
        voucherEntity.setAvatar("NONE");
        voucherEntity.setEffectiveStartTime(new Timestamp(System.currentTimeMillis()));
        voucherEntity.setEffectiveEndTime(new Timestamp(System.currentTimeMillis()));
        voucherDefinitionService.addVoucher(voucherEntity);
        return "";
    }
}
