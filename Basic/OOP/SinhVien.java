package OOP;
import OOP.MainSub;
public class SinhVien {
    private String name;
    //thay doi
    public void setName(String newName){
        name = newName;
    }

    //out 
    public String getName(){
        return name;
    }

    //khoi tao
    SinhVien(String name){
        this.name = name;
    }
    public void inn(){
        System.out.println("xin chao");
    }
}
