class Volume {  
    int length;
    int breath;
    int height;
    int volume;
    
    Volume(int length,int breath,int height){
        this.length=length;
        this.breath=breath;
        this.height=height;
    }

    int calVolume(){
        volume = length * breath * height;
        return volume;
    }

}



public class Program6 {
    public static void main(String[] args) {
        Volume v = new Volume(2,3,4);
        System.out.println("volume of cuboid with L:3 , B:3, H:4 is: " + v.calVolume());
    }
}
