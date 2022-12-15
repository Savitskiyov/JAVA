package OOP_Seminar_1.DZ;

import java.io.*;
import java.util.ArrayList;


public class WriteFile {
    ArrayList<Node> tree;
    ArrayList<String> result = new ArrayList<>();

    public WriteFile(GeoTree geoTree) {
        tree = geoTree.getTree();

    }

    public ArrayList<String> spend() {
        for (Node t : tree) {
            result.add(t.p1.fullName + " " + t.re + " " + t.p2.fullName);
        }


        return result;
    }
}