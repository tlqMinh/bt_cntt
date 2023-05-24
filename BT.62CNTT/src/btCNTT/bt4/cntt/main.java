package btCNTT.bt4.cntt;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("-----------------------WELCOME-------------------------------");
        QuanLyChuyenXe xeList = new QuanLyChuyenXe();
        XeNoiThanh xeNo1 = new XeNoiThanh("XeNoTh01","Tran Minh", "79",50000000,1,60);
        XeNoiThanh xeNo2 = new XeNoiThanh("XeNoTh02","Hoang Duy", "79",5055000,2,55);
        XeNoiThanh xeNo3 = new XeNoiThanh("XeNoTh03","Van Dung", "79",600000,3,65);

        XeNgoaiThanh xeNg1 = new XeNgoaiThanh("xeNgTh01","Tien Dat","85",300000,"TP Cam Ranh",1);
        XeNgoaiThanh xeNg2 = new XeNgoaiThanh("xeNgTh02","Tran Thanh","85",300000,"TP Cam Ranh",1);
        XeNgoaiThanh xeNg3 = new XeNgoaiThanh("xeNgTh03","Ngo Khong","85",300000,"TP Cam Ranh",1);

        xeList.them(xeNo1);
        xeList.them(xeNo2);
        xeList.them(xeNo3);
        xeList.them(xeNg1);
        xeList.them(xeNg2);
        xeList.them(xeNg3);

        System.out.println("Tong doanh thu xe noi thanh la:" + xeList.doanhThuNoiThanh());
        System.out.println("Tong doanh thu xe ngoai thanh la:" + xeList.doanhThuNgoaiThanh());
        System.out.println("Tong doanh thu ca hai xe:" + xeList.tongDoanhThuHaiXe());
    }
}

