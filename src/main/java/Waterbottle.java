public class Waterbottle {
    private int volume = 100;


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){
        int newVolume = getVolume() - 10;
        setVolume(newVolume);
    }

    public void empty(){
        setVolume(0);
    }

    public void fill(){
        setVolume(100);
    }

}
