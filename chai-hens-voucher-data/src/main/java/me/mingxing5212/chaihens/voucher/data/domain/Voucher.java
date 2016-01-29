package me.mingxing5212.chaihens.voucher.data.domain;

/**
 * voucher
 *
 * @author Mingxing Li
 * @date 23/1/16
 */
public class Voucher {
    private Long id;
    private String name;
    private VoucherType type;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public VoucherType getType() {
        return type;
    }

    public void setType(VoucherType type) {
        this.type = type;
    }
}
