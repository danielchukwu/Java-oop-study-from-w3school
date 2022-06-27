public class Interfaces {
    // What are Interfaces? (alternatives for abstract)
    // - They are complete abstract classes
    // - Interface methods are abstract and abstract methods have no body
}

interface Skills {
    // In interfaces the methods are by default abstract and public
    void engineer();
}

class YoungMan implements Skills {
    public void engineer(){
        System.out.println("Engineer solves: a python problem");
    }
}

class NowReady {
    public static void main(String [] args){
        YoungMan nathan = new YoungMan();
        nathan.engineer();
    }

}
