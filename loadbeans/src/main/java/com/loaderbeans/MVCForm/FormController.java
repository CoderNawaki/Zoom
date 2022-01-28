package com.loaderbeans.MVCForm;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/form")
public class FormController {

    @GetMapping
    public String init(Model model) {
        model.addAttribute(new MyForm());
        return "forms/form";

    }

    @PostMapping
    public String submit(@Validated  MyForm form, BindingResult result) {
        System.out.println("form value=" + form.getValue());
        System.out.println("form.selectedValue="+form.getSelectedValue());
        System.out.println("*****");
        System.out.println("form="+form);
        System.out.println("result="+result);
        System.out.println("*******");
        System.out.println(form.getText());
        System.out.println(form.getNumber());
        return "forms/form";
    }

    @PostMapping(params="appendRow")
    public String appendRow(MyForm form){
        form.appendRow();
        this.printRows(form);
        return "forms/form";
    }

    @PostMapping(params = "removeIndex")
    public String submit(MyForm form,@RequestParam int removeIndex){
        form.removeRow(removeIndex);
        this.printRows(form);
        return "forms/form";
    }

    private void printRows(MyForm form){
        List<MyForm.Row>rows = form.getRows();
        for(int i=0;i<rows.size();i++){
            MyForm.Row row = rows.get(i);
            System.out.println("i="+i+" ,row.value="+row.getValue());
        }
    }
}
