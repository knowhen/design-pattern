package com.when.design_pattern.composite_pattern.file;

/**
 * @author: when
 * @create: 2020-03-18  09:57
 * <p>
 * file directory structure
 * * /
 * * /w/
 * * /w/a.txt
 * * /w/b.txt
 * * /w/movies/
 * * /w/movies/c.avi
 * * /k/
 * * /k/docs/
 * * /k/docs/d.txt
 * *
 **/
public class App {
    public static void main(String[] args) {
        Directory fileSystemTree = new Directory("/");
        Directory node_w = new Directory("/w/");
        Directory node_k = new Directory("/k/");
        fileSystemTree.addSubNode(node_w);
        fileSystemTree.addSubNode(node_k);

        File node_w_a = new File("/w/a.txt");
        File node_w_b = new File("/w/b.txt");
        Directory node_w_movies = new Directory("/w/movies/");
        node_w.addSubNode(node_w_a);
        node_w.addSubNode(node_w_b);
        node_w.addSubNode(node_w_movies);

        File node_w_movies_c = new File("/w/movies/c.avi");
        node_w_movies.addSubNode(node_w_movies_c);

        Directory node_k_docs = new Directory("/k/docs/");
        node_k.addSubNode(node_k_docs);

        File node_k_docs_d = new File("/k/docs/d.txt");
        node_k_docs.addSubNode(node_k_docs_d);

        System.out.println("/ files num:" + fileSystemTree.countNumOfFiles());
        System.out.println("/w files num:" + node_w.countNumOfFiles());
    }
}
