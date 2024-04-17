package relogio;

public class TestaRelogio {
    public static void main(String[] args){
     Relogio r = new Relogio(7, 58, 00);
        System.out.println(r.hora + ":" + r.minuto + ":" + r.segundo);
        r.passaMinuto();
        System.out.println(r.hora + ":" + r.minuto + ":" + r.segundo);
        r.passaMinuto(); 
        System.out.println(r.hora + ":" + r.minuto + ":" + r.segundo);
    }
}
