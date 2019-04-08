package hdu.ailab.admin.rto.equipment;

import hdu.ailab.admin.bean.borrowequip;
import hdu.ailab.admin.bean.returnequip;

import java.util.List;

public class useinfo {
    private String labname;
    private String lablocation;
    private List<borrowequip> borrowlist;
    private List<returnequip> returnlist;

    public String getLabname() {
        return labname;
    }

    public void setLabname(String labname) {
        this.labname = labname;
    }

    public String getLablocation() {
        return lablocation;
    }

    public void setLablocation(String lablocation) {
        this.lablocation = lablocation;
    }

    public List<borrowequip> getBorrowlist() {
        return borrowlist;
    }

    public void setBorrowlist(List<borrowequip> borrowlist) {
        this.borrowlist = borrowlist;
    }

    public List<returnequip> getReturnlist() {
        return returnlist;
    }

    public void setReturnlist(List<returnequip> returnlist) {
        this.returnlist = returnlist;
    }
}
