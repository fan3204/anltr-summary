package com.fab.summary.format;

/**
 * TODO
 *
 * @author fab
 * @date 2021/12/18
 */
public class TxtFormatter implements Formatter {

    private String point;

    private String module;

    private String type;

    private String status;

    private String issue;

    private String jira;

    public TxtFormatter(TxtFormatterBuilder builder) {
        this.point = builder.getPoint();
        this.module = builder.getModule();
        this.type = builder.getType();
        this.status = builder.getStatus();
        this.issue = builder.getIssue();
        this.jira = builder.getJira();
    }

    @Override
    public String format() {
        return "【" +  this.point + "】"
                + "【" +  this.module + "】"
                + "【" +  this.type + "】"
                + "【" +  this.status + "】"
                + this.issue;
    }

    @Override
    public void clear() {
        this.point = null;
        this.module = null;
        this.type = null;
        this.status = null;
        this.issue = null;
        this.jira = null;
    }
}
