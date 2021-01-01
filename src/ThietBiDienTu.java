public abstract class ThietBiDienTu {

    //Màu vẽ thiết bị.
    protected MauVe mauVe;

    //Tên thiết bị.
    protected String tenThietBi;

    //Giá thiết bị.
    protected Double giaThietBi;

    //Hàm vẽ thiết bị lên màn hình.
    abstract public void veThietBi ();

    public ThietBiDienTu (MauVe mauVe) {
        this.mauVe = mauVe;
    }
}
