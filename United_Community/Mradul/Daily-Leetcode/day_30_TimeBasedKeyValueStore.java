// https://leetcode.com/problems/time-based-key-value-store/


class TimeMap {
    // Map to Strore the value with time stamp 
    // (Stores the key key with the value value at the given time timestamp.) [Second point]
    private final Map<String, TreeMap<Integer, String>> data;

    public TimeMap() {
        // make the thing
        this.data = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        // if the key is not present make a new key
        // but if the Key is present add the stuff
        data.computeIfAbsent(key, k -> new TreeMap<>()).put(timestamp, value); 
    }
    
    public String get(String key, int timestamp) {
        // if note ther retuen a Empty string
        if (!data.containsKey(key)) {
            return "";
        }
        // if key is ther get it 
        TreeMap<Integer, String> treeMap = data.get(key);
        // Find the greatest key less than or equal to the given timestamp
        Integer floorTimestamp = treeMap.floorKey(timestamp);
        // If a valid floor timestamp is found, return the corresponding value; otherwise, return an empty string
        return (floorTimestamp != null) ? treeMap.get(floorTimestamp) : "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */