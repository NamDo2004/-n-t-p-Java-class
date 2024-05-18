public class SV {
    private int MaSV;
    private String HoTen;
    private int NamSinh;
    private int ChieuCao;
    private String QueQuan;
    public SV(){
        this.MaSV = 0;
        this.HoTen = "";
        this.NamSinh = 0;
        this.QueQuan = "";
        this.ChieuCao = 0;
    }
    public SV(int MaSV, String HoTen, int NamSinh, int ChieuCao, String QueQuan){
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.ChieuCao = ChieuCao;
        this.QueQuan = QueQuan;
    }

    public int getMaSV() {
        return MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public int getChieuCao() {
        return ChieuCao;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setMaSV(int maSV) {
        MaSV = maSV;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        NamSinh = namSinh;
    }

    public void setChieuCao(int chieuCao) {
        ChieuCao = chieuCao;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }

}
