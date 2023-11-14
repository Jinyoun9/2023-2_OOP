public class Homework6 {

    static class Course{
        String code;
        String name;

        public Course(String code, String name){
            this.code = code;
            this.name = name;
        }
        String getCode(){
            return code;
        }
        String getName(){
            return name;
        }
    }
    static class OnlineCourse extends Course{
        public OnlineCourse(String code, String name){
            super(code, name);
        }
        @Override
        public String toString(){
            return ("Code: " + code + ", Name: " + name + ", Type:Online");
        }
    }
    static class OfflineCourse extends Course{
        public OfflineCourse(String code, String name){
            super(code, name);
        }
        @Override
        public String toString(){
            return ("Code: " + code + ", Name: " + name + ", Type:Offline");
        }
    }
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
