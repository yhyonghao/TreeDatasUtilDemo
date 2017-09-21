package com.example.pc.treedatasutildemo;

/**
 * Created by pc on 2017/9/21.
 */
import java.util.List;

/**
 * add by ak on 2013-11-28
 */
public  interface InheritedNode<T> {

    boolean isChildFrom(T node);
    boolean isBrother(T node);
    void addChildNode(T node);
    List<T> getChildNodes();

}