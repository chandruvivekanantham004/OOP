package Interface;

public class NiceCar {
    private Engine engine;
    private CDplayer Music = new CDplayer();
    public NiceCar() {
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public NiceCar(int n){
        this.engine=new ElectricEngine();
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        Music.start();
    }
    public void stopMusic(){
        Music.stop();
    }
    public void upgradeEngine(){
        this.engine=new PowerEngine();
    }
}
