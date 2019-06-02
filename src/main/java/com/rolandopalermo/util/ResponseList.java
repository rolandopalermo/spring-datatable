/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolandopalermo.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

/**
 *
 * @author Rolando
 */
public class ResponseList<T> extends ArrayList<T> {

    private static final long serialVersionUID = 6447038929460803595L;

    public ResponseList() {
        super();
    }

    public ResponseList(Collection<? extends T> c) {
        super(c);
    }

    public ResponseList(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public String toString() {
        String json = null;
        ArrayNode array = JsonNodeFactory.instance.arrayNode();
        if (this.size() > 0) {
            for (Iterator<T> it = this.iterator(); it.hasNext();) {
                T type = it.next();
                array.add(JsonConverter.INSTANCE.stringToJson(type.toString()));
            }
        }
        try {
            json = JsonConverter.INSTANCE.asJsonString(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

}
