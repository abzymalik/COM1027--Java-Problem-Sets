package labs.Week_07;

import java.util.*;

public class Example4 {
    private Map<String, Double> values;

    public Example4() {
        this.values = new HashMap<String, Double>();
    }

    public void addElement(String key, double value) {
        this.values.put(key.toUpperCase(), value);
    }

    public void removeElement(String key) {
        if (checkIfElementExists(key)) {
            this.values.remove(key.toUpperCase());
        }
    }

    private boolean checkIfElementExists(String key) {
        return this.values.containsKey(key.toUpperCase());
    }

    public Double retrieveElement(String key) {
        return this.values.getOrDefault(key.toUpperCase(), null);
    }

    public String displayMap() {
        StringBuilder output = new StringBuilder();
        for (Map.Entry<String, Double> entry : values.entrySet()) {
            output.append("Key: ").append(entry.getKey()).append(" Value: ").append(entry.getValue()).append("\n");
        }
        return output.toString();
    }

    public String displayOrderedMap() {
        StringBuilder output = new StringBuilder();
        List<String> keys = new ArrayList<>(values.keySet());
        Collections.sort(keys);
        output.append("Ordered Map\n");
        for (String key : keys) {
            output.append("Key: ").append(key).append(" Value: ").append(values.get(key)).append("\n");
        }
        return output.toString();
    }

    public double calculateAverage() {
        if (values.isEmpty()) return 0;
        double sum = 0;
        for (double value : values.values()) {
            sum += value;
        }
        return sum / values.size();
    }
    
    public static void main(String[] args) {
        Example4 test = new Example4();
        
        test.addElement("COM1025", 85.0);
        test.addElement("COM1026", 90.5);
        test.addElement("COM1027", 78.3);
        
        System.out.println(test.displayMap());
        
        System.out.println("Retrieve COM1025: " + test.retrieveElement("COM1025"));
        System.out.println("Retrieve COM1028 (not present): " + test.retrieveElement("COM1028"));
        
        test.removeElement("COM1027");
        System.out.println(test.displayMap());
        
        System.out.println(test.displayOrderedMap());
        
        System.out.println("Average Grade: " + test.calculateAverage());
    }
} 
    
    
    
    
    
