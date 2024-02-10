public static int findMajority(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            if (!countMap.containsKey(num)) {
                countMap.put(num, 1);
            } else {
                countMap.put(num, countMap.get(num) + 1);
            }
            if (countMap.get(num) > array.length / 2) {
                return num;
            }
        }
        return -1;
    }