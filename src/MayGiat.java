public class MayGiat extends ThietBiDienTu {

    public MayGiat (MauVe mauVe) {
        super(mauVe);
        this.tenThietBi = "May giat";
        this.giaThietBi = 4300000d;
    }

    @Override
    public void veThietBi() {
        //... Code khi vẽ ... //
        this.mauVe.veDiemAnh(4d,5d,6d);
        //... Code khi vẽ ... //
    }
}
