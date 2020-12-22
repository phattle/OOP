package com.example.oop;

public class DatabaseInit {
     //singleton : creation
     private static  DatabaseInit instance = null;

     private DatabaseInit(){

     }
     public static  DatabaseInit getInstance(){
          if (instance == null) {
               instance  = new DatabaseInit();
          }
          return instance;
     }
}
