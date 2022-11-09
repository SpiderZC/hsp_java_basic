
public class MiGong {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        
        for (int i = 0; i < map[0].length; i++) {
           map[0][i] = 1;
           map[7][i] = 1; 
        }

        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }

        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;

        T t = new T();
        // 初始位置：1，1
        t.findWay(map, 1, 1);
        // t.findWay2(map, 1, 1);

        for (int i = 0; i < map.length; i++) {
           for (int j = 0; j < map[i].length; j++) {
               System.out.print(map[i][j] + "  ");
           } 
           System.out.println();
        }
    }
}

class T {

    // 0. 表示可以走的路; 1. 表示墙； 2. 表示走过了的通路； 3. 表示死路
    // 位置 6, 5 == 2 end
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if(map[i][j] == 0) {
                // 下 -> 右 -> 上 -> 左
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public boolean findWay2(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if(map[i][j] == 0) {
                // 上 -> 右 -> 下 -> 左
                map[i][j] = 2;
                if (findWay2(map, i - 1, j)) {
                    return true;
                } else if (findWay2(map, i, j + 1)) {
                    return true;
                } else if (findWay2(map, i + 1, j)) {
                    return true;
                } else if (findWay2(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
