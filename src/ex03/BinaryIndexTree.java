package ex03;

import java.util.Arrays;

class BinaryIndexedTree {
    int[] arr;
    int size;
    int loop;

    public BinaryIndexedTree(int[] arr) {
        this.size = arr.length;
        this.arr = arr;
        this.loop = 0;
    }


    // 특정 값의 인덱스를 찾기 위한 이진 탐색
    public int binarySearch(int target) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            loop++;
            int mid = low + (high - low) / 2;
            System.out.println("mid : " + mid);

            if (target == arr[mid]) {
                return mid; // 찾은 경우
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // 찾지 못한 경우
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("배열: " + Arrays.toString(arr));

        BinaryIndexedTree bit = new BinaryIndexedTree(arr);

        int targetValue = 4;

        // 이진 탐색을 사용하여 숫자 7의 인덱스 찾기
        int foundIndex = bit.binarySearch(targetValue);

        if (foundIndex != -1) {
            System.out.println("배열에서 " + targetValue + "이 존재하는 위치 : " + foundIndex);
            System.out.println("총 " + bit.loop + "번의 검색이 필요했습니다.");
        } else {
            System.out.println(targetValue + "은(는) 배열에서 찾을 수 없습니다.");
        }
    }
}

