package com.example.jdkdemo;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
@ManagedBean(name = "exampleBean")
public class ExampleBean implements Serializable {
    private String text = "CDI Example";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
