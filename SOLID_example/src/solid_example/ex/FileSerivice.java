/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solid_example.ex;

/**
 *
 * @author Huy1721
 */
public interface FileSerivice {

    void sayHello(); // 100% bắt buộc định nghĩa và nó là public abstract
    
    // static method and default
    default String sayHello2() {
        return "xin chào việt nam";
    }// implementation có thể định nghĩa lại cũng dc, k định nghĩa k sao

    static String sayHello3() {
        return "xin chaò việt nam";
    }// tuyệt đối k được định nghĩa.

}
