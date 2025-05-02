package practice_2.structural.facade.smart_door;

public class SmartDoor {
    //facade
    DoorCloser closer;
    DoorLocker locker;
    DoorOpener opener;

    public SmartDoor(DoorCloser closer, DoorLocker locker, DoorOpener opener) {
        this.closer = closer;
        this.locker = locker;
        this.opener = opener;
    }

    public void open(){
        locker.unlock();
        opener.open();
    }

    public void close(){
        closer.close();
        locker.lock();
    }

    public void lockOnly(){
        locker.lock();
    }

    public void unlockOnly(){
        locker.unlock();
    }

    @Override
    public String toString() {
        return "SmartDoor{" +
                "closer=" + closer +
                ", locker=" + locker +
                ", opener=" + opener +
                '}';
    }
}
