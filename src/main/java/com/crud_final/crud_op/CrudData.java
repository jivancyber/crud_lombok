package com.crud_final.crud_op;

import lombok.Data;

@Data

public class CrudData {
    private int id;
    private String name;
    private String phone;
    private String address;

    public CrudData(int id,String name,String phone,String address) {
        super();
        this.id = id;
        this.name=name;
        this.phone=phone;
        this.address=address;

    }
}
