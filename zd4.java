public class zd4 {

    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    for (int l = 0; l < 9; l++) {
                        for (int o = 0; o < 9; o++) {
                             for (int p = 0; p < 9; p++) {
                                if ((i * 10 + j) + (k * 10 + l) == (o * 10 + p)) {
                                    int a = i * 10 + j;
                                    int b = k * 10 + l;
                                    int c = o * 10 + p;
                                     System.out.printf("%d + %d = %d   ", a, b, c);
                                 }
                            }
                         }
                    }
                 }
            }
        }
    }
}