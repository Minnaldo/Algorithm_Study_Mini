
import java.util.Scanner;

public class 상호의배틀필드_인호우공주 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            char[][] bf = new char[H][W];
            for (int i = 0; i < H; i++) {
                String input = sc.next();
                bf[i] = input.toCharArray();
            }
            int N = sc.nextInt();
            char[] order = new char[N];
            String input = sc.next();
            order = input.toCharArray();
            int x = 0;
            int y = 0;
            for (int i = 0; i < bf.length; i++) {
                for (int j = 0; j < bf[i].length; j++) {
                    if(bf[i][j] == '<' || bf[i][j] == 'v' || bf[i][j] == '^' || bf[i][j] == '>') {
                        x = i;
                        y = j;
                    }
                }
            }
            for (int k = 0; k < order.length; k++) {
                if(order[k] == 'U') {
                    bf[x][y] = '^';
                    if(x-1 >= 0) {
                        if(bf[x-1][y] == '.') {
                            bf[x][y] = '.';
                            bf[x-1][y] = '^';
                            x = x-1;
                        }
                    }
                }else if(order[k] == 'D') {
                    bf[x][y] = 'v';
                    if(x+1 < H) {
                        if(bf[x+1][y] == '.') {
                            bf[x][y] = '.';
                            bf[x+1][y] = 'v';
                            x = x+1;
                        }
                    }
                }else if(order[k] == 'R') {
                    bf[x][y] = '>';
                    if(y+1 < W) {
                        if(bf[x][y+1] == '.') {
                            bf[x][y] = '.';
                            bf[x][y+1] = '>';
                            y = y+1;
                        }
                    }
                }else if(order[k] == 'L') {
                    bf[x][y] = '<';
                    if(y-1 >= 0) {
                        if(bf[x][y-1] == '.') {
                            bf[x][y] = '.';
                            bf[x][y-1] = '<';
                            y = y-1;
                        }
                    }
                }else if(order[k] == 'S') {
                    if(bf[x][y] == '<') {
                        for (int i = y-1; i >= 0; i--) { // 벽, 강철벽 등
                            if(bf[x][i]=='#') {
                                break;
                            }
                            if(bf[x][i]=='*') {
                                bf[x][i] = '.';
                                break;
                            }
                        }
                    }else if(bf[x][y] == 'v') {
                        for (int i = x+1; i < H; i++) {
                            if(bf[i][y]=='#') {
                                break;
                            }
                            if(bf[i][y]=='*') {
                                bf[i][y] = '.';
                                break;
                            }
                        }
                    }else if(bf[x][y] == '^') {
                        for (int i = x-1; i >= 0; i--) {
                            if(bf[i][y]=='#') {
                                break;
                            }
                            if(bf[i][y]=='*') {
                                bf[i][y] = '.';
                                break;
                            }
                        }
                    }else if(bf[x][y] == '>') {
                        for (int i = y+1; i < W; i++) {
                            if(bf[x][i]=='#') {
                                break;
                            }
                            if(bf[x][i]=='*') {
                                bf[x][i] = '.';
                                break;
                            }
                        }
                    }
                }
            }
            System.out.print("#"+tc+" ");
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print(bf[i][j]);
                }System.out.println();
            }
        }
    }
}