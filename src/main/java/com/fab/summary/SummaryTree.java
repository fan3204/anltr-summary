package com.fab.summary;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class SummaryTree {

    SummaryParser buildTree(String expression) {
        CharStream stream = CharStreams.fromString(expression);
        SummaryLexer lexer = new SummaryLexer(stream);
        return new SummaryParser(new CommonTokenStream(lexer));
    }
}
