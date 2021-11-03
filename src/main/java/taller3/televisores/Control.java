
package taller3.televisores;


public class Control {

    private TV tv;
    
    public void enlazar(TV tv){
        
        this.tv = tv;
        tv.setControl(this);
        
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
    
    public void turnOn(){
        tv.turnOn();
    }
    public void turnOff(){
        tv.turnOff();
    }
    
    public void canalUp(){
        if(tv.getEstado()){
            tv.canalUp();
        }
    }
    public void canalDown(){
        if(tv.getEstado()){
            tv.canalDown();
        }
    }
    
    public void volumenUp(){
        if(tv.getEstado()){
            tv.volumenUp();
        }
        }
    public void volumenDown(){
        if(tv.getEstado()){
            tv.volumenDown();
        }
    }
    public void setCanal(int canal) {
        if(tv.getEstado()){
            if(canal>=1 && canal<=120){
            tv.setCanal(canal);
        }
            
        }
    }
    
}
