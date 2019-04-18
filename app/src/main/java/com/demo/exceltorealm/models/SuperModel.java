package com.demo.exceltorealm.models;

import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelRow;

public class SuperModel {

    @ExcelRow
    private int indexRow;

    @ExcelCell(0)
    private int rowId;

    @ExcelCell(1)
    private int testId;

    @ExcelCell(2)
    private String section;

    @ExcelCell(3)
    private String question;

    @ExcelCell(4)
    private String note;

    @ExcelCell(5)
    private int weight;

    @ExcelCell(6)
    private String ans1;

    @ExcelCell(7)
    private int ans1WR;

    @ExcelCell(8)
    private String ans2;

    @ExcelCell(9)
    private int ans2WR;

    @ExcelCell(10)
    private String ans3;

    @ExcelCell(11)
    private int ans3WR;

    @ExcelCell(12)
    private String ans4;

    @ExcelCell(13)
    private int ans4WR;

    @ExcelCell(14)
    private String ans5;

    @ExcelCell(15)
    private int ans5WR;

    @ExcelCell(16)
    private String ans6;

    @ExcelCell(17)
    private int ans6WR;

    public int getIndexRow() {
        return indexRow;
    }

    public void setIndexRow(int indexRow) {
        this.indexRow = indexRow;
    }

    public int getRow() {
        return rowId;
    }

    public void setRow(int rowId) {
        this.rowId = rowId;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public int getAns1WR() {
        return ans1WR;
    }

    public void setAns1WR(int ans1WR) {
        this.ans1WR = ans1WR;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public int getAns2WR() {
        return ans2WR;
    }

    public void setAns2WR(int ans2WR) {
        this.ans2WR = ans2WR;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public int getAns3WR() {
        return ans3WR;
    }

    public void setAns3WR(int ans3WR) {
        this.ans3WR = ans3WR;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public int getAns4WR() {
        return ans4WR;
    }

    public void setAns4WR(int ans4WR) {
        this.ans4WR = ans4WR;
    }

    public String getAns5() {
        return ans5;
    }

    public void setAns5(String ans5) {
        this.ans5 = ans5;
    }

    public int getAns5WR() {
        return ans5WR;
    }

    public void setAns5WR(int ans5WR) {
        this.ans5WR = ans5WR;
    }

    public String getAns6() {
        return ans6;
    }

    public void setAns6(String ans6) {
        this.ans6 = ans6;
    }

    public int getAns6WR() {
        return ans6WR;
    }

    public void setAns6WR(int ans6WR) {
        this.ans6WR = ans6WR;
    }
}
