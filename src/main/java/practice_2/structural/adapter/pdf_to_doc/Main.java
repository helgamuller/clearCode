package practice_2.structural.adapter.pdf_to_doc;
//У нас есть два типа файлов:
//PDF-файл, который должен обрабатываться системой, но она работает только с DOC.
//Необходимо создать адаптер, который позволит работать с файлами обоих форматов, конвертируя их при необходимости.
//Задача — создать интерфейс, который будет принимать файлы с расширением PDF или DOC,
// а также адаптер, который будет конвертировать один формат в другой.
public class Main {
    public static void main(String[] args) {
        FileSystem system =  new FileSystem();
        PdfToDocAdapter adapter = new PdfToDocAdapter("AAA.doc");

        String proccessedFile = system.processFile(adapter.convertToDoc());
        System.out.println(proccessedFile);


    }
}
