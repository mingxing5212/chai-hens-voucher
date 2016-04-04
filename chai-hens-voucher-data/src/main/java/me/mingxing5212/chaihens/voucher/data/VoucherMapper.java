package me.mingxing5212.chaihens.voucher.data;

import me.mingxing5212.chaihens.component.VoucherSearchComponent;
import me.mingxing5212.chaihens.domain.Store;
import me.mingxing5212.chaihens.voucher.data.entity.StoreEntity;
import me.mingxing5212.chaihens.voucher.data.entity.VoucherEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Voucher数据处理
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
public interface VoucherMapper {

    @Select("SELECT * FROM tb_voucher WHERE id = #{voucherId}")
    VoucherEntity findById(@Param("voucherId") Long voucherId);

    @Insert("INSERT INTO tb_voucher(`name`,`type`,`status`,`code`,`merchant_id`,`store_id`,`denomination`,`description`,`avatar`,`color`,`effective_days`,`minimum_consumption`,`operator`,`order_limit`) " +
            "VALUES (#{name}, #{type}, #{status}, #{code}, #{merchantId}, #{storeId}, #{denomination}, #{description}, #{avatar}, #{color}, #{effectiveDays}, #{minimumConsumption}, #{operator}, #{orderLimit})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    Long addVoucher(VoucherEntity voucherEntity);

    @UpdateProvider(type = VoucherDynaUpdateSqlProvider.class,
            method = "updateVoucher")
    void modifyVoucher(VoucherEntity voucherEntity);

    @Delete("DELETE FROM tb_voucher WHERE `id`=#{voucherId}")
    void removeVoucher(Long voucherId);

    @SelectProvider(type = VoucherDynaSelectSqlProvider.class,
            method = "selectVouchers")
    @Results({
        @Result(column="name", property="name"),
        @Result(property="operatorName", column="operator_id",
                one=@One(select="me.mingxing5212.chaihens.voucher.data.VoucherMapper.findOperatorById"))
    })
    List<VoucherEntity> findVouchers(VoucherSearchComponent voucherSearchComponent);

    @SelectProvider(type = VoucherDynaSelectSqlProvider.class,
            method = "selectVouchersCount")
    Integer findVouchersCount(VoucherSearchComponent voucherSearchComponent);

    @Select("SELECT * FROM tb_store WHERE `id`=#{storeId}")
    StoreEntity findStoreById(@Param("storeId") Long storeId);

    @Select("SELECT `name` FROM tb_merchant_user WHERE `id`=#{operatorId}")
    String findOperatorById(@Param("operatorId") Long operatorId);
}
