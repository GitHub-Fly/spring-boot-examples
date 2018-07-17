package io.ymq.mybatis.po;

import java.io.Serializable;

public class TestTwoPo implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String TABLE_ALIAS = "TestTwo";

    private Long id;
    private String name;
    private String remark;

    public Long getId() {
        return this.id;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String value) {
        this.remark = value;
    }


}

