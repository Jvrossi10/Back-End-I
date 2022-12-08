import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro = new Cachorro("Pluto",5);
        Cachorro cachorro1 = new Cachorro("Snoop",6);

        cachorros.add(cachorro);
        cachorros.add(cachorro1);

        //vamos salvar toda a coleção dentro de um arquivo
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("OutputFile.txt");//nome do arquivo que vou salvar as minhas informações
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);//dentro dele que vou criar os objetos para salvar no arquivo
            objectOutputStream.writeObject(cachorros);//agora eu vou escrever no arquivo
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Recuperando toda a coleção com cada uma das páginas do arquivo
        List<Cachorro> cachorro2 = null;
        FileInputStream fileInputStream = null;//serve para buscar os arquivos serializados

        try{
            fileInputStream = new FileInputStream("OutputFile.txt");//passo o nome do arquivo que eu quero buscar
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            cachorro2 = (ArrayList) objectInputStream.readObject();//convertendo o nosso objeto em um arrayList de cachorro2
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for(Cachorro cachorro22:cachorro2){
            System.out.println(cachorro22.getNome()+" : "+cachorro22.getIdade());
        }

    }
}
