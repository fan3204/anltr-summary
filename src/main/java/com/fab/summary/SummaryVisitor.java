package com.fab.summary;

import com.fab.summary.format.TxtFormatterBuilder;

public class SummaryVisitor extends SummaryParserBaseVisitor {

    private TxtFormatterBuilder txtBuilder;

    public SummaryVisitor(TxtFormatterBuilder txtBuilder) {
        this.txtBuilder = txtBuilder;
    }

    @Override
    public Object visitPoint(SummaryParser.PointContext ctx) {
        System.out.println(">>>>>1" + ctx.rightExpr.getText());
        this.txtBuilder.setPoint(ctx.rightExpr.getText());
        return super.visitPoint(ctx);
    }

    @Override
    public Object visitModule(SummaryParser.ModuleContext ctx) {
        System.out.println(">>>>>2" + ctx.rightExpr.getText());
        this.txtBuilder.setModule(ctx.rightExpr.getText());
        return super.visitModule(ctx);
    }

    @Override
    public Object visitType(SummaryParser.TypeContext ctx) {
        System.out.println(">>>>>3" + ctx.rightExpr.getText());
        this.txtBuilder.setType(ctx.rightExpr.getText());
        return super.visitType(ctx);
    }

    @Override
    public Object visitStatus(SummaryParser.StatusContext ctx) {
        System.out.println(">>>>>4" + ctx.rightExpr.getText());
        this.txtBuilder.setStatus(ctx.rightExpr.getText());
        return super.visitStatus(ctx);
    }

    @Override
    public Object visitIssue(SummaryParser.IssueContext ctx) {
        System.out.println(">>>>>5" + ctx.rightExpr.getText());
        this.txtBuilder.setIssue(ctx.rightExpr.getText());
        return super.visitIssue(ctx);
    }

    @Override
    public Object visitJira(SummaryParser.JiraContext ctx) {
        System.out.println(">>>>>6" + ctx.rightExpr.getText());
        this.txtBuilder.setJira(ctx.rightExpr.getText());
        return super.visitJira(ctx);
    }

//    @Override
//    public Object visitProg(SummaryParser.ProgContext ctx) {
//        System.out.println("这是什么鬼玩意儿" + ctx.toStringTree());
//        return super.visitProg(ctx);
//    }

//    @Override
//    public Object visitValue(SummaryParser.ValueContext ctx) {
//        return super.visitValue(ctx);
//    }

//    @Override
//    public Object visitExpression(SummaryParser.ExpressionContext ctx) {
//        Object obj = ctx.leftExpr.accept(this);
//
//        String left = String.valueOf(obj);
//
//        String summaryName = SummaryKeys.summaryDir.get(left);
//
//        if (summaryName == null) return null;
//
//        String right = "";
//        SummaryKeys.Keys key = SummaryKeys.Keys.valueOf(summaryName);
//
//        switch (key) {
//
//            case K_POINT:
//            case K_TYPE:
//            case K_STATUS:
//            case K_JIRA:
//            case K_ISSUE:
//            case K_MODULE:
//                right = ctx.rightExpr.getText();
//                break;
//            default:
//                right = "no things";
//        }
//
//        System.out.println("左青龙>>>" + left);
//        System.out.println("右白虎>>>" + right);
//
////        return super.visitExpression(ctx);
//        return left + right;
//    }



    @Override
    public Object visitOther(SummaryParser.OtherContext ctx) {
        System.out.println("Invalid input.");
        return super.visitOther(ctx);
    }

    @Override
    public Object visitExpression(SummaryParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitExpressions(SummaryParser.ExpressionsContext ctx) {
        return super.visitExpressions(ctx);
    }


    @Override
    public Object aggregateResult(Object aggregate, Object nextResult) {
        StringBuffer buffer = new StringBuffer();

        if (aggregate == null && nextResult == null)
        {
            return super.aggregateResult(aggregate, nextResult);
        }
        else
        {
            if (aggregate != null)
            {
                buffer.append(aggregate);
            }

            if (nextResult != null)
            {
                buffer.append(nextResult);
            }

            return buffer.toString();
        }
    }
}
