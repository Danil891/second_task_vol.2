public class Pair {
    private  Integer first;
    private  String second;
    public Pair(Integer first, String second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(Integer first){
        this.first = first;
    }

    public  void setSecond(String second){
        this.second = second;
    }

    public Integer first(){
        return first;
    }

    public String second(){
        return second;
    }

    @Override
    public String toString(){
        return first + " " + second;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        Pair pair = (Pair) object;
        return first.equals(pair.first) && second.equals(pair.second);
    }
}
