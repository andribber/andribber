import java.util.Scanner;

class Main {
  static Scanner input = new Scanner(System.in);

  //substituir o SOUT
  static void printf(String s) {
    System.out.print(s);
  }

  //função para ler o nome do campeonato
  static String lerNomeCampeonato (){
    String nomeCampeonato;
    printf("Qual o nome do campeonato: ");
    nomeCampeonato = input.nextLine();
    return(nomeCampeonato);

}

  //função para ler o ano do campeonato;
  static int lerAnoCampeonato (){ 
      int ano;
      printf("Qual o ano de realização do campeonato: ");
      ano = Integer.parseInt(input.nextLine());
      return (ano);
  }

  //função para verificar o numero de turnos
  static int verificaTurno(){
    int numeroDeTurnos;
    
    while (true){
      printf("Em quantos turnos o campeonato foi realizado?");
      printf("**APENAS 1 OU 2 TURNOS**\n");
      numeroDeTurnos = Integer.parseInt(input.nextLine());
      System.out.println("----------------------------------");

      if (numeroDeTurnos < 1 || numeroDeTurnos > 2) {
        printf("O número de turnos informado NÃO é válido! \n");
      }
      
      else{
        return numeroDeTurnos;
      }
    }
  }


  //Função para ler o numero de equipes
  static int verificaEquipes(){
    int numeroDeEquipes;
    
    while (true){
        printf("Quantas equipes irão disputar o campeonato? \n");
        printf("**DEVE ESTAR ENTRE 4 E 20 EQUIPES\n");
        numeroDeEquipes = Integer.parseInt(input.nextLine());
        System.out.println("----------------------------------");
        if (numeroDeEquipes < 4 || numeroDeEquipes > 20) {
          printf("O número de equipes informado NÃO é válido! \n");
        }
        else{
          return numeroDeEquipes;
        }
      }
  }

//para cada uma das equipes leia o seu nome e os armazene em um vetor, nao permitindo nomes repetidos deequipes (utilize fun ̧c oes ou procedimentos para isso);

static String[] leNomeEquipe(String[] equipe){
  String nome;
  int control;

  for(int i=0; i<equipe.length; i++){
    equipe[i] = "";
  }

  //lê e verifica se já existe o nome da equipe no vetor
  for (int j=0; j<equipe.length; j++){    
    while (true){
        for (int m=0;m<equipe.length;m++){
          for (int k=0; k<equipe.length; k++) {
            control=0;
            nome = "";
            printf("Digite o nome da "+(m+1)+" equipe ");      
            nome = input.nextLine();
            for (int g=0;g<equipe.length;g++){
              if(nome.equals(equipe[g])){
              control=1;
              }
            }
            if (control==1){
              System.out.println("Já existe uma equipe com esse nome, insira novamente");
            } 
            else {
            equipe[m] = nome;
            break;
            }
          }
      }
      break;
    }
  break;
}
  return(equipe);
}

// Insere a pontuação na tebela
static int[][] criaTabelaDePontos (String [] nomes, int [][] tabela, int turno) {

  int resultado=0;

  if (turno==1){
  for (int i=0; i<nomes.length;i++){
    for (int j=i+1;j<nomes.length;j++){
    System.out.println("Resultado do jogo do(a) " +nomes[i]+ " contra o(a) " +nomes[j]+ ":");
    while (true){
          printf("[Vitória = 2 / Empate = 1 / Derrota = 0] \nResultado do " + j + "ª Jogo : ");
          resultado = Integer.parseInt(input.nextLine());
          System.out.println();
            
          //verifica o valor inserido no resultado
          if (resultado > 2 || resultado < 0) {
            printf("Valor Inválido, digite novamente!!!\n");
            System.out.println("----------------------------------");
         } else {
           //sai do laço
           break;
        }
      }
      switch(resultado){
        case 2: 
          tabela[i][0] += 1; //0123
          tabela[i][3] += 3;
          tabela[j][1] += 1;
          break;
        case 1: 
          tabela[i][2] += 1;
          tabela[j][2] += 1;
          tabela[i][3] += 1;
          tabela[j][3] += 1;
          break;
        case 0: 
          tabela[i][1] += 1;
          tabela[j][0] += 1;
          tabela[j][3] += 3;
          break;
      }
    }
  }
} 

else {

    System.out.println("JOGOS DO PRIMEIRO TURNO");
    for (int i=0; i<nomes.length;i++){
    for (int j=i+1;j<nomes.length;j++){
    System.out.println("Resultado do jogo do(a) " +nomes[i]+ " contra o(a) " +nomes[j]+ ":");
    while (true){
          printf("[Vitória = 2 / Empate = 1 / Derrota = 0] \nResultado do " + j + "ª Jogo : ");
          resultado = Integer.parseInt(input.nextLine());
          System.out.println();
            
          //verifica o valor inserido no resultado
          if (resultado > 2 || resultado < 0) {
            printf("Valor Inválido, digite novamente!!!\n");
            System.out.println("----------------------------------");
         } else {
           //sai do laço
           break;
        }
      }
      switch(resultado){
        case 2: 
          tabela[i][0] += 1; //0123
          tabela[i][3] += 3;
          tabela[j][1] += 1;
          break;
        case 1: 
          tabela[i][2] += 1;
          tabela[j][2] += 1;
          tabela[i][3] += 1;
          tabela[j][3] += 1;
          break;
        case 0: 
          tabela[i][1] += 1;
          tabela[j][0] += 1;
          tabela[j][3] += 3;
          break;
      }
    }
  }

  System.out.println("JOGOS DO SEGUNDO TURNO");

    for (int i=0; i<nomes.length;i++){
    for (int j=i+1;j<nomes.length;j++){
    System.out.println("Resultado do jogo do(a) " +nomes[i]+ " contra o(a) " +nomes[j]+ ":");
    while (true){
          printf("[Vitória = 2 / Empate = 1 / Derrota = 0] \nResultado do " + j + "ª Jogo : ");
          resultado = Integer.parseInt(input.nextLine());
          System.out.println();
            
          //verifica o valor inserido no resultado
          if (resultado > 2 || resultado < 0) {
            printf("Valor Inválido, digite novamente!!!\n");
            System.out.println("----------------------------------");
         } else {
           //sai do laço
           break;
        }
      }
      switch(resultado){
        case 2: 
          tabela[i][0] += 1; //0123
          tabela[i][3] += 3;
          tabela[j][1] += 1;
          break;
        case 1: 
          tabela[i][2] += 1;
          tabela[j][2] += 1;
          tabela[i][3] += 1;
          tabela[j][3] += 1;
          break;
        case 0: 
          tabela[i][1] += 1;
          tabela[j][0] += 1;
          tabela[j][3] += 3;
          break;
      }
    }
  }

}
  return (tabela);
}

  // Imprime a tebela e o resultado na tela
  static void tabela(String[] nomeEquipe, int[][] pontEquipe, String nome, int ano){
    int vencedor = 0, vencedorPt = 0, perdedor = 0, perdedorPt = Integer.MAX_VALUE;
    System.out.println("Campeonato:  " + nome + " " + ano);
    System.out.println("------------------------------------");
    System.out.println("TIME                 | V | D | E | P");
    System.out.println("------------------------------------");
    for(int i=0; i<pontEquipe.length; i++){

      System.out.printf("%-20s | %1d | %1d | %1d | %1d \n", nomeEquipe[i], pontEquipe[i][0],pontEquipe[i][1], pontEquipe[i][2], pontEquipe[i][3]);
      
      if(pontEquipe[i][3] > vencedorPt){
        vencedor = i;
        vencedorPt = pontEquipe[i][3];
      }
      if(pontEquipe[i][3] < perdedorPt){
        perdedor = i;
        perdedorPt = pontEquipe[i][3];
      }
    }
    System.out.println("------------------------------------");
    System.out.println("O CAMPEÃO DO CAMPEONATO FOI " + nomeEquipe[vencedor] + " COM " + pontEquipe[vencedor][3] + " Pontos.");
    System.out.println("O ULTIMO COLOCADO DO CAMPEONATO FOI " + nomeEquipe[perdedor] + " COM " + pontEquipe[perdedor][3] + " Pontos.");
  }


  public static void main(String[] args) {

    //variáveis
    String nomeCamp;
    String[] nomeEquipe;
    int ano, numEquipe = 0, numTurn = 0;
    int[][] pontEquipe;

    printf("Bem vindo ao FUTEMAX RESULTADOS \nEsse programa irá fazer uma tabela de campeonato de futebol, e mostrar o campeão e o perdedor. \n");
    printf("Desenvolvido por André Ribeiro\n");
    System.out.println("----------------------------------");



    //chama funções
    nomeCamp = lerNomeCampeonato();
    ano = lerAnoCampeonato();
    numEquipe = verificaEquipes();     
    numTurn = verificaTurno();
    nomeEquipe = new String[numEquipe];
    pontEquipe = new int[numEquipe][4]; //0 vitoria - 1 derrota - 2 empate - 3 pontuacao

    

    nomeEquipe = leNomeEquipe(nomeEquipe);

    pontEquipe = criaTabelaDePontos(nomeEquipe, pontEquipe, numTurn);

    tabela(nomeEquipe, pontEquipe, nomeCamp, ano);
  }
}
