class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
     int n = customers.length;
        int fixed = 0;   
        int recover = 0; 
        int maxRecover = 0; 
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                fixed += customers[i];
            }
        }
        for (int i = 0; i < minutes; i++) {
            if (grumpy[i] == 1) {
                recover += customers[i];
            }
        }
        maxRecover = recover;
        for (int i = minutes; i < n; i++) {
            if (grumpy[i - minutes] == 1) {
                recover -= customers[i - minutes];
            }
            if (grumpy[i] == 1) {
                recover += customers[i];
            }
            maxRecover = Math.max(maxRecover, recover);
        }

        return fixed + maxRecover;   
    }
}
