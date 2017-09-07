/**
 * This is a Java-port of Mark Nelson's C++ implementation of Ukkonen's algorithm.
 * http://illya-keeplearning.blogspot.com/2009/04/suffix-trees-java-ukkonens-algorithm.html
 */

package com.blogspot.illyakeeplearning.suffixtree;

public class Node {
    public int suffix_node;

    public Node() {
        this.suffix_node = -1;
    }

    public static int Count = 1;
}
