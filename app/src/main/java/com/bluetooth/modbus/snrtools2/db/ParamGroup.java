package com.bluetooth.modbus.snrtools2.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * 参数组
 */
@Entity(nameInDb = "ParamGroup")
public class ParamGroup implements java.io.Serializable {

    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "hexNo")
    private String hexNo;

    @Property(nameInDb = "name")
    private String name;

    @Property(nameInDb = "level")
    private String level;

    @Property(nameInDb = "btAddress")
    private String btAddress;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public ParamGroup() {
    }

    public ParamGroup(Long id) {
        this.id = id;
    }

    @Generated
    public ParamGroup(Long id, String hexNo, String name, String level, String btAddress) {
        this.id = id;
        this.hexNo = hexNo;
        this.name = name;
        this.level = level;
        this.btAddress = btAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 十六进制编号（例：0000）
     */
    public String getHexNo() {
        return hexNo;
    }

    /**
     * 十六进制编号（例：0000）
     */
    public void setHexNo(String hexNo) {
        this.hexNo = hexNo;
    }

    /**
     * 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 连接设备地址
     */
    public String getBtAddress() {
        return btAddress;
    }

    /**
     * 连接设备地址
     */
    public void setBtAddress(String btAddress) {
        this.btAddress = btAddress;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
