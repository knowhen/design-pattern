package com.when.design_pattern.visitor_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: when
 * @create: 2020-04-20  16:05
 **/
public class App {
    public static void main(String[] args) {
        List<ResourceFile> files = new ArrayList<>();
        files.add(new WordFile("a.word"));
        files.add(new WordFile("b.word"));
        files.add(new PdfFile("c.pdf"));

        Extractor extractor = new Extractor();
        Compressor compressor = new Compressor();
        for (ResourceFile file : files) {
            file.accept(extractor);
            file.accept(compressor);
        }
    }
}
