import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class Persistencia {

private String filename;

public Persistencia(String filename){
    this.filename=filename;
}

public void serialize(List l){
    try{
        FileOutputStream fo = new FileOutputStream("cde.tmp");
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(l);
        so.flush();
        so.close();
        fo.close();
        System.out.println("Serialized data is saved in "+filename);
    }catch(IOException i){
        i.printStackTrace();
        System.exit(1);
    }
}

public void deserialize(){
    try {
        FileOutputStream fileOut = new FileOutputStream("cde.tmp");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        List l = (CustomDataExample) out.readObject();
        out.close();
    } catch (Exception e){
        e.printStackTrace();
        System.exit(1);
    }

}


}
