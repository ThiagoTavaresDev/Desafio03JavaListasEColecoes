//Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada elemento da lista.

public class Strings {
    String s1;
    String s2;
    String s3;
    public Strings(String s1, String s2, String s3){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public String toString() {
        return "Strings{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                '}';
    }
}
