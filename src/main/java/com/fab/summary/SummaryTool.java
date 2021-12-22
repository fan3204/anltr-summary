package com.fab.summary;

import com.fab.summary.format.TxtFormatter;
import com.fab.summary.format.TxtFormatterBuilder;

import java.io.*;

public class SummaryTool {

    private static final String NEXT_LINE = "\n";

    private static final String VISITOR = "com.fab.summary.SummaryVisitor";

    private String inFilePath;

    private String outFilePath;

    private BufferedReader reader;

    private FileWriter writer;

    private SummaryTree tree = new SummaryTree();

    public SummaryTool(String inFilePath, String outFilePath) {
        this.inFilePath = inFilePath;
        this.outFilePath = outFilePath;
    }

    public static void main(String[] args) throws IOException, IllegalAccessException {
        String inputPath = "file/input.txt";
        String outputPath = "file/output.txt";
        SummaryTool tool = new SummaryTool(inputPath, outputPath);
        tool.summaryFormat();
    }

    public void summaryFormat() throws IOException {

        newReader();
        newWriter();

        String input;
        while ((input = reader.readLine()) != null) {
            if (input.isEmpty()) continue;
            String output = parse(input);
            print(output);
        }

        closeReader();
        closeWriter();
    }


    private String parse(String summary) {
        TxtFormatterBuilder builder = TxtFormatterBuilder.newBuilder();
//        SummaryVisitor visitor = new SummaryVisitor(builder);

        ParserProxy proxy = new ParserProxy(new SummaryVisitor(builder));
        SummaryVisitor visitor = (SummaryVisitor) proxy.getProxy();

        SummaryParser.ExpressionsContext expressions = tree.buildTree(summary).expressions();
        visitor.visit(expressions);

        String format = null;

        try {
            format = builder.build().format();
        } catch (IllegalAccessException e) {
            System.out.println("Invalid input summary");
//            e.printStackTrace();
        }
        return format;
//        return String.valueOf(obj);
    }


    private void print(String output) throws IOException {
        if (output == null) return;
        this.writer.write(output);
        this.writer.write(NEXT_LINE);
        this.writer.flush();

    }

    private void newReader() throws FileNotFoundException {
        File inFile = new File(this.inFilePath);
        FileReader fileReader = new FileReader(inFile);
        this.reader = new BufferedReader(fileReader);
    }

    private void newWriter() throws IOException {
        File outFile = new File(this.outFilePath);
        if (outFile.exists()) {
            outFile.delete();
            outFile.createNewFile();
        } else {
            outFile.createNewFile();
        }
        this.writer = new FileWriter(outFile);
    }

    private void closeReader() throws IOException {
        if (this.reader != null) {
            this.reader.close();
        }
    }

    private void closeWriter() throws IOException {
        if (this.writer != null) {
            this.writer.close();
        }
    }

}
