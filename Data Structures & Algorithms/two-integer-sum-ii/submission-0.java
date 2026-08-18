class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int  j = numbers.length - 1;
        for(int i = 0; i < numbers.length;) {
            int sum = numbers[i] + numbers[j];

            if(sum == target) {
                return new int[] {i+1,j+1};
            }

            if(sum > target) {
                j--;
            }

            if(sum < target) {
                i++;
            }
        }

        return new int[] {};
    }
}
