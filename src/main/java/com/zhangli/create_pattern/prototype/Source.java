package com.zhangli.create_pattern.prototype;

import java.util.Date;

/**
 * @author zhangli
 * date 2022/8/25 下午10:45
 */

public class Source implements Cloneable {


    private String name;

    private Date date;


    public Source() {
    }

    public Source(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
