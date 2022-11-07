import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Contato> contatoList = new ArrayList<>();
        Contato contato1 = new Contato("João Victor Rossi", "jvrossi10@gmail.com", 21985863456L);
        contatoList.add(contato1);
        Contato contato2 = new Contato("Gabriel Henrique", "gabrielHenrique@gmail.com", 11985476345L);
        contatoList.add(contato2);
        Contato contato3 = new Contato("Natali de Souza", "nataliDeSouza@gmail.com", 17987645231L);
        contatoList.add(contato3);

        FileOutputStream fileOutputStream = null;

        try{
            fileOutputStream = new FileOutputStream("ContatoOutputFile.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contatoList);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Contato> contatoList2 = null;
        FileInputStream fileInputStream = null; //serve para buscar os arquivos serializados

        try{
            fileInputStream = new FileInputStream("ContatoOutputFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            contatoList2 = (List<Contato>)objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        
        for(Contato contato:contatoList2){
            System.out.println(contato.getNome() + " - " + contato.getEmail() + " - " + contato.getTelefone());
        }

    }
}