package com.qiqiao.dto;

import java.util.Date;

public class TopicDto {
    private Long id;

    private String title;

    private Date posttime;

    private String ipaddr;

    private Integer topscope;

    private Integer replycount;

    private Integer visits;

    private Integer isattach;

    private String highcolor;

    private Boolean digest;

    private Boolean recommend;

    private Integer state;

    private Long boardid;

    private Long sectionid;

    private Long userid;

    private Long lastreplyid;

    private Date lastupdatetime;

    private Integer param;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    public Integer getTopscope() {
        return topscope;
    }

    public void setTopscope(Integer topscope) {
        this.topscope = topscope;
    }

    public Integer getReplycount() {
        return replycount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
    }

    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    public Integer getIsattach() {
        return isattach;
    }

    public void setIsattach(Integer isattach) {
        this.isattach = isattach;
    }

    public String getHighcolor() {
        return highcolor;
    }

    public void setHighcolor(String highcolor) {
        this.highcolor = highcolor == null ? null : highcolor.trim();
    }

    public Boolean getDigest() {
        return digest;
    }

    public void setDigest(Boolean digest) {
        this.digest = digest;
    }

    public Boolean getRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getBoardid() {
        return boardid;
    }

    public void setBoardid(Long boardid) {
        this.boardid = boardid;
    }

    public Long getSectionid() {
        return sectionid;
    }

    public void setSectionid(Long sectionid) {
        this.sectionid = sectionid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getLastreplyid() {
        return lastreplyid;
    }

    public void setLastreplyid(Long lastreplyid) {
        this.lastreplyid = lastreplyid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getParam() {
        return param;
    }

    public void setParam(Integer param) {
        this.param = param;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}