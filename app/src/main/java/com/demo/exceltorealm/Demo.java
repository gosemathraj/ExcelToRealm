package com.demo.exceltorealm;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;

public class Demo {

    @ExcelRow
    private int rowIndex;

    @ExcelCell(0)
    private int no;

    @ExcelCell(1)
    private String batch1;

    @ExcelCell(2)
    private String batch2;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBatch1() {
        return batch1;
    }

    public void setBatch1(String batch1) {
        this.batch1 = batch1;
    }

    public String getBatch2() {
        return batch2;
    }

    public void setBatch2(String batch2) {
        this.batch2 = batch2;
    }
}
