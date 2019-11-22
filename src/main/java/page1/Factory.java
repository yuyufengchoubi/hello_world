package page1;

public class Factory {

    private Hello hello;

    public Factory(Hello hello){
        this.hello=hello;
    }

    public World getWorld(){
        return new World();
    }


    public Hello getHello(){
        return this.hello;
    }

}
