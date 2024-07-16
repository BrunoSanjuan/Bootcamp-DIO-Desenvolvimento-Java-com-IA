public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "BRUNO", "ADRIELE", "PHELIPE", "ANTHONY", "MAISA" };

        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indíce x = " + x + " é " + alunos[x]);
        }
    }
}
