/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author 84346
 */
public class Vase extends Item{
    private int height;
    private String material;
    public Vase(){
        height = 0;
        material = "";
    }
    public Vase(int value,String creator,int height,String material){
        super(value,creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void inputVase(){
        Scanner sc = new Scanner(System.in);
        input();
        
//        while (true) nghĩa là gì?
//            Đây là một vòng lặp vô hạn (infinite loop).
//            Điều kiện true luôn đúng → vòng lặp sẽ chạy mãi mãi.
//            Thường được dùng khi ta chưa biết trước số lần lặp, và chỉ dừng lại khi gặp lệnh break.
        // nhap height(>0)
        while (true){  //Nếu muốn chương trình chắc chắn không crash dù người dùng nhập linh tinh → nên dùng while (true) kết hợp try…catch.
            try{
                System.out.println("Enter height (>0): ");
                height = Integer.parseInt(sc.nextLine().trim());
                if (height > 0) break;
                else System.out.println("Error: cannot assign negative height. Try again!");
            } catch (NumberFormatException e){
                System.out.println("Error: invalid number. Try again!");
            }
        }
        //Nhap material (khong rong)
        while (true) {
            try {
                System.out.print("Enter material (not empty): ");
                material = sc.nextLine().trim();

                if (material.isEmpty()) {
                    throw new Exception("Error: cannot assign empty material. Try again!");
                }
                // Regex: chỉ cho phép chữ thường hoặc hoa (có thể thêm khoảng trắng giữa)
                if (!material.matches("[a-zA-Z ]+")) {
                    throw new Exception("Material must contain letters only!");
                }
                break; // nhập hợp lệ thì thoát vòng lặp
            } catch (Exception e) {
                System.out.println( e.getMessage());
            }
        }
    }
    public void outputVase(){
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
//1. throw là gì?
//Trong Java, throw dùng để ném ra (phát sinh) một ngoại lệ (exception).
//Khi gặp throw, chương trình sẽ dừng chỗ đó và nhảy sang catch gần nhất (nếu có).
//2. Ý nghĩa của new Exception("Material cannot be empty!")
//new Exception(...) tạo ra một đối tượng ngoại lệ kèm theo thông báo lỗi.
//Ở đây "Material cannot be empty!" là message sẽ được in ra trong catch.
//3. Luồng chạy trong code
//Ví dụ đoạn nhập material:
//
//if (material.isEmpty()) {
//    throw new Exception("Material cannot be empty!");
//}
//Nếu người dùng bỏ trống (không nhập gì, chỉ nhấn Enter) → điều kiện isEmpty() đúng.
//Khi đó throw new Exception(...) được thực thi → ném ngoại lệ.
//Ngoại lệ này bị bắt lại trong khối catch:
//
//} catch (Exception e) {
//    System.out.println("❌ " + e.getMessage());
//}
//e.getMessage() sẽ lấy chuỗi "Material cannot be empty!" và in ra.
//Người dùng sẽ thấy thông báo lỗi, sau đó chương trình cho nhập lại.
//4. Vì sao không dùng System.out.println luôn?
//Nếu chỉ dùng println, chương trình sẽ chạy tiếp ngay cả khi dữ liệu sai.
//Dùng throw + catch giúp ép buộc quay lại vòng lặp cho đến khi dữ liệu hợp lệ.
//Đây là cách lập trình hướng đối tượng để xử lý lỗi dữ liệu nhất quán hơn.
//👉 Nói đơn giản:
//throw new Exception("...") = “ném lỗi” với thông báo cụ thể.
//catch = “bắt lỗi” và xử lý (in thông báo + yêu cầu nhập lại).