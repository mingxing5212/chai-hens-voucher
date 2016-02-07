package me.mingxing5212.chaihens.voucher.data;

import me.mingxing5212.chaihens.voucher.data.entity.VoucherEntity;
import org.apache.ibatis.annotations.*;

/**
 * Voucher数据处理
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
public interface VoucherMapper {

    @Select("SELECT * FROM tb_voucher WHERE id = #{voucherId}")
    VoucherEntity findById(@Param("voucherId") Long voucherId);

    @Insert("INSERT INTO tb_voucher(`name`,`type`,`status`,`merchant_id`,`denomination`,`description`,`avatar`,`color`,`effective_start_time`,`effective_end_time`) " +
            "VALUES (#{name}, #{type}, #{status}, #{merchantId}, #{denomination}, #{description}, #{avatar}, #{color}, #{effectiveStartTime}, #{effectiveEndTime})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Long addVoucher(VoucherEntity voucherEntity);

    @UpdateProvider(type = VoucherDynaUpdateSqlProvider.class,
            method="updateVoucher")
    void modifyVoucher(VoucherEntity voucherEntity);

    @Delete("DELETE FROM tb_voucher WHERE `id`=#{voucherId}")
    void removeVoucher(Long voucherId);
}
