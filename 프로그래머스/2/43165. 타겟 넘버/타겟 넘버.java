class Solution {
    static public int solve(int[] numbers, int target, int index, int sum) {
        
        if(numbers.length == index) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }
        
        return solve(numbers, target, index+1, sum+numbers[index]) + solve(numbers, target, index+1, sum-numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer = solve(numbers, target, 0, 0);
        
        return answer;
    }
}