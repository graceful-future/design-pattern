package com.gracefulfuture.design.pattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
* @description      对象结构-材料集
* @author           chenkun
* @create           2021/5/24 10:41
* @version          1.0
*/
public class MaterialSet {
    private List<Material> materials = new ArrayList<>();

    public void add(Material material){
        materials.add(material);
    }

    public void remove(Material material){
        materials.remove(material);
    }

    public String accept(Company company){
        Iterator iterator = materials.iterator();
        String temp = "";
        while (iterator.hasNext()){
            Material material = (Material) iterator.next();
            temp += material.accept(company) + " ";
        }
        return temp;
    }

}
