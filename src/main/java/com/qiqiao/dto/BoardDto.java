package com.qiqiao.dto;

import java.util.Date;

public class BoardDto {
    private Long id;

    private String name;

    private String description;

    private Integer topiccount;

    private Integer articlecount;

    private Date createtime;

    private Integer sortnum;

    private Integer state;

    private String highcolor;

    private String icon;

    private String allowrole;

    private Long lasttopicid;

    private Long sectionid;

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

    public Integer getTopiccount() {
        return topiccount;
    }

    public void setTopiccount(Integer topiccount) {
        this.topiccount = topiccount;
    }

    public Integer getArticlecount() {
        return articlecount;
    }

    public void setArticlecount(Integer articlecount) {
        this.articlecount = articlecount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getHighcolor() {
        return highcolor;
    }

    public void setHighcolor(String highcolor) {
        this.highcolor = highcolor == null ? null : highcolor.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getAllowrole() {
        return allowrole;
    }

    public void setAllowrole(String allowrole) {
        this.allowrole = allowrole == null ? null : allowrole.trim();
    }

    public Long getLasttopicid() {
        return lasttopicid;
    }

    public void setLasttopicid(Long lasttopicid) {
        this.lasttopicid = lasttopicid;
    }

    public Long getSectionid() {
        return sectionid;
    }

    public void setSectionid(Long sectionid) {
        this.sectionid = sectionid;
    }
}