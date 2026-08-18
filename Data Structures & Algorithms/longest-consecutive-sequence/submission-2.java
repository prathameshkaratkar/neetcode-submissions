class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int longest = 1;

        for(int num : nums) {
            set.add(num);
        }

        for(int num : set) {
            // if there is no number befor num, it's the start of a sequence

            if( !set.contains( num - 1)) {
                int count = 1;
                int x = num;

                // kep the checking the next consecutive number

                while(set.contains(x + 1)) {
                    x = x + 1;

                    count = count + 1;
                }

                longest = Math.max(longest,count);
            }
            
        }
        return longest;


    }
}
