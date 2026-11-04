import java.util.List;
import java.util.ArrayList;

class OrderedStream {
    private String[] values;
    private int ptr;

    public OrderedStream(int n) {
        this.values = new String[n];
        this.ptr = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        this.values[idKey-1] = value;
        List<String> result = new ArrayList<>();

        while (ptr <= this.values.length && values[ptr-1] != null) {
            result.add(this.values[ptr-1]);
            ptr++;
        }
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */