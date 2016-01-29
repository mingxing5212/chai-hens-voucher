package me.mingxing5212.chaihens.voucher.data;

import me.mingxing5212.chaihens.voucher.data.domain.Voucher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * voucherDao
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
public interface VoucherMapper {
    @Select("SELECT * FROM tb_voucher WHERE id = #{voucherId}")
    Voucher findById(@Param("voucherId") Long voucherId);
}
