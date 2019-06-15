# shopping

Sale of point shopping project Spring boot + Thymeleaf + JPA + SalePoint Framework

Thành viên nhóm phát triển:
+ Cù Lê Sinh (nhóm trưởng)
+ Nguyễn Tấn Được
+ Bùi Nguyễn Nhật Quang
+ Nguyễn Tấn Hiền
+ Nguyễn Tùng Lâm.

# Hướng dẫn config projects
+ Mở project bằng esclipe hoặc STS tool 
-> Update maven 
-> Clean install để build project
+ Truy cập vào : src/main/resources 
-> Thay đổi config cơ sở dữ liệu trong application.properties (ở đây đang kết nối với MySQL).
+ Nếu bạn chưa restore DATABASE trong thư mục: (K38C_PTPMHDT_Nhom1_Shopping/Database_backup/db_shop.sql)
* Vui lòng truy cập
--> Truy cập vào src/main/java 
---> Truy cập vào vn.com.itzenk.shopping.datainit 
----> Mở tất cả comment trong ProductInit -> Run project
====> Bước này sẽ giúp thêm sản phẩm vào trong cơ sở dữ liệu của bạn. Sau khi run xong thì vui lòng comment lại tất cả.
---> Tiếp tục truy cập đến InventoryInitializer.java tiếp tục mở comment như bước trên.
====> Bước này dùng để thêm số lượng sản phẩm vào kho hàng.
(Xin lỗi vì sự bất tiện này, Trang Quản trị sẽ được update trong tương lai).
+ Nếu bạn đã restore database thủ công thì không cần thực hiện các bước ở trên
# Mã nguồn mở sử dụng 
+ Shopmax bootstrap template:
    • Link: https://colorlib.com/wp/template/shopmax/
    • Author: Colorlib 
    • Released: March, 2019 
    • Licence: CC BY 3.0 (footer credits must remain in place) 
    • Credits: Images from Unsplash
+ Login Form: Colorlib Reg Form v7
    • Link: https://colorlib.com/etc/regform/colorlib-regform-7/
# Tài liệu tham khảo :
+ Salespoint Framework:
    • Reference: http://st.inf.tu-dresden.de/SalesPoint/v7.0/salespoint-reference.html
    • JavaDoc: http://st.inf.tu-dresden.de/SalesPoint/v7.0/api/
+ Spring Boot:
    • Link: https://spring.io/projects/spring-boot
+ JPA:
    • Link: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
