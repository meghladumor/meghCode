package com.pragra;

public  final class immutableClass {

    // no one can modify the object of it, no inheritance , no setters methods

    private final int id;
    private final String name;

    public immutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
