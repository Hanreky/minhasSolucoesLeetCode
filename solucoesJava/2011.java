class Solution {
    public int finalValueAfterOperations(String[] operations) {
        HashMap<String, Integer> operation = new HashMap<>();

        int x = 0;
        operation.put("++X", 1);
        operation.put("X++", 1);
        operation.put("--X", -1);
        operation.put("X--", -1);

        for(String o : operations){
            x = x + operation.get(o);
        }

        return x;
    }
}
