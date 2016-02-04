package me.mingxing5212.chaihens.voucher.api;

import me.mingxing5212.chaihens.domain.Voucher;
import me.mingxing5212.chaihens.exception.ServiceException;

/**
 * 卡券相关SOA接口
 *
 * @author Mingxing Li
 * @date 2/2/16
 */
public interface IVoucherDefinitionService {
    /**
     * 创建卡券
     * @param voucher
     * @throws ServiceException
     */
    void createVoucher(Voucher voucher) throws ServiceException;
}
