package org.kang.springsutdymvn013.props;

import org.kang.springsutdymvn013.entities.MyPojo;

import java.util.ArrayList;
import java.util.List;

public class ThirdProperties {
    private final List<MyPojo> list = new ArrayList<>();
    public List<MyPojo> getList() {
        return this.list;
    }

}
