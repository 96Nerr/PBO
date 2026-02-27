class TV {

    //atributnya
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;    

    //contructornya
    public TV() {

    }

    //nyalain tv
    public void turnOn() {
        on = true;
    }

    //matiin tv
    public void turnOff(){
        on = false;
    }

    //set channel
    public void setChannel (){


    }

    //set volume
    public void setVolume(){

    }

    //naikin channel
    public void channelUp(){
        if (on && channel < 120){
            channel++;
        }
    }

    //turun channel
    public void channelDown(){
        if (on && channel > 1){
            channel--;
        }
    }

    //naikin volume
    public void volumeUp(){
        if (on && volumeLevel < 7){
            volumeLevel++;

        }
    }

    //turunin volume
    public void volumeDown(){
        if (on && volumeLevel > 1){
            volumeLevel--;
        }
    }
    
}

