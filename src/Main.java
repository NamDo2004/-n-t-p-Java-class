import javax.lang.model.element.Name;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
class SapXep implements Comparator<SV>{
    @Override
    public int compare(SV sv1, SV sv2) {
        return Integer.compare(sv2.getNamSinh(), sv1.getNamSinh());
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();

        //Tao mang sinh vien
        SV[] sinhviens = new SV[n];

        //Nhap thong tin cho tung sinh vien
        for(int i=0; i<n; i++){
            System.out.print("Ma SV: ");
            int masv = sc.nextInt();
            sc.nextLine();
            System.out.print("Ho ten: ");
            String hoten = sc.nextLine();
            System.out.print("Nam sinh: ");
            int namsinh = sc.nextInt();
            System.out.print("Chieu cao: ");
            int chieucao = sc.nextInt();
            sc.nextLine();
            System.out.print("Que quan: ");
            String quequan = sc.nextLine();
            sinhviens[i] = new SV(masv, hoten, namsinh, chieucao, quequan);
        }

        //In thong tin sinh vien
        for(int i=0; i<n; i++){
            System.out.print("Ma SV: "+sinhviens[i].getMaSV());
            System.out.print(" Ho ten: "+sinhviens[i].getHoTen());
            System.out.print(" Nam sinh: "+sinhviens[i].getNamSinh());
            System.out.println(" Chieu cao: "+sinhviens[i].getChieuCao());
            System.out.println(" Que quan: "+sinhviens[i].getQueQuan());
        }
        //Mang sau khi sap xep
        Arrays.sort(sinhviens, new SapXep());
        System.out.println("Sap xep nam sinh");
        for(int i=0; i<n; i++){
            System.out.print("Ma SV: "+sinhviens[i].getMaSV());
            System.out.print(" Ho ten: "+sinhviens[i].getHoTen());
            System.out.print(" Nam sinh: "+sinhviens[i].getNamSinh());
            System.out.println(" Chieu cao: "+sinhviens[i].getChieuCao());
            System.out.println(" Que quan: "+sinhviens[i].getQueQuan());
        }
        System.out.println("Nhap que quan can tim:");
        String QueQuanTim = sc.nextLine();
        System.out.println("Nhap nam sinh can tim:");
        int NamSinhTim = sc.nextInt();
        boolean tim = false;
        for(SV sv : sinhviens){
            if(sv.getQueQuan().equalsIgnoreCase(QueQuanTim) && sv.getNamSinh() == NamSinhTim){
                System.out.println("Tim thay sv:");
                System.out.println("Ten: "+sv.getHoTen());
                System.out.println(" MaSV: "+sv.getMaSV());
                System.out.println(" Nam sinh: "+sv.getNamSinh());
                System.out.println(" Chieu cao: "+sv.getQueQuan());
                tim = true;
                break;
            }
        }
        if(!tim){
            System.out.println("Khong tim thay sinh vien co que "+ QueQuanTim + " va nam sinh "+NamSinhTim);
        }
    }
}