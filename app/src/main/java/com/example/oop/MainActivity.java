package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    final int a = 5;
    static int b = 10;
    final int[] mangB={1,2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        khong lấy biến final gán thành giá trị khác
//        tính chất
//        tính kế thừa
//        quan hệ has A
//        tính đa hình
//        tính trừu tượng
//        tính đóng gói


        //object va class
        //Access modifier: Pham vi truy cap
//        Animal dog = new Animal();
//        dog.name = "kiki";
//        dog.weight = 5;

//        Animal dog = new Animal("kiki",5);
//       dog.setName("milu");
//        Log.d("BBB", dog.getName());
//
//        Rectangle rectangle = new Rectangle(4.5 , 5.5);
//        rectangle.getInformation();
//        public : ai cung thấy
//        private : ai tạo thù người đó thấy
//        default : giống private nhưng các class trong package có thể thấy

        // 1 : Tính kế thừa
//          Non access modifile : static, final
//        Dog dog = new Dog("kiki",5);
//        Log.d("BBB",dog.getName());
//    non access modifier : thay đổi tính chất của biến, đối tượng, phuonge thức
//    final : thay đổi biến thành hằng số và không được gán lại
//    static : giá trị hiển nhiên ko phải khởi tạo ra object để gọi đc giá trị này

//    override : ghi đè
//        1 : phuong thuc ghi de nam 2 nơi khác nhau, ko cùng 1 class
//        2 : chỉ thay đổi thân hàm
//        3 : đặc điểm nhận biết có anotation @override

//      Overload : nạp chồng
//        1: ten phuong thuc giong nhau
//        2: giá trị truyền vào khác nhau
//        3: Phạm vi cùng 1 class

//        showToast("Hello");
//    }
//    public void showToast(String message){
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
//    }
//    public void showToast(Integer resId){
//        Toast.makeText(this, resId + "", Toast.LENGTH_SHORT).show();
//    }
//    public void showToast(Boolean aBoolean){
//        Toast.makeText(this, aBoolean + "", Toast.LENGTH_SHORT).show();
//    }
        mangB[0]=5;
        Log.d("BBB", mangB[0]+"");
//        Dog dog = new Dog("kiki", 5);
//        Log.d("BBB", dog.getName());

        Animal.Builder builder = Animal.Builder.createBuilder();
    }
}