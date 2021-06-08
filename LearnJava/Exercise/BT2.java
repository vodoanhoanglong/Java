/*
Có n cuộc họp đang cần được tổ chức tại một phòng họp. Thời gian bắt đầu và kết thúc của các cuộc họp được biểu diễn bằng mảng các số nguyên dương s và f. 
Biết tại 1 thời điểm trong phòng chỉ có thể có nhiều nhất 1 cuộc họp, bạn hãy tìm cách sắp xếp để số cuộc họp là nhiều nhất có thể. 
*/
public class BT2 {
    private static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    private static int meetingRoom(int[] s, int[] f) {
        if (s.length == 1)
            return 1;
        for (int i = 0; i < f.length; i++) {
            for (int j = i + 1; j < f.length; j++) {
                if (f[j] < f[i]) {
                    swap(f[j], f[i]);
                    swap(s[j], s[i]);
                }
            }
        }
        int res = 1, j = 0, i;
        for (int k = 0; k < f.length; k++) {
            if (s[k] >= f[j]) {
                res++;
                j = k;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] s = { 1, 2, 3, 5 };
        int[] f = { 2, 4, 6, 8 };
        System.out.println(meetingRoom(s, f));

        int[] s2 = { 1, 3 };
        int[] f2 = { 3, 5 };
        System.out.println(meetingRoom(s2, f2));

    }
}