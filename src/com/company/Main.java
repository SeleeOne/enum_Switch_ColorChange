package com.company;
enum Colors {
    red, green, yellow
}

class Traffic {
    Colors cl = Colors.red;

    public void colorChange() {
        switch (cl) {
            case red: cl = Colors.yellow; break;
            case yellow: cl = Colors.green; break;
            case green: cl = Colors.red; break;
        }
    }
    public String toString(){
        return " " + cl;
    }
}

public class Main {
    public static void main(String[] args) {
        Traffic tr = new Traffic();
        for (int i=0; i<9; i++) {
            System.out.println(tr);
            tr.colorChange();
        }
    }
}
