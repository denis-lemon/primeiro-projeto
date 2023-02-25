public class Jogador {
  private String nome;
  private int xp = 100;
  private int hp = 100;
  private boolean envenenado = false;

  public Jogador(){

  }

  public void recebDano(int ponto){
    this.hp = ponto;
    if (hp == 0){
      System.out.println("GAMEOVER!! SEU PORRA.");
    }
  }

  public void recebCura(int ponto){
    this.hp += ponto;
  }

  public void ganhaExperience(int ponto){
    this.xp += ponto;
  }

  public void recebAntidoto(){
    envenenado = !envenenado;
  }

  public Jogador (String nome){
    this.nome = nome;
  }

  public int getXp(){
    return xp;
  }

  public int getHp(){
    return hp;
  }

  public String getNome() {
    return nome;
  }

  public boolean isEnvenenado() {
    return envenenado;
  }
}