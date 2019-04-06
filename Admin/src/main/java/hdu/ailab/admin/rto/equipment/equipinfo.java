package hdu.ailab.admin.rto.equipment;

import hdu.ailab.admin.bean.equipment;
import hdu.ailab.admin.bean.equipment_lab;

import java.util.List;

public class equipinfo {
    private equipment equip;
    private List<equipment_lab> equilist;

    public equipment getEquip() {
        return equip;
    }

    public void setEquip(equipment equip) {
        this.equip = equip;
    }

    public List<equipment_lab> getEquilist() {
        return equilist;
    }

    public void setEquilist(List<equipment_lab> equilist) {
        this.equilist = equilist;
    }
}
