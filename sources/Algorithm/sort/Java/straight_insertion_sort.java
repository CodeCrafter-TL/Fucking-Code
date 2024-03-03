public static <T extends Comparable<T>> void straight_insertion_sort(T[] arr) {
    int j; // 当前被比较元素的索引
    for (int i = 1; i < arr.length; i++) {
        T tmp = arr[i]; // 取出不确定位置的元素
        for (j = i - 1; j >= 0 && tmp.compareTo(arr[j]) < 0; j--) // 稳定性关键点(1)
            arr[j + 1] = arr[j]; // 右移
        arr[j + 1] = tmp; // 插入
    }
}