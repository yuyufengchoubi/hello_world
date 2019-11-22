package page1;

public class ClientService {
    private static ClientService clientService=new ClientService();

    private ClientService(){

    }

    /**
     *
     * @return
     */
    public static ClientService getInstance(){
        return clientService;
    }

    public void say(){
        System.out.println("我是通过静态工厂方法创建的");
    }
}
