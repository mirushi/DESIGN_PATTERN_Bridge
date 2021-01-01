public class QuatMay extends ThietBiDienTu {

    public QuatMay (MauVe mauVe) {
        super(mauVe);
        this.tenThietBi = "Quat may";
        this.giaThietBi = 100000d;
    }

    @Override
    public void veThietBi() {
        ///.. Code chuẩn bị vẽ ..///
        //Code minh hoạ, thực tế sẽ cần code phức tạp hơn để vẽ thiết bị lên màn hình.
        this.mauVe.veDiemAnh(1d,2d, 3d);
        ///.. Code chuẩn bị vẽ ..///
    }
}
