package com.fab.summary.format;

/**
 * TODO
 *
 * @author fab
 * @date 2021/12/18
 */
public  class TxtFormatterBuilder {

    private String point;

    private String module;

    private String type;

    private String status;

    private String issue;

    private String jira;

    public static TxtFormatterBuilder newBuilder()
    {
        return new TxtFormatterBuilder();
    }

    private TxtFormatterBuilder() {};

    public TxtFormatter build() throws IllegalAccessException {
        if (this.point == null || this.point.isEmpty())
        {
            throw new IllegalAccessException("...");
        }

        if (this.module == null || this.module.isEmpty())
        {
            throw new IllegalAccessException("...");
        }

        if (this.type == null || this.type.isEmpty())
        {
            throw new IllegalAccessException("...");
        }

        if (this.status == null || this.status.isEmpty())
        {
            throw new IllegalAccessException("...");
        }

        if (this.issue == null || this.issue.isEmpty())
        {
            throw new IllegalAccessException("...");
        }

        return new TxtFormatter(this);
    }


    public void setPoint(String point) {
        this.point = point;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setJira(String jira) {
        this.jira = jira;
    }

    public String getPoint() {
        return point;
    }

    public String getModule() {
        return module;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getIssue() {
        return issue;
    }

    public String getJira() {
        return jira;
    }
}
