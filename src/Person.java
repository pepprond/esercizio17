public class Person {
    public int age;

    public Person(){
        this.age=(int) (Math.random()* (80-5-1)+5);
    }
    public String getLifeStage(){

        if (this.age<=12){
            return "child";
        } else if (this.age>12 && this.age<=19) {
            return  "teen";
        } else if (this.age>19&&this.age<=59) {
            return "adult";
        }else {
            return "senior adult";
        }
    }
}
