package com.example.demo.data;

import androidx.databinding.ObservableField;

public class UserBean {
    // 被观察的属性（切记：必须是public修饰符，因为是DataBinding的规范）
    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> pwd = new ObservableField<>();

    @Override
    public String toString() {
        return "UserBean{" +
                "name=" + name.get() +
                ", pwd=" + pwd.get() +
                '}';
    }
}
