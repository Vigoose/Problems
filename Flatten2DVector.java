public class Vector2D implements Iterator<Integer> {
    int listIndex;
    int elementIndex;
    List<List<Integer>> list;


    public Vector2D(List<List<Integer>> vec2d) {
        // Initialize your data structure here
        listIndex = 0;
        elementIndex = 0;
        list = vec2d;
    }

    @Override
    public Integer next() {
        return list.get(listIndex).get(elementIndex++);

    }

    @Override
    public boolean hasNext() {
        while (listIndex < list.size()){
            if (elementIndex < list.get(listIndex).size()){
                return true;
            }else{
                listIndex++;
                elementIndex = 0;
            }
            
        }
        return false;

    }

    @Override
    public void remove() {
        list.remove(listIndex);
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D i = new Vector2D(vec2d);
 * while (i.hasNext()) v[f()] = i.next();
 */
