public class DVD extends Libraryitem{
    private float duration;

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @Override
    public void displayInfo(){

        System.out.println(this.duration);
    }
}
