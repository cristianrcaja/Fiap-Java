package listas;

public class RevisaoVetor {
    public static void main(String[] args) {

        //Conjunto de N elementos do mesmo tipo
        String[] alunos = new String[5];

        alunos[0] = "Eliane";
        alunos[1] = "Ana";
        alunos[2] = "Enzo";
        alunos[3] = "Murilo";
        alunos[4] = "Pamela";

        System.out.println("Lista de Alunos: ");
        for (int i = 0; i < alunos.length ; i++) {
            System.out.println(i + 1 + "º" + alunos[i]);
        }
    }
}