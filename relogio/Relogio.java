package relogio;
public class Relogio {
    int hora, minuto, segundo;
    Relogio(int h, int m, int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }
    
    void setMinuto(int m){
        if(m >= 0 && m <= 59) 
            this.minuto = m;
        else 
            this.minuto = 0;
    }
    void setHora(int h){
        if(h >= 0 && h <= 23) 
            this.hora = h;
        else 
            this.hora = 0;
    }
    void setSegundo(int s ){
        if(s >= 0 && s <= 59) 
            this.segundo = s;
        else 
            this.segundo = 0;   
    }
    void passaHora(){
        if(this.hora == 23)
            this.hora = 0;
        else
            this.hora ++;
    }
    void passaMinuto(){
        
        if (this.minuto == 59){
            this.minuto = 0;
            passaHora();
    }
    else this.minuto++;
}
    void passaSegundo(){

        if (this.segundo == 59){
            this.segundo = 0;
            passaMinuto();
        }
        else this.segundo++;
    }
}

