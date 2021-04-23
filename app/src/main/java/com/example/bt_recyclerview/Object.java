package com.example.bt_recyclerview;

import java.util.List;
import java.util.Objects;

public class Object {
    private int img;
    private String name, address;
    private List<String> listVoucher;

    public Object(int img, String name, String address, List<String> listVoucher) {
        this.img = img;
        this.name = name;
        this.address = address;
        this.listVoucher = listVoucher;
    }

    @Override
    public String toString() {
        return "Object{" +
                "img=" + img +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", listVoucher=" + listVoucher +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(img, name, address, listVoucher);
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setListVoucher(List<String> listVoucher) {
        this.listVoucher = listVoucher;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getListVoucher() {
        return listVoucher;
    }
}
