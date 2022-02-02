package com.lsj.composite;

import java.util.ArrayList;
import java.util.List;

/*Composite 에 해당하는 클래스*/
public abstract class Container implements Component {

    protected List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }
}
