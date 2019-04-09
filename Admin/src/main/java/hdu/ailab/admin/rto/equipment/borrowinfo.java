package hdu.ailab.admin.rto.equipment;

import java.util.Date;

public class borrowinfo {
    private Integer rfid;
    private Integer staffid;
    private String borrowdate;
    private String willreturndate;

    public Integer getRfid() {
        return rfid;
    }

    public void setRfid(Integer rfid) {
        this.rfid = rfid;
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(String borrowdate) {
        this.borrowdate = borrowdate;
    }

    public String getWillreturndate() {
        return willreturndate;
    }

    public void setWillreturndate(String willreturndate) {
        this.willreturndate = willreturndate;
    }
}
