package com.example.oop;

import android.util.Log;

public class Animal {
    //1 : thuộc tính
    public static String category ="ANIMAL";
   public String name;
   public Integer weight;
    //2 : Hành vi

    //constructor (phương thức khởi tạo)
    //mặc định object sẽ cung cấp constructor rỗng cho lớp đối tượng

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

        // alt + insert: generate code

//    Display : in ra thông tin
//    Nếu truyền String name : in ra tên
//    Nếu truyền String name, Integer weight: in ra cả 2
//    Nếu không truyền : như bên dưới


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
