public class Client {

    public static void main(String[] args) {
        //Khởi tạo 2 màu: Xanh và Đỏ.
        MauVe mauXanh = new MauXanh();
        MauVe mauDo = new MauDo();

        //Khởi tạo 2 thiết bị và gắn màu tương ứng vào.
        ThietBiDienTu quatMay = new QuatMay(mauXanh);
        ThietBiDienTu mayGiat = new MayGiat(mauDo);

        //Bắt đầu vẽ thiết bị.
        quatMay.veThietBi();
        mayGiat.veThietBi();
    }

}
