package practice_2.structural.adapter.pdf_to_doc;

public class PdfToDocAdapter {
   String file;

   public PdfToDocAdapter(String file){
       this.file = file;
   }

   public String convertToDoc(){
       if(file.endsWith("pdf")){
           file = "DOC_"+file;
       }
       return file;
   }

    @Override
    public String toString() {
        return "PdfToDocAdapter{" +
                "file='" + file + '\'' +
                '}';
    }
}
