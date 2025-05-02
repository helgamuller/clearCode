package practice_2.structural.adapter.pdf_to_doc;

public class FileSystem {

    public String processFile(String file){
       // System.out.println("Doc file is being processed " + file);
        return file+" processed";
    }

    @Override
    public String toString() {
        return "FileSystem{}";
    }
}
