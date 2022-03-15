package cn.tust.model;

public class Scores {
    private Integer cnumber;
    private String cname;
    private String cteacher;
    private Integer cscore;

    public Scores() {
    }

    public Scores(Integer cnumber, String cname, String cteacher, Integer cscore) {
        this.cnumber = cnumber;
        this.cname = cname;
        this.cteacher = cteacher;
        this.cscore = cscore;
    }

    public Integer getCnumber() {
        return cnumber;
    }

    public void setCnumber(Integer cnumber) {
        this.cnumber = cnumber;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public Integer getCscore() {
        return cscore;
    }

    public void setCscore(Integer cscore) {
        this.cscore = cscore;
    }
}
