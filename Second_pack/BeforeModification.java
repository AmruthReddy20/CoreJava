package JavaAssignments.Second_pack;

interface OsSupport{ // doesnt support I
    void QuickLook();
    void DeleteFile();
}
class  OperatingSystem{
    Windows windows=new Windows();   // Doesnt support D
     public String nameOfOS(){
         return null;
     };  // multiple responsibilities
     void DevicesSupported(){}; // doesn't support S
     void Cost(){};  // doesn't support S
     void QuickLook(){}; // doesnt support L
}
class namesOfOperatingSystems{ // doesn't support O
     String nameofOS(OperatingSystem os){
       if(os.equals("Mac"))
           return "MAC Operating System";
       if(os.equals("JavaAssignments.Second_pack.Windows"))
            return "JavaAssignments.Second_pack.Windows Operating System";
        if(os.equals("Linux"))
            return "Linux Operating System";
        // If another OS then you shld add another condition
          return null;
    }
}
class Windows implements OsSupport {
    public String nameOfOS() {
        return "JavaAssignments.Second_pack.Windows";
    }
    @Override
    public void QuickLook() {
        // return an Exception
    }
    @Override
    public void DeleteFile() {

    }
}
class Windows10Upgraded{  // doesnt support D
    Windows w;
    public Windows10Upgraded(Windows w){
        this.w=w;
    }
    public void functions(){
        w.nameOfOS();
    }
}
public class BeforeModification {
    public static void main(String[] args) {

    }
}
