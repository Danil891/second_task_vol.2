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
}
