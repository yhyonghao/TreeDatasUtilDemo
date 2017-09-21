package com.example.pc.treedatasutildemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinkedList<SimpleNode> list = new LinkedList<SimpleNode>();
        list.add(new SimpleNode("B2", "B"));
        list.add(new SimpleNode("D", "A"));
        list.add(new SimpleNode("C2", "C"));
        list.add(new SimpleNode("C12", "C1"));
        list.add(new SimpleNode("D11", "D1"));
        list.add(new SimpleNode("B1", "B"));
        list.add(new SimpleNode("B11", "B1"));
        list.add(new SimpleNode("B12", "B1"));
        list.add(new SimpleNode("C11", "C1"));
        list.add(new SimpleNode("B22", "B2"));
        list.add(new SimpleNode("C1", "C"));
        list.add(new SimpleNode("B", "A"));
        list.add(new SimpleNode("D1", "D"));
        list.add(new SimpleNode("C", "A"));

        SimpleNode root = new SimpleNode("A", null);
        root = TreeUtil.getTree(root, list);

        TreeUtil.printTreeByDepthFirstTraversal(root);

    }
}
