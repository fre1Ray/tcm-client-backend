package com.example.tcm.pojo;

import java.util.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Menu {
    private Integer id;
    private Integer parentId;
    private String text;
    private String url;
    private Integer userId;
    private Map<String, Object> attributes = new HashMap<>();
    private List<Menu> children = new ArrayList<>();

    public Menu() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Menu(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}
