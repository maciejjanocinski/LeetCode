package soulutions.easy.pathCrossing;

import java.util.HashSet;

public class PathCrossing {
    HashSet<String> list = new HashSet<>();
    int x = 0;
    int y = 0;

    public boolean isPathCrossing(String path) {
        list.add(x +" " + y);
        for (String s : path.split("")
        ) {
            switch (s) {
                case "N":
                    y++;
                    if(list.contains(x +" " + y)) return true;
                    list.add(x +" " + y);
                    break;
                case "E":
                    x++;
                    if(list.contains(x +" " + y)) return true;
                    list.add(x +" " + y);
                    break;
                case "S":
                    y--;
                    if(list.contains(x +" " + y)) return true;
                    list.add(x +" " + y);
                    break;
                case "W":
                    x--;
                    if(list.contains(x +" " + y)) return true;
                    list.add(x +" " + y);
                    break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PathCrossing pathCrossing = new PathCrossing();
        System.out.println(pathCrossing.isPathCrossing("NESWW"));
    }

}
