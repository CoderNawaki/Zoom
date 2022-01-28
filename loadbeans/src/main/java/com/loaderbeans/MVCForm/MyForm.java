package com.loaderbeans.MVCForm;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.loaderbeans.validation.MyValidation;


@MyValidation
public class MyForm {
    //first two rows  and value
    private String value;
    private boolean checked;

    //selected value for list and dropdown list
    private String selectedValue = "piyo";

    //adding row and removing row
    private List<Row> rows = new ArrayList<>();

    public void appendRow(){
        this.rows.add(new Row());
    }

    public void removeRow(int index){
        this.rows.remove(index);
    }
    public List<Row>getRows(){
        return rows;
    }
    public void setRows(List<Row>rows){
        this.rows=rows;
    }


    //dropdownlist value
    public Map<String, String> valueList() {

        Map<String, String> valuelist = new LinkedHashMap<>();
        valuelist.put("piyo", "PIYO");
        valuelist.put("hoge", "Hoge");
        valuelist.put("fuga", "Fuga");
        return valuelist;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;

    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    //class for row set
    public static class Row{
        private String value1;

        public String getValue() {
            return value1;
        }

        public void setValue(String value1) {
            this.value1 = value1;
        }

        
    }

    //form validation

    @Size(min=3)
    private String text;
    @Min(100)
    private Integer number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    

}
