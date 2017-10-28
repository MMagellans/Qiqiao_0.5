package com.qiqiao.dto;

public class RoleDto {
    private Long id;

    private String name;

    private String description;

    private Integer mincredits;

    private Integer stars;

    private Integer roletype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMincredits() {
        return mincredits;
    }

    public void setMincredits(Integer mincredits) {
        this.mincredits = mincredits;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getRoletype() {
        return roletype;
    }

    public void setRoletype(Integer roletype) {
        this.roletype = roletype;
    }
}